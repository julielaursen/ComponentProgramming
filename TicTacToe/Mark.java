package TicTacToe;

public enum Mark {

	X, O;

	public Mark next() {
		return Mark.values()[(this.ordinal() + 1)%2];
	}
	
}
