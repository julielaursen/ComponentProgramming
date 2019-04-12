package TicTacToe;

public class TicTacToeBoardImpl implements TicTacToeBoard {
	
	protected static final int NO_MOVE = -1;
	protected static final int NO_MATCH = -1;
	
	protected int[] movesArray;
	
	public TicTacToeBoardImpl() {
		final int CELL_COUNT = ROW_COUNT*COLUMN_COUNT;
		movesArray = new int[CELL_COUNT];
		for(int i = 0; i < CELL_COUNT; i++)
		{
			movesArray[i] = NO_MOVE;
		}
	}

	public Mark moveBoard(int row, int column, Mark mark) {
		int numInput = 0;
		assert numInput >= 0:"Mark must be at zeroth index or higher";
		assert numInput <= 9:"Mark must be at ninth index or lower";
		return mark;
		
	
	}
	
@Override
	public Mark getMark(int row, int column) {
		return null;
	}

	@Override
	public boolean isGameOver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Mark getWinner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMark(int row, int column, Mark mark) {
		// TODO Auto-generated method stub
		
	}
	

}
