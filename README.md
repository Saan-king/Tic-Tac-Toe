# Tic Tac Toe

This is a simple implementation of the Tic Tac Toe game in Java. It allows two human players to play against each other on a 3x3 board. The game utilizes the backtracking algorithm to check for winning moves.

## Getting Started

To run the game locally on your machine, follow these steps:

1. Make sure you have Java installed on your system.
2. Clone this repository to your local machine or download the source code as a ZIP file.
3. Open a terminal or command prompt and navigate to the project directory.
4. Compile the Java file by running the following command: javac TicTacToe.java
5. Run the game using the following command: java TicTacToe
 
6. Follow the instructions displayed on the console to play the game.

## How to Play

The game will prompt the players to enter their moves by specifying the row and column numbers (0-2) on the board. The board will be displayed after each move. The game continues until there is a winner or a draw.

## Sample Code Explanation

The code includes the following key components:

- `initializeBoard()`: Initializes the game board with empty cells.
- `printBoard()`: Displays the current state of the game board.
- `isBoardFull()`: Checks if the board is completely filled with moves.
- `isWinningMove(int row, int col)`: Checks if the last move made at `(row, col)` results in a win.
- `makeMove(int row, int col)`: Makes a move for the current player at `(row, col)` if the move is valid.
- `switchPlayer()`: Switches the current player after a move is made.
- `play()`: Handles the game flow, prompting players for their moves and checking for wins or draws.
- `main()`: Entry point of the program that creates an instance of the `TicTacToe` class and starts the game.

## Sample game


![image](https://github.com/Saan-king/Tic-Tac-Toe/assets/58635762/3c28367b-c353-4e53-ae34-ac41ec8e5a0f)
![image](https://github.com/Saan-king/Tic-Tac-Toe/assets/58635762/1649df70-a4e9-4fdf-bd74-1a94a8819ac4)
![image](https://github.com/Saan-king/Tic-Tac-Toe/assets/58635762/589a4b2f-3ea2-4890-af9e-1ab8df29333b)

### Contributions

Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.
