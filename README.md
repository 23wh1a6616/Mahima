Projects
1. Calculator (Java)
📌 Overview
A simple console-based calculator application implemented in Java. The calculator allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division.

🚀 Features:
Supports basic arithmetic operations: Addition, Subtraction, Multiplication, and Division.
Allows users to input two operands and choose the operation.
Performs basic input validation to ensure correct arithmetic operations.
🛠️ Requirements:
Java Development Kit (JDK) 8 or later.
📥 How to Run:
Clone or download the repository.
Open your terminal or command prompt.
Navigate to the project folder.
Compile the program with:
bash
Copy
javac Calculator.java
Run the program with:
bash
Copy
java Calculator
Example Usage:
sql
Copy
Enter first number: 5
Enter an operator (+, -, *, /): +
Enter second number: 10
Result: 15.0
Code Explanation:
The program uses conditional statements (if, else if) or a switch-case structure to determine the arithmetic operation based on user input.
The result is printed to the console.
2. Snake Game (Java)
📌 Overview
A graphical Snake game built using Java’s Swing library. The player controls a snake that grows longer as it eats food. The objective is to avoid hitting walls or the snake’s own body.

🚀 Features:
Classic Snake game mechanics.
Snake grows longer as it eats food.
Game over when the snake hits the walls or itself.
Score is displayed during the game.
🛠️ Requirements:
Java Development Kit (JDK) 8 or later.
Java Swing library (comes pre-packaged with JDK).
📥 How to Run:
Clone or download the repository.
Open your terminal or command prompt.
Navigate to the project folder.
Compile the program with:
bash
Copy
javac SnakeGame.java
Run the game with:
bash
Copy
java SnakeGame
🎮 Game Controls:
Use the arrow keys (Up, Down, Left, Right) to control the direction of the snake.
3. Vector Embeddings Chatbot (Python)
📌 Overview
This project implements a chatbot that uses vector embeddings to find the similarity between user queries and documents. It leverages the Sentence-BERT model for generating embeddings and uses them to retrieve the most relevant response based on the user's query.

🚀 Features:
Upload a document and query it using natural language.
Utilizes Sentence-BERT to calculate similarity between the uploaded document and the query.
Displays the most relevant answer from the document.
Simple GUI interface for user interaction.
🛠️ Requirements:
Python 3.x
Libraries:
sentence-transformers (for Sentence-BERT model)
tkinter (for GUI interface)
📥 How to Run:
Clone or download the repository.
Install the required libraries:
bash
Copy
pip install sentence-transformers tkinter
Run the Python program:
bash
Copy
python chatbot.py
Example Usage:
Upload a document (e.g., a research paper).
Type a query (e.g., "What is the main topic of the document?").
The chatbot will return the most relevant part of the document based on the similarity with your query.
Code Explanation:
The Sentence-BERT model is used to generate embeddings for both the document and the user's query.
Cosine similarity is calculated to find the most relevant portion of the document.
The results are displayed through the tkinter GUI interface.





