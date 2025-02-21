package com.github.LeilaM99.TicTacToe;

public class Checker {
    private Player currentPlayer;

    public Checker(Player startingPlayer) {
        this.currentPlayer = startingPlayer;
    }

    public Checker(){

    }

    public void switchPlayer(Player player1, Player player2) {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public boolean checkWin(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer.getSymbol() && board[i][1] == currentPlayer.getSymbol() && board[i][2] == currentPlayer.getSymbol()) ||
                    (board[0][i] == currentPlayer.getSymbol() && board[1][i] == currentPlayer.getSymbol() && board[2][i] == currentPlayer.getSymbol())) {
                return true;
            }
        }
        return (board[0][0] == currentPlayer.getSymbol() && board[1][1] == currentPlayer.getSymbol() && board[2][2] == currentPlayer.getSymbol()) ||
                (board[0][2] == currentPlayer.getSymbol() && board[1][1] == currentPlayer.getSymbol() && board[2][0] == currentPlayer.getSymbol());
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
}
