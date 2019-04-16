package TicTacToe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeBoardImpl implements TicTacToeBoard {
	private static final Random RANDOM = new Random();
	private static final Mark NO_MARK = null;
	
	private static int COLUMN_COUNT = 4;
	// If HUMAN_MARK = null, then the computer will play both sides.
	private static final Mark HUMAN_MARK = Mark.X;

	private final Mark[] board;

	public static void main(String... args) {
		TicTacToeBoard board = new TicTacToeBoardImpl();
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			Mark player = Mark.X;
			while (!board.isGameOver()) {
				if (makeMove(board, scanner, player)) {
					break; // a premature end of game
				}
				System.out.println(board.toString());
				player = player.next();
			}
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		Mark winner = board.getWinner();
		if (winner == NO_MARK) {
			System.out.println("The game is tied.");
		} else {
			System.out.println("The winner is " + winner + ".");
		}
	}

	private static boolean makeMove(TicTacToeBoard board, Scanner scanner, Mark player) {
		boolean prematureEndOfGame = false;
		if (player == HUMAN_MARK) {
			humanMove(board, scanner, player);
		} else {
			prematureEndOfGame = computerMove(board, player);
		}
		return prematureEndOfGame;
	}

	private static void humanMove(TicTacToeBoard board, Scanner scanner, Mark player) {
		String[] move = null;
		while (!validMove(move, board, player)) {
			System.out.print(player + " move (row, column): ");
			move = scanner.nextLine().split(",");
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
		if (board.getMark(row, column) != NO_MARK) {
			return false;
		}
		board.setMark(row, column, player);
		return true;
	}

	private static boolean computerMove(TicTacToeBoard board, Mark player) {
		// Evaluate my potential moves.
		int[] myMoves = new int[COLUMN_COUNT * COLUMN_COUNT];
		int myWinningMove = winningMove(myMoves, player, board);
		if (myWinningMove >= 0) { // Take the winning move.
			board.setMark(myWinningMove / COLUMN_COUNT, myWinningMove % COLUMN_COUNT, player);
			return false;
		}
		// Evaluate opponent's potential moves.
		int[] opponentMoves = new int[COLUMN_COUNT * COLUMN_COUNT];
		int opponentWinningMove = winningMove(opponentMoves, player.next(), board);
		if (opponentWinningMove >= 0) { // Block the opponent's winning move.
			board.setMark(opponentWinningMove / COLUMN_COUNT, opponentWinningMove % COLUMN_COUNT, player);
			return false;
		}
		
		List<Integer> myBestMoves = new ArrayList<>();
		int myMaxScore = 0;
		for (int i = 0; i < myMoves.length; i++) {
			if (myMoves[i] > myMaxScore) {
				myMaxScore = myMoves[i];
				myBestMoves.clear();
				myBestMoves.add(i);
			} else if (myMoves[i] == myMaxScore) {
				myBestMoves.add(i);
			}
		}
		List<Integer> opponentBestMoves = new ArrayList<>();
		int opponentMaxScore = 0;
		for (int i = 0; i < myMoves.length; i++) {
			if (myMoves[i] > opponentMaxScore) {
				opponentMaxScore = myMoves[i];
				opponentBestMoves.clear();
				opponentBestMoves.add(i);
			} else if (myMoves[i] == opponentMaxScore) {
				opponentBestMoves.add(i);
			}
		}
		if (myMaxScore + opponentMaxScore == 0) {
			// Nobody has a good move.
			return true; // Premature end of game.
		}
		// Is it better to take my best move or to block the opponent's best move?
		if (myMaxScore >= opponentMaxScore) {
			int move = myBestMoves.get(RANDOM.nextInt(myBestMoves.size()));
			board.setMark(move / COLUMN_COUNT, move % COLUMN_COUNT, player);
		} else {
			int move = opponentBestMoves.get(RANDOM.nextInt(opponentBestMoves.size()));
			board.setMark(move / COLUMN_COUNT, move % COLUMN_COUNT, player);
		}
		return false;
	}

	private static int winningMove(int[] moves, Mark player, TicTacToeBoard board) {
		// Watch for a winning move, while scoring available moves.
		List<Integer> availableMoves;
		for (int i = 0; i < COLUMN_COUNT; i++) {
			// Evaluate rows.
			availableMoves = checkLineForAvailableMoves(i, 0, 0, 1, player, board);
			if(evaluateAvailableMoves(moves, availableMoves)) {
				return availableMoves.get(0); // take the winning move
			}
			// Evaluate columns.
			availableMoves = checkLineForAvailableMoves(0, i, 1, 0, player, board);
			if(evaluateAvailableMoves(moves, availableMoves)) {
				return availableMoves.get(0); // take the winning move
			}
		}
		// Evaluate forward diagonal.
		availableMoves = checkLineForAvailableMoves(0, 0, 1, 1, player, board);
		if(evaluateAvailableMoves(moves, availableMoves)) {
			return availableMoves.get(0); // take the winning move
		}
		// Evaluate backward diagonal.
		availableMoves = checkLineForAvailableMoves(0, COLUMN_COUNT - 1, 1, -1, player, board);
		if(evaluateAvailableMoves(moves, availableMoves)) {
			return availableMoves.get(0); // take the winning move
		}

		return -1;
	}

	private static boolean evaluateAvailableMoves(int[] moves, List<Integer> available) {
		boolean a = false;
		if (available.size() == 1) {
			a = true;
		} else {
			int k = COLUMN_COUNT - available.size() + 1;
			for (int j : available) {
				moves[j] += k;
			}
		}
		return a;
	}

	private static List<Integer> checkLineForAvailableMoves(int row, int column, int rowIncr, int columnIncr, Mark player,
			TicTacToeBoard board) {
		List<Integer> availableMoves = new ArrayList<>();
		for (int i = 0; i < COLUMN_COUNT; i++) {
			int index = row * COLUMN_COUNT + column;
			Mark mark = board.getMark(row, column);
			if (mark == NO_MARK) {
				availableMoves.add(index);
			} else if (mark != player) {
				// The opponent is blocking this line.
				return Collections.emptyList();
			}
			row += rowIncr;
			column += columnIncr;
		}
		return availableMoves;
	}

	public TicTacToeBoardImpl() {
		this.board = new Mark[COLUMN_COUNT * COLUMN_COUNT];
	}

	@Override
	public Mark getMark(int row, int column) {
		return board[row * COLUMN_COUNT + column];
	}

	@Override
	public boolean isGameOver() {
		if (getWinner() != NO_MARK) {
			return true;
		}
		// Are there any unused postions on the board?
		for (Mark mark : board) {
			if (mark == NO_MARK) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Mark getWinner() {
		Mark check;
		for (int i = 0; i < COLUMN_COUNT; i++) {
			check = checkLineForWinner(i, 0, 0, 1);
			if (check != NO_MARK)
				return check;
			check = checkLineForWinner(0, i, 1, 0);
			if (check != NO_MARK)
				return check;
		}
		check = checkLineForWinner(0, 0, 1, 1);
		if (check != NO_MARK)
			return check;
		check = checkLineForWinner(0, COLUMN_COUNT - 1, 1, -1);
		if (check != NO_MARK)
			return check;
		return NO_MARK;
	}

	private Mark checkLineForWinner(int row, int column, int rowIncr, int columnIncr) {
		Mark current = NO_MARK;
		for (int i = 0; i < COLUMN_COUNT; i++) {
			Mark mark = getMark(row, column);
			if (mark == NO_MARK) {
				return NO_MARK;
			}
			if (current == NO_MARK) {
				current = mark;
			} else {
				if (current != mark) {
					return NO_MARK;
				}
			}
			row = row + rowIncr;
			column = column + columnIncr;
		}
		return current;
	}

	@Override
	public void setMark(int row, int column, Mark mark) {
		board[row * COLUMN_COUNT + column] = mark;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int row = 0; row < COLUMN_COUNT; row++) {
			for (int column = 0; column < COLUMN_COUNT; column++) {
				Mark mark = getMark(row, column);
				sb.append(mark == NO_MARK ? "+" : mark.name()).append(" ");
			}
			sb.append('\n');
		}
		return sb.toString();
	}
}
