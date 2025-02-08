package com.github.LeilaM99.TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for Player 1 (X): ");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1, 'X');

        System.out.print("Enter name for Player 2 (O): ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2, 'O');

        TicTacToe game = new TicTacToe(player1, player2);
        game.playGame();

    }

}