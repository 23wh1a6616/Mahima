import tkinter as tk
from tkinter import scrolledtext, filedialog
from sentence_transformers import SentenceTransformer
from sklearn.metrics.pairwise import cosine_similarity
from docx import Document  # Add this for reading .docx files

# Initialize the model for sentence embeddings
model = SentenceTransformer('all-MiniLM-L6-v2')

# A placeholder for document content and embeddings
document_content = []
document_embeddings = []

# Function to read content from a .docx file
def load_document():
    global document_content, document_embeddings
    file_path = filedialog.askopenfilename(filetypes=[("Word files", "*.docx")])

    if file_path:
        # Read the .docx file
        document = Document(file_path)
        document_content = []
       
        for para in document.paragraphs:
            # Split the paragraph into sentences (basic split, can be enhanced)
            document_content.extend(para.text.split('. '))
       
        # Embed the content of the document
        document_embeddings = model.encode(document_content)

        # Inform the user that the document was loaded
        chat_window.config(state=tk.NORMAL)
        chat_window.insert(tk.END, f"Document loaded successfully!\n\n")
        chat_window.config(state=tk.DISABLED)
        print(f"Document loaded from {file_path}")

# Function to get the most relevant response based on the user's input
def get_response():
    user_query = user_input.get()
   
    if not document_content:
        chat_window.config(state=tk.NORMAL)
        chat_window.insert(tk.END, "Please load a document first!\n\n")
        chat_window.config(state=tk.DISABLED)
        return
   
    # Convert the user's query into an embedding
    query_embedding = model.encode([user_query])
   
    # Compare the query with document content using cosine similarity
    similarities = cosine_similarity(query_embedding, document_embeddings)
   
    # Find the index of the most relevant sentence from the document
    best_match_idx = similarities.argmax()
    bot_response = document_content[best_match_idx]
   
    # Update the chat window with the user's query and the bot's response
    chat_window.config(state=tk.NORMAL)
    chat_window.insert(tk.END, f"You: {user_query}\n")
    chat_window.insert(tk.END, f" {bot_response}\n\n")
    chat_window.config(state=tk.DISABLED)
   
    # Scroll to the bottom to see the latest messages
    chat_window.yview(tk.END)
   
    # Clear the input field for the next query
    user_input.delete(0, tk.END)

# Create the main window
root = tk.Tk()
root.config(bg="black")
root.title("Document-Based AI Chatbot")

# Create the chat window (ScrolledText widget)
chat_window = scrolledtext.ScrolledText(root, width=50, height=25, wrap=tk.WORD, state=tk.DISABLED)
chat_window.grid(row=0, column=0, padx=50, pady=25)

# Create the user input field
user_input = tk.Entry(root, width=50)
user_input.grid(row=1, column=0, padx=50, pady=25)

# Create the send button
send_button = tk.Button(root, text=">>", width=5, command=get_response)
send_button.grid(row=2, column=0, padx=10, pady=10)

# Create the load document button
load_button = tk.Button(root, text="Load Document", width=20, command=load_document)
load_button.grid(row=3, column=0, padx=30, pady=30)

# Start the Tkinter event loop
root.mainloop()