package com.design.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Board {
	int size;
	PlayingPiece [][] board;
	public Board(int size) {
		super();
		this.size = size;
		this.board = new PlayingPiece[size][size];
	}
	
	 public void printBoard() {

	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                if (board[i][j] != null) {
	                   System.out.print(board[i][j].pieceType.name() + "   ");
	                } else {
	                    System.out.print("    ");

	                }
	                System.out.print(" | ");
	            }
	            System.out.println();

	        }
	    }

	public List<int[]> getFreeCells() {
		List<int[]> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    int[] rowColumn = new int[] {i, j};
                    freeCells.add(rowColumn);
                }
            }
        }

        return freeCells;
	}
	public boolean addPiece(int row, int column, PlayingPiece playingPiece) {

        if(board[row][column] != null) {
            return false;
        }
        board[row][column] = playingPiece;
        return true;

	}
	
	
	
	
	
}
