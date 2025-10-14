# 🎮 Java Mini Projects Collection

This repository contains two simple yet interactive Java programs:
1. **Snake Game** – a GUI-based game built using **Java Swing**.  
2. **Basic Calculator** – a console-based calculator using **switch-case** and **exception handling**.

---

## Snake Game (Java Swing)

### 📘 Description
A classic **Snake Game** implemented using **Java AWT** and **Swing** libraries.  
The player controls a snake that moves across the grid, eats food, and grows in length.  
The game ends when the snake collides with the wall or itself.

### 🧩 Features
- 🕹️ Arrow key controls (Up, Down, Left, Right).  
- 🍎 Random food generation after each consumption.  
- 🧠 Collision detection for both walls and the snake’s own body.  
- ⏱️ Adjustable game speed using a timer.  
- 💀 Displays **Game Over** and **Score** when the player loses.  
- 🎨 Simple grid-based graphics using `paintComponent()` and `Graphics`.

### ⚙️ Technologies Used
- **Language:** Java  
- **GUI:** Swing & AWT (`JFrame`, `JPanel`, `Graphics`, `Timer`)  
- **Core Concepts:** OOP, Event Handling (`KeyListener`, `ActionListener`)

### 🕹️ How to Run
1. Copy the `SnakeGame.java` file into your Java project or folder.  
2. Compile the program:
   ```bash
   javac SnakeGame.java
3. Run the program:
   ```bash
   java SnakeGame

Use the arrow keys to move the snake and try to survive as long as possible!

# Basic Calculator (Java Console Program)

A simple **Java-based calculator** that performs arithmetic operations like addition, subtraction, and division based on user input.  
This project demonstrates the use of **switch-case statements** and **exception handling** in Java.

---

## 📘 Overview

The calculator takes two integer inputs and an operator (`+`, `-`, `/`) from the user, performs the corresponding arithmetic operation, and prints the result.  
It also handles common runtime errors such as division by zero and invalid inputs using **try-catch** blocks.

---

## ⚙️ Technologies Used

- **Language:** Java  
- **Concepts Demonstrated:**
  - Switch-case control structure  
  - Exception handling (`try-catch`)  
  - User input handling via `Scanner` class  

---

Displays clear error messages when exceptions occur.
