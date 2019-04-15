package TicTacToe;

import java.util.Scanner;

public class TicTacToeBoardImpl implements TicTacToeBoard {

	protected static final Mark NO_MOVE = null;

	private final int columnCount;
	private final Mark[] board;

	public static void main(String... args) {
		TicTacToeBoard board = new TicTacToeBoardImpl(4);
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			Mark player = Mark.X;
			while (!board.isGameOver()) {
				String[] move = null;
				while (!validMove(move, board, player)) {
					System.out.print(player + " move (row, column): ");
					move = scanner.nextLine().split(",");
				}
				String boardString = board.toString();
				System.out.println(boardString);
				player = player.next();
			}
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		Mark winner = board.getWinner();
		if (winner == null) {
			System.out.println("The game is tied.");
		}
		else {
			System.out.println("The winner is " + winner + ".");
		}
	}

	public static boolean validMove(String[] move, TicTacToeBoard board, Mark player) {
		if (move == null) {
			return false;
		}
		if (move.length != 2) {
			return false;
		}
		int row;
		int column;
		try {
			row = Integer.parseInt(move[0].trim()) - 1;
			column = Integer.parseInt(move[1].trim()) - 1;
		} catch (Exception e) {
			return false;
		}
		if (board.getMark(row, column) != null) {
			return false;
		}
		board.setMark(row, column, player);

		return true;
	}

	public TicTacToeBoardImpl(int columnCount) {
		this.columnCount = columnCount;
		this.board = new Mark[columnCount * columnCount];
	}

	@Override
	public Mark getMark(int row, int column) {
		return board[row * columnCount + column];
	}

	@Override
	public boolean isGameOver() {
		if(getWinner() != null) {
			return true;
		}
		for (Mark mark : board) {
			if(mark == null) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Mark getWinner() {
		Mark check;
		for (int i = 0; i < columnCount; i++) {
			check = check(i, 0, 0, 1);
			if (check != null)
				return check;
			check = check(0, i, 1, 0);
			if (check != null)
				return check;
		}
		check = check(0, 0, 1, 1);
		if (check != null)
			return check;
		check = check(0, columnCount-1, 1, -1);
		if (check != null)
			return check;
		return null;
	}

	private Mark check(int row, int column, int rowIncr, int columnIncr) {
		Mark current = null;
		for (int i = 0; i < columnCount; i++) {
			Mark mark = getMark(row, column);
			if (mark == null) {
				return null;
			}
			if (current == null) {
				current = mark;
			} else {
				if (current != mark) {
					return null;
				}
			}
			row = row + rowIncr;
			column = column + columnIncr;
		}
		return current;
	}

	@Override
	public void setMark(int row, int column, Mark mark) {
		board[row * columnCount + column] = mark;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int row = 0; row < columnCount; row++) {
			for (int column = 0; column < columnCount; column++) {
				Mark mark = getMark(row, column);
				sb.append(mark == null ? "+" : mark.name()).append(" ");
			}
			sb.append('\n');
		}
		return sb.toString();
	}
}
