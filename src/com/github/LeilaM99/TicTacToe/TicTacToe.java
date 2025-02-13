package com.github.LeilaM99.TicTacToe;
import java.util.Scanner;

public class TicTacToe {

        private char[][] board;
        private Player player1;
        private Player player2;
        private Player currentPlayer;

        public TicTacToe(Player player1, Player player2) {
            this.board = new char[3][3];
            this.player1 = player1;
            this.player2 = player2;
            this.currentPlayer = player1;
            initializeBoard();
        }

        public void initializeBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = ' ';
                }
            }
        }

        public void printBoard() {
            System.out.println("Current Board:");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.println();
        }

        public boolean makeMove(int row, int col) {
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer.getSymbol();
                return true;
            }
            return false;
        }

        public boolean checkWin() {
            char symbol = currentPlayer.getSymbol();

            for (int i = 0; i < 3; i++) {
                if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                        (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                    return true;
                }
            }

            if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                    (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
                return true;
            }
            return false;
        }

        public void switchPlayer() {
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }

        public void playGame() {
            Scanner scanner = new Scanner(System.in);
            int moves = 0;

            while (moves < 9) {
                printBoard();
                System.out.println(currentPlayer.getName() + ", it's your turn. Enter row and column (0, 1, or 2):");
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                if (makeMove(row, col)) {
                    moves++;
                    if (checkWin()) {
                        printBoard();
                        System.out.println(currentPlayer.getName() + " wins!");
                        return;
                    }
                    switchPlayer();
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }
            printBoard();
            System.out.println("It's a draw!");
        }

}



