package tictactoe;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TicTacToeBoardImplTest {

	@Before 
	public void setUp() {
		ticTacToeBoard_STUDENT = new TicTacToeBoardImpl();
		}
	private TicTacToeBoard ticTacToeBoard_STUDENT;

	private void getPrettyString(TicTacToeBoard movesArray) {
		for (int i = 0; i < 3; i++) {
			System.out.print(movesArray.getMark(0, i) == null ? " " : movesArray.getMark(0, i));
		}
		System.out.println("");
		for (int i = 0; i < 3; i++) {
			System.out.print(movesArray.getMark(1, i) == null ? " " : movesArray.getMark(1, i));
		}
		System.out.println("");
		for (int i = 0; i < 3; i++) {
			System.out.print(movesArray.getMark(2, i) == null ? " " : movesArray.getMark(2, i));
		}
	}

	@Test
	public void GetMark1() {
		TicTacToeBoard board = new TicTacToeBoardImpl();
		int[] moveArray = new int[] { 0, 1, 2, 3, 5, 4, 6, 8, 7 };
		Mark mark = Mark.X;
		for (int i : moveArray) {
			if (i < 0) {
				break;
			}
			int row = i / 3;
			int column = i % 3;
			board.setMark(row, column);
			mark = Mark.values()[(mark.ordinal() + 1) % 2];
		}
		assertEquals(Mark.X, board.getMark(0, 0));
		assertEquals(Mark.O, board.getMark(0, 1));
		assertEquals(Mark.X, board.getMark(0, 2));
		assertEquals(Mark.O, board.getMark(1, 0));
		assertEquals(Mark.X, board.getMark(1, 2));
		assertEquals(Mark.O, board.getMark(1, 1));
		assertEquals(Mark.X, board.getMark(2, 0));
		assertEquals(Mark.O, board.getMark(2, 2));
		assertEquals(Mark.X, board.getMark(2, 1));
	}

	@Test
	public void tieNoWinner() {
		TicTacToeBoard board = new TicTacToeBoardImpl();
		int[] moveArray = new int[] { 0, 1, 2, 3, 5, 4, 6, 8, 7 };
		for (int i : moveArray) {
			if (i < 0) {
				break;
			}
			int row = i / 3;
			int column = i % 3;
			board.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(board);
		assertTrue(board.isGameOver());
	}

	@Test(expected = AssertionError.class)
	public void TwoWinnersSameBoard() {
		TicTacToeBoard board = new TicTacToeBoardImpl();
		int[] moveArray = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i : moveArray) {
			if (i < 0) {
				break;
			}
			int row = i / 3;
			int column = i % 3;
			board.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(board);
		assertTrue(board.isGameOver());
		assertEquals(Mark.X, board.getWinner());
	}

	@Test(expected = AssertionError.class)
	public void testOWinsFirst() {
		TicTacToeBoard board = new TicTacToeBoardImpl();
		int[] moveArray = new int[] { 4, 5, 3, 2, 1, 8, 7, -1, -1 };
		for (int i : moveArray) {
			if (i < 0) {
				break;
			}
			int row = i / 3;
			int column = i % 3;
			board.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(board);
		assertTrue(board.isGameOver());
		assertEquals(Mark.O, board.getWinner());
	}

	@Test
	public void testXWinsFirst() {
		TicTacToeBoard board = new TicTacToeBoardImpl();
		int[] moveArray = new int[] { 4, 5, 3, 2, 0, 7, 6, -1, -1 };
		for (int i : moveArray) {
			if (i < 0) {
				break;
			}
			int row = i / 3;
			int column = i % 3;
			board.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(board);
		assertTrue(board.isGameOver());
		assertEquals(Mark.X, board.getWinner());
	}

	@Test(expected = AssertionError.class)
	public void testXWinsFirstAlmostFullBoard() {
		TicTacToeBoard board = new TicTacToeBoardImpl();
		int[] moveArray = new int[] { 4, 5, 3, 2, 0, 7, 6, 8, -1 };
		for (int i : moveArray) {
			if (i < 0) {
				break;
			}
			int row = i / 3;
			int column = i % 3;
			board.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(board);
		assertTrue(board.isGameOver());
		assertEquals(Mark.X, board.getWinner());
	}

	@Test(expected = AssertionError.class)
	//This fails at index 6
	public void testXWinsFirstFullBoard() {
		TicTacToeBoard board = new TicTacToeBoardImpl();
		int[] moveArray = new int[] { 4, 5, 3, 2, 0, 7, 6, 8, 1 };
		for (int i : moveArray) {
			if (i < 0) {
				break;
			}
			int row = i / 3;
			int column = i % 3;
			board.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(board);
		assertTrue(board.isGameOver());
		assertEquals(Mark.X, board.getWinner());
	}

	@Test
	@Ignore("Ask for clarification on whether the game is over or not over at this point")
	public void test2() {
		TicTacToeBoard board = new TicTacToeBoardImpl();
		int[] moveArray = new int[] { 4, 5, -1, -1, -1, -1, -1, -1, -1 };
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			board.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(board);
		assertTrue(board.isGameOver());
		assertEquals(null, board.getWinner());

	}

	@Test(expected = AssertionError.class)
	public void testOrder() {
		TicTacToeBoard board = new TicTacToeBoardImpl();
		int[] moveArray = new int[] { 4, 5, -1, 6, 7, 8, -1, -1, -1};
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			board.setMark(row, column);
		}
		getPrettyString(board);
		assertFalse(board.isGameOver());
		assertEquals(null, board.getWinner());
	}

	
	@Test
	public void test4() {
		TicTacToeBoard board = new TicTacToeBoardImpl();
		int[] moveArray = new int[] { 4, 5, -1 };
		for (int i : moveArray) {
			if (i < 0) {
				break;
			}
			int row = i / 3;
			int column = i % 3;
			board.setMark(row, column);
		}
		assertFalse(board.isGameOver());
		assertEquals(null, board.getWinner());
	}

	@Test
	public void test5() {
		TicTacToeBoard board = new TicTacToeBoardImpl();
		int[] moveArray = new int[] { 4, 5, -1 };
		for (int i : moveArray) {
			if (i < 0) {
				break;
			}
			int row = i / 3;
			int column = i % 3;
			board.setMark(row, column);
		}
		assertFalse(board.isGameOver());
		assertEquals(null, board.getWinner());
	}

	
	@Test//(expected = AssertionError.class)
	public void test3() {
		TicTacToeBoard board = new TicTacToeBoardImpl();
		int[] moveArray = new int[] { 1, 0, 3, 2, 5, 8, 7, 6, 4 };
		for (int i : moveArray) {
			if (i < 0) {
				break;
			}
			int row = i / 3;
			int column = i % 3;
			board.setMark(row, column);
		}
		getPrettyString(board);
		assertTrue(board.isGameOver());
		assertEquals(Mark.X, board.getWinner());

	}

	@Test
	public void emptyBoardTest() {
		for (int i = 0; i < TicTacToeBoard.ROW_COUNT; i++) {
			for (int j = 0; j < TicTacToeBoard.COLUMN_COUNT; j++) {
				assertEquals(null, ticTacToeBoard_STUDENT.getMark(i, j));
			}
		}
		assertEquals(Mark.X, ticTacToeBoard_STUDENT.getTurn());
		assertEquals(false, ticTacToeBoard_STUDENT.isGameOver());
	}
	
	@Test(expected = AssertionError.class) //this fails because if the game is over, it shouldn't be anyone's turn
	public void getTurnTest() {
		TicTacToeBoard movesArray = new TicTacToeBoardImpl();
		int[] moveArray = new int[] {0,1,2,3,4,5,6,-1,-1};
		for (int i : moveArray) {
			if (i < 0) {
				break;
			}
			int row = i / 3;
			int column = i % 3;
			movesArray.setMark(row, column);
		}
		getPrettyString(movesArray);
		assertTrue(movesArray.isGameOver());
		assertEquals(Mark.X, movesArray.getWinner());
		assertEquals(null, movesArray.getTurn());
	}
	
	@Test(expected = AssertionError.class)//this fails because if the game is over, it shouldn't be anyone's turn
	public void DuplicateTest() {
		TicTacToeBoard movesArray = new TicTacToeBoardImpl();
		int[] moveArray = new int[] {0,1,2,3,5,4,6,6,7};
		for (int i : moveArray) {
			if (i < 0) {
				break;
			}
			int row = i / 3;
			int column = i % 3;
			movesArray.setMark(row, column);
		}
		getPrettyString(movesArray);
		assertTrue(movesArray.isGameOver());
		assertEquals(Mark.X, movesArray.getWinner());
		assertEquals(null, movesArray.getTurn());
	}
	
	@Test
	public void emptySetTest() {
		TicTacToeBoard movesArray = new TicTacToeBoardImpl();
		int[] moveArray = new int[] {};
		for (int i : moveArray) {
			if (i < 0) {
				break;
			}
			int row = i / 3;
			int column = i % 3;
			movesArray.setMark(row, column);
		}
		assertFalse(movesArray.isGameOver());
		assertEquals(null, movesArray.getWinner());
	}

	@Test
	public void oneSymbolTest() {
		final int ROW = 0;
		final int COLUMN = 2;
		final Mark MARK = Mark.X;
		ticTacToeBoard_STUDENT.setMark(ROW, COLUMN);
		for (int i = 0; i < TicTacToeBoard.ROW_COUNT; i++) {
			for (int j = 0; j < TicTacToeBoard.COLUMN_COUNT; j++) {
				if (i == ROW && j == COLUMN) {
					assertEquals(MARK, ticTacToeBoard_STUDENT.getMark(i, j));
				}
			}
		}
	}

	@Test(expected = AssertionError.class)
	public void setMark_OutOfRange() {
		final int ROW1 = 4;
		final int COLUMN1 = 4;
		ticTacToeBoard_STUDENT.setMark(ROW1, COLUMN1);
	}

}










