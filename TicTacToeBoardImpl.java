package tictactoe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TicTacToeBoardImpl implements TicTacToeBoard {

	protected static final int NO_MOVE = -1;
	protected static final int NO_MATCH = -1;

	protected int[] moveArray;
	//check that moves array is length 9, moves array has no dups
	//int find = intArray([0,2,2],2)
	
	private Set<Integer> Xset = new HashSet<>();
	private Set<Integer> Oset = new HashSet<>();
	private Mark nextMove = Mark.X;
	boolean duplicates=false;

	
	public TicTacToeBoardImpl() {
		final int CELL_COUNT = ROW_COUNT * COLUMN_COUNT;
		moveArray = new int[CELL_COUNT];
		for (int i = 0; i < CELL_COUNT; i++) {
			moveArray[i] = NO_MOVE;
		}
	}

	@Override
	public Mark getMark(int row, int column) {
		int tableIndex = row * COLUMN_COUNT + column;
		int position = moveArray[tableIndex];
		if (position == -1) {
			return null;
		}
		return Mark.values()[position];
	}

	private int check(int row, int column, int rowImpl, int colImpl) {
		int answer = NO_MOVE;
		for (int i = 0; i < 3; i++) {
			int returnVal = moveArray[row * COLUMN_COUNT + column];
			if (returnVal == NO_MOVE) {
				return NO_MOVE;
			}
			if (answer != NO_MOVE && answer != returnVal) {
				return NO_MOVE;
			}
			answer = returnVal;
			row = row + rowImpl;
			column = column + colImpl;
		}
		return answer;
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
			if (check(i, 0, 0, 1) >= 0) {
				return true;
			}
			if (check(0, i, 1, 0) >= 0) {
				return true;
			}
		}
		if (check(0, 0, 1, 1) >= 0) {
			return true;
		} // forward diag
		if (check(0, 2, 1, -1) >= 0) {
			return true;
		} // backwards diag
		for (int i = 0; i < 9; i++) {
			if (moveArray[i] == -1) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Mark getWinner() {
		if (isGameOver()) {
			int winner = -1;
			for (int i = 0; i < 3; i++) {
				if (check(i, 0, 0, 1) >= 0) {
					winner = (check(i, 0, 0, 1));
				}
				if (check(0, i, 1, 0) >= 0) {
					winner = (check(0, i, 1, 0));
				}
			}
			if (check(0, 0, 1, 1) >= 0) {
				winner = (check(0, 0, 1, 1));
			} // forward diag
			if (check(0, 2, 1, -1) >= 0) {
				winner = (check(0, 2, 1, -1));
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
		for (int j=0; j < moveArray.length; j++)
		  for (int k=j+1; k < moveArray.length; k++)
		    if (k!=j && moveArray[k] == moveArray[j] && moveArray[k] != -1)
		      duplicates=true;
		    else
		    	duplicates = false;
		assert duplicates == false:"Cannot pass in an array with duplicates";
		setMark(row, column, getTurn());
		nextMove = Mark.values()[(nextMove.ordinal() + 1)%2];
	}
	
	//is game over is a  precondition for set mark
	private void setMark(int row, int column, Mark mark) {
		assert !isGameOver():"Cannot set a mark while game is over";
		//assert getWinner() == null:"Board cannot continue to be filled while there is a winner";
		assert row >= 0 : "Mark must be at zeroth index or higher";
		assert row <= 2 : "Mark must be at ninth index or lower";
		assert column >= 0 : "Mark must be at zeroth index or higher";
		assert column <= 2 : "Mark must be at ninth index or lower";
		int tableIndex = row * COLUMN_COUNT + column; 
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
	

}
