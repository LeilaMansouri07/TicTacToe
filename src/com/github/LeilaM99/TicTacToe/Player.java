package com.github.LeilaM99.TicTacToe;

public class Player {

    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public Player() {

    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}
