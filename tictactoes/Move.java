package tictactoes;

public interface Move {

	//part of post 0 < = rv
	//post: rv << ROW COUNT

	public int getRow();

	//part of post 0 <= rv
	//part of post: rv <= COL COUNT

	public int getColumn();

	//part of post: tv != null

	public Mark getMark();

}
