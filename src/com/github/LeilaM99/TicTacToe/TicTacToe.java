package com.github.LeilaM99.TicTacToe;
import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private Player player1;
    private Player player2;
    private Checker checker;

    public TicTacToe() {

    }

    public TicTacToe(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.checker = new Checker(player1); // Player 1 starts first
        initilizeBoard();

    }

    private void initilizeBoard() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';

            }
        }
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    private void printBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            System.out.println("-----");
        }
    }


    public void playGame() {
        boolean gameWon = false;
        int turns = 0;

        while (gameWon==false && turns < 9) {
            printBoard();
            int row, col;
            do {
                System.out.print(checker.getCurrentPlayer().getName() + ", enter your move (row and column(1-3)): ");
                Scanner scanner = new Scanner(System.in);
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            } while (isValidMove(row, col)==false);

            board[row][col] = checker.getCurrentPlayer().getSymbol();
            gameWon = checker.checkWin(board);
            turns++;
            checker.switchPlayer(player1, player2); // Switch players
        }

        printBoard();
        if (gameWon) {
            System.out.println("Congratulations " + (checker.getCurrentPlayer() == player1 ? player2.getName() : player1.getName()) + ", you win!");
        } else {
            System.out.println("It's a draw!");
        }
    }


}





