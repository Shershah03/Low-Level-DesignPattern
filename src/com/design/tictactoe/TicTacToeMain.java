package com.design.tictactoe;

public class TicTacToeMain {

	public static void main(String[] args) {
		TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        System.out.println("game winner is: " + game.startGame());

	}

}
