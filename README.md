Projects
1. Calculator (Java)
A simple console-based calculator application implemented in Java. The calculator performs basic arithmetic operations such as addition, subtraction, multiplication, and division.

Features:
Supports basic arithmetic operations: Addition, Subtraction, Multiplication, and Division.
Allows users to input two operands and choose an operation.
Performs basic input validation to ensure correct arithmetic operations.
Requirements:
Java Development Kit (JDK) 8 or later.
How to Run:
Clone or download the repository.

Open your terminal or command prompt.

Navigate to the project folder.

Compile the program with:

javac Calculator.java
Run the program with:


java Calculator
Example Usage:

Enter first number: 5
Enter an operator (+, -, *, /): +
Enter second number: 10
Result: 15.0
Code Explanation:
The program uses conditional statements (if, else if) or a switch-case structure to determine the arithmetic operation based on user input.
The result is printed to the console.

2. Snake Game (Java)
A graphical Snake game implemented using Java's Swing library. The player controls a snake that grows longer as it eats food. The game ends if the snake hits the wall or its own body.

Features:
Classic Snake game mechanics.
Snake grows longer as it eats food.
Game over condition when the snake hits the walls or itself.
The score is displayed during the game.
Requirements:
Java Development Kit (JDK) 8 or later.
Java Swing library (comes pre-packaged with JDK).
How to Run:
Clone or download the repository.

Open your terminal or command prompt.

Navigate to the project folder.

Compile the program with:

javac SnakeGame.java
Run the game with:


java SnakeGame
Game Controls:
Use the arrow keys (Up, Down, Left, Right) to control the direction of the snake.

3. Vector Embeddings Chatbot (Python)
This project implements a chatbot that uses vector embeddings to find the similarity between user queries and documents. It uses the Sentence-BERT model to generate embeddings and retrieve the most relevant response based on the user's query.

Features:
Allows document upload and querying using natural language.
Utilizes Sentence-BERT to calculate similarity between the user's query and the uploaded document.
Displays the most relevant answer based on the similarity.
Simple GUI interface for easy interaction with the chatbot.
Requirements:
Python 3.x
Libraries:
sentence-transformers (for the Sentence-BERT model)
tkinter (for the GUI interface)
How to Run:
Clone or download the repository.

Install the required libraries:

pip install sentence-transformers tkinter
Run the Python program:

python chatbot.py
Example Usage:
Upload a document (e.g., a research paper).
Type a query (e.g., "What is the main topic of the document?").
The chatbot will return the most relevant part of the document based on the similarity with your query.
Code Explanation:
The Sentence-BERT model generates embeddings for both the user's query and the uploaded document.
Cosine similarity is calculated to find the most relevant portion of the document.
The results are displayed through the tkinter GUI interface
