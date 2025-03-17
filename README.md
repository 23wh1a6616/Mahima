1. Calculator (Implemented in Java)
Project Overview:
This is a simple console-based calculator application implemented in Java. The calculator allows users to perform basic arithmetic operations, such as addition, subtraction, multiplication, and division. The program takes user input for numbers and the desired operation and displays the result.

Features:
Supports basic arithmetic operations: Addition, Subtraction, Multiplication, and Division.
Allows users to enter two operands and choose the operation.
Handles basic input validation to ensure correct arithmetic operations.
Requirements:
Java Development Kit (JDK) 8 or later.
How to Run:
Download or clone the repository.
Open the terminal/command prompt.
Navigate to the project folder.

Compile the Java program using:
javac Calculator.java

Run the program using:
java Calculator

Example:
Enter first number: 5
Enter an operator (+, -, *, /): +
Enter second number: 10
Result: 15.0
Code Explanation:
The program uses conditional statements (if, else if) or a switch-case structure to determine the arithmetic operation based on user input.
The result is then printed to the console.

2. Snake Game (Implemented in Java)
Project Overview:
This is a graphical Snake game built using Java’s Swing library. The player controls a snake that grows longer as it eats food. The objective is to avoid hitting walls or the snake’s own body.

Features:
Classic Snake game mechanics.
Snake grows longer as it eats food.
Game over when the snake hits the walls or itself.
Score is displayed during the game.
Requirements:
Java Development Kit (JDK) 8 or later.
Java Swing library (comes pre-packaged with JDK).
How to Run:
Download or clone the repository.
Open the terminal/command prompt.
Navigate to the project folder.

Compile the Java program using:
javac SnakeGame.java

Run the game using:

java SnakeGame
Game Controls:
Use arrow keys (Up, Down, Left, Right) to control the direction of the snake.
Example:
Upon running, a window opens with the Snake game. The player can use the arrow keys to control the snake and try to eat food that appears randomly on the screen.

3. Vector Embeddings Chatbot (Implemented in Python using GUI Interface)
Project Overview:
This project implements a chatbot that uses vector embeddings to find the similarity between user queries and documents. The chatbot leverages the Sentence-BERT model for generating embeddings and uses them to retrieve the most relevant response based on the query. The user can upload a document and interact with the chatbot through a GUI.

Features:
Upload a document and query it using natural language.
Utilizes Sentence-BERT to find the similarity between the uploaded document and the query.
Displays the most relevant answer from the document.
Provides a simple GUI for user interaction.
Requirements:
Python 3.x
Libraries:
sentence-transformers (for Sentence-BERT model)
tkinter (for GUI interface)

Example:
Upload a document (e.g., a research paper).
Type a query (e.g., "What is the main topic of the document?").
The chatbot will process the query and return the most relevant part of the document based on the similarity with the query.
Code Explanation:
The Sentence-BERT model is used to generate embeddings for the document and the user's query.
Cosine similarity is calculated between the query embedding and document embeddings to find the most relevant response.
The results are displayed via the GUI interface using tkinter.
