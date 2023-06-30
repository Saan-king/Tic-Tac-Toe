import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 3;
    private static final char EMPTY_CELL = '-';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';

    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[SIZE][SIZE];
        currentPlayer = PLAYER_X;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                board[row][col] = EMPTY_CELL;
            }
        }
    }

    private void printBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private boolean isBoardFull() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == EMPTY_CELL) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isWinningMove(int row, int col) {
        // Check row
        if (board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
            return true;
        }
        
        // Check column
        if (board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
            return true;
        }
        
        // Check diagonals
        if (row == col) {
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
                return true;
            }
        }
        
        if (row + col == SIZE - 1) {
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                return true;
            }
        }
        
        return false;
    }

    private boolean makeMove(int row, int col) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE || board[row][col] != EMPTY_CELL) {
            return false;
        }

        board[row][col] = currentPlayer;
        return true;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameFinished = false;

        System.out.println("Tic Tac Toe");
        System.out.println("Enter row and column numbers (0-2) to make a move.");

        while (!gameFinished) {
            System.out.println("Current board:");
            printBoard();

            System.out.println("Player " + currentPlayer + ", enter row:");
            int row = scanner.nextInt();
            
            System.out.println("Player " + currentPlayer + ", enter column:");
            int col = scanner.nextInt();
            
            if (makeMove(row, col)) {
                if (isWinningMove(row, col)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameFinished = true;
                } else if (isBoardFull()) {
                    System.out.println("It's a draw!");
                    gameFinished = true;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        System.out.println("Final board:");
        printBoard();
        scanner.close();
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
