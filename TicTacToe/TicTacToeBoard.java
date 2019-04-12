package TicTacToe;

public interface TicTacToeBoard {
	
	//part of pre 0 <= row < ROW_COUNT && 0 <= column < COLUMN_COUNT
	//part of post rv == null <==> the (row, column) spot on the board is empty
	
	public Mark getMark(int row, int column);
	//part of pre: 0 <= row < ROW_COUNT && 0 <= column < COLUMN_COUNT
	//pre: mark !=null
	//pre getMark(row, column) == null
	//pre: !isGameOver();
	//pre: mark.equals(get.Turn());
	
	public void setMark(int row, int column, Mark mark);
	//post: rv == null <==> it is neither players turn (game is over)
	
	//post: left to student
	public boolean isGameOver();
	
	//pre: is GameOver();,./DSF/.S<DFAAAAAAAAAAAAAAAAA/.</.dddddd/DS/
	
	//post: rv == null <==> neither player won
	public Mark getWinner();

	
}
