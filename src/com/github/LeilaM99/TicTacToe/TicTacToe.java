package com.github.LeilaM99.TicTacToe;
import java.util.Scanner;

public class TicTacToe {

    char[][] board;
    char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    public void initializeBoard(TicTacToe this) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.board[i][j] = '?';
            }
        }
    }

    public void printBoard(TicTacToe this) {
        System.out.println("Current board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.board[i][j] + "    ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public boolean isBoardFull(TicTacToe this) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.board[i][j] == '?') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkForWin(TicTacToe this) {
        for (int i = 0; i < 3; i++) {
            if (this.board[i][0] == this.currentPlayer && this.board[i][1] == this.currentPlayer && this.board[i][2] == this.currentPlayer) {
                return true;
            }
            if (this.board[0][i] == this.currentPlayer && this.board[1][i] == this.currentPlayer && this.board[2][i] == this.currentPlayer) {
                return true;
            }
        }
        if (this.board[0][0] == this.currentPlayer && this.board[1][1] == this.currentPlayer && this.board[2][2] == this.currentPlayer) {
            return true;
        }
        if (this.board[0][2] == this.currentPlayer && this.board[1][1] == this.currentPlayer && this.board[2][0] == this.currentPlayer) {
            return true;
        }
        return false;
    }

    public void changePlayer(TicTacToe this) {
        if (this.currentPlayer == 'X') {
            this.currentPlayer = 'O';
        } else {
            this.currentPlayer = 'X';
        }
    }

    public void playGame(TicTacToe this) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            System.out.println("Player " + this.currentPlayer + ", enter your move between 0-3 (first row and then enter column in the next line): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && this.board[row][col] == '?') {
                this.board[row][col] = this.currentPlayer;

                if (checkForWin()) {
                    printBoard();
                    System.out.println("Player " + this.currentPlayer + " wins!");
                    break;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("The game is a draw!");
                    break;
                }

                changePlayer();
            } else {
                System.out.println("This move is Wrong. Try again please.");
            }
        }

    }

}



