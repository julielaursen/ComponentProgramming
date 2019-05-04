package tictactoes;

public class TicTacToeBoardImpl_Laursen implements TicTacToeBoard {

	protected static final int NO_MOVE = -1;
	protected static final int NO_MATCH = -1;

	protected int[] moveArray;

	private Mark nextMove = Mark.X;
	private boolean end_moves = false;

	public TicTacToeBoardImpl_Laursen() {
		final int CELL_COUNT = ROW_COUNT * COLUMN_COUNT;
		moveArray = new int[CELL_COUNT];
		for (int i = 0; i < CELL_COUNT; i++) {
			moveArray[i] = NO_MOVE;
		}
	}

	@Override
	public Mark getMark(int row, int column) {
		assert row < ROW_COUNT: "Row must be in bounds";
		assert row >= 0:"Row must be in bounds";
		assert column < COLUMN_COUNT:"Col must be in bounds";
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
		}
		if (checkForThreeInARow(0, 2, 1, -1) >= 0) {
			return true;
		}
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
			}
			if (checkForThreeInARow(0, 2, 1, -1) >= 0) {
				winner = (checkForThreeInARow(0, 2, 1, -1));
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

	private void setMark(int row, int column, Mark mark) {
//		Set<Integer> Xset = new HashSet<>();
//		Set<Integer> Oset = new HashSet<>();
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
//			Xset.add(tableIndex);
		}
		if(mark == Mark.O) {
//			Oset.add(tableIndex);
		}
		System.out.println("Index: " + tableIndex);
	}

	public static int getSmallestIndex(int[] intArray, int target) {
		assert intArray.length == 9:"Int array must be of size 9";
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] == target)
				return i;
		}
		return NO_MATCH;
	}

}
