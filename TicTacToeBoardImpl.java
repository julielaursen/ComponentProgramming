package tictactoe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TicTacToeBoardImpl implements TicTacToeBoard {
	
//test changing no move to any invalid negative number
	protected static final int NO_MOVE = -1;
	//when you search through a movearray looking for an integer, no match is used here
	protected static final int NO_MATCH = -1;

	protected int[] moveArray;
	
	private Set<Integer> Xset = new HashSet<>();
	private Set<Integer> Oset = new HashSet<>();
	private Mark nextMove = Mark.X;
	private boolean end_moves = false;

	
	public TicTacToeBoardImpl() {
		final int CELL_COUNT = ROW_COUNT * COLUMN_COUNT;
		moveArray = new int[CELL_COUNT];
		for (int i = 0; i < CELL_COUNT; i++) {
			moveArray[i] = NO_MOVE;
		}
	}
	
	//where to call this
	private void validateTicTacToeBoard() {
		assert moveArray != null:"Move array must be not null";
		assert moveArray.length == 9:"Invalid board";
		
	}

	@Override
	public Mark getMark(int row, int column) {
		assert row <= 2:"Row must be in bounds";
		assert row >= 0:"Row must be in bounds";
		assert column <= 2:"Col must be in bounds";
		assert column >= 0: "Col must be in bounds";
		int tableIndex = row * COLUMN_COUNT + column;
		int position = moveArray[tableIndex];
		if (position == -1) {
			return null;
		}
		return Mark.values()[position];
	}

	private int checkForThreeInARow(int row, int column, int rowImpl, int colImpl) {
		int winner = NO_MATCH;
		for (int i = 0; i < 3; i++) {
			int mark = moveArray[row * COLUMN_COUNT + column];
			if (mark == NO_MOVE) {
				return NO_MATCH;
			}
			if (winner != NO_MATCH && winner != mark) {
				return NO_MATCH;
			}
			winner = mark;
			row = row + rowImpl;
			column = column + colImpl;
		}
		return winner;
	}
	
	@Override
	public boolean isGameOver() {
		boolean fullboard = true;
		for (int i = 0; i < moveArray.length; i++) {
			if (moveArray[i] == NO_MOVE) {
				fullboard = false;
				break;
			}
		}
		if(fullboard) {
			return true;
		}
		for (int i = 0; i < 3; i++) {
			if (checkForThreeInARow(i, 0, 0, 1) >= 0) {
				return true;
			}
			if (checkForThreeInARow(0, i, 1, 0) >= 0) {
				return true;
			}
		}
		if (checkForThreeInARow(0, 0, 1, 1) >= 0) {
			return true;
		} // forward diag
		if (checkForThreeInARow(0, 2, 1, -1) >= 0) {
			return true;
		} // backwards diag
		for (int i = 0; i < 9; i++) {
			if (moveArray[i] == -1) {
				return false;
			}
		}
		return false;
	}

	@Override
	public Mark getWinner() {
		if (isGameOver()) {
			int winner = -1;
			for (int i = 0; i < 3; i++) {
				if (checkForThreeInARow(i, 0, 0, 1) >= 0) {
					winner = (checkForThreeInARow(i, 0, 0, 1));
				}
				if (checkForThreeInARow(0, i, 1, 0) >= 0) {
					winner = (checkForThreeInARow(0, i, 1, 0));
				}
			}
			if (checkForThreeInARow(0, 0, 1, 1) >= 0) {
				winner = (checkForThreeInARow(0, 0, 1, 1));
			} // forward diag
			if (checkForThreeInARow(0, 2, 1, -1) >= 0) {
				winner = (checkForThreeInARow(0, 2, 1, -1));
				// backwards diag
			}
			if(winner >= 0) {
				return Mark.values()[winner];
			}
		}
		return null;
	}
	
	public Mark getTurn() {
		assert !isGameOver():"If game is over, there are no more turns";
		return nextMove;
	}
	
	public void setMark(int row, int column) {
		setMark(row, column, getTurn());
		nextMove = Mark.values()[(nextMove.ordinal() + 1)%2];
	}
	
	//is game over is a  precondition for set mark
	private void setMark(int row, int column, Mark mark) {
		assert !isGameOver():"Cannot set a mark while game is over";
		if(row < 0 || column < 0) {
			this.end_moves = true;
			return;
		}
		else {
			assert !end_moves:"If there is a negative number, end the game";
		}
		assert row >= 0 : "Row must be at zeroth index or higher" + row;
		assert row <= 2 : "Row must be at ninth index or lower" + row;
		assert column >= 0 : "Col must be at zeroth index or higher" + column;
		assert column <= 2 : "Col must be at ninth index or lower" + column;
		int tableIndex = row * COLUMN_COUNT + column; 
		assert moveArray[tableIndex] == -1:"square is already occupied";
		assert tableIndex >= 0 && tableIndex < 9 : "Assert table index must be greater than/equal to 0 and less than 9";
		moveArray[tableIndex] = mark.ordinal();
		if(mark == Mark.X) {
			Xset.add(tableIndex);
		}
		if(mark == Mark.O) {
			Oset.add(tableIndex);
		}
		System.out.println("Index: " + tableIndex);
	}
	
	//add a helper method that takes in params of target, array and comes back with either no move or no match
	public static int getSmallestIndex(int[] intArray, int target) {
		assert intArray.length == 9:"Int array must be of size 9";
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] == target)
				return i;
		}
		return NO_MATCH;	
	}
	
}
