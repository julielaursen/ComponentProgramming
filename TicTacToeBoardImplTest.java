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
		ticTacToeBoard_Laursen = new TicTacToeBoardImpl();
	}

	private TicTacToeBoard ticTacToeBoard_Laursen;

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
		int[] moveArray = new int[] { 0, 1, 2, 3, 5, 4, 6, 8, 7 };
		Mark mark = Mark.X;
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
			mark = Mark.values()[(mark.ordinal() + 1) % 2];
		}
		assertEquals(Mark.X, ticTacToeBoard_Laursen.getMark(0, 0));
		assertEquals(Mark.O, ticTacToeBoard_Laursen.getMark(0, 1));
		assertEquals(Mark.X, ticTacToeBoard_Laursen.getMark(0, 2));
		assertEquals(Mark.O, ticTacToeBoard_Laursen.getMark(1, 0));
		assertEquals(Mark.X, ticTacToeBoard_Laursen.getMark(1, 2));
		assertEquals(Mark.O, ticTacToeBoard_Laursen.getMark(1, 1));
		assertEquals(Mark.X, ticTacToeBoard_Laursen.getMark(2, 0));
		assertEquals(Mark.O, ticTacToeBoard_Laursen.getMark(2, 2));
		assertEquals(Mark.X, ticTacToeBoard_Laursen.getMark(2, 1));
	}
	
	@Test
	public void GetMarkNegative() {
		int[] moveArray = new int[] {};
		Mark mark = Mark.X;
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
			mark = Mark.values()[(mark.ordinal() + 1) % 2];
		}
		assertEquals(null, ticTacToeBoard_Laursen.getMark(0,0));
	}
	
	@Test
	public void GetMarkNull2() {
		int[] moveArray = new int[] { 0, 1, 2, 3, 5, 4};
		Mark mark = Mark.X;
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
			mark = Mark.values()[(mark.ordinal() + 1) % 2];
		}
		assertEquals(null, ticTacToeBoard_Laursen.getMark(2,2));
	}
	
	@Test(expected = AssertionError.class)
	public void GetMarkOOB() {
		int[] moveArray = new int[] {};
		Mark mark = Mark.X;
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
			mark = Mark.values()[(mark.ordinal() + 1) % 2];
		}
		assertEquals(null, ticTacToeBoard_Laursen.getMark(9,9));
	}

	@Test(expected = AssertionError.class)
	public void SetMarkTwice() {
		int[] moveArray = new int[] { 0, 1, 2, 3, 5, 4, 6, 8, 7 };
		Mark mark = Mark.X;
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
			ticTacToeBoard_Laursen.setMark(row, column);
			mark = Mark.values()[(mark.ordinal() + 1) % 2];
		}
	}

	@Test
	public void breakOnNegative() {
		int[] moveArray = new int[] { 0, 8, 3, 5, -1, -1, -1, -1, -1 };
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
	}

	@Test
	public void testTargetMethod() {
		int[] moveArray = new int[] { 0, 1, 2, 7, 5, 3, 6, 8, 4 };
		assertEquals(5, TicTacToeBoardImpl.getSmallestIndex(moveArray, 3));
		assertEquals(-1, TicTacToeBoardImpl.getSmallestIndex(moveArray, 9));
	}

	@Test(expected = AssertionError.class)
	public void testTargetMethod2() {
		int[] moveArray = new int[] { 0, 1, 2, 7, 5, 3, 6, 8, 4, 9, 6, 1 };
		TicTacToeBoardImpl.getSmallestIndex(moveArray, 6);
	}
	
	@Test
	public void tieNoWinner() {
		int[] moveArray = new int[] { 0, 1, 2, 3, 5, 4, 6, 8, 7 };
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(ticTacToeBoard_Laursen);
		assertTrue(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(null, ticTacToeBoard_Laursen.getWinner());

	}

	@Test(expected = AssertionError.class)
	public void TwoWinnersSameBoard() {
		int[] moveArray = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(ticTacToeBoard_Laursen);
		assertTrue(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(Mark.X, ticTacToeBoard_Laursen.getWinner());
	}

	@Test(expected = AssertionError.class)
	public void testOWinsFirst() {
		int[] moveArray = new int[] { 4, 5, 3, 2, 1, 8, 7, -1, -1 };
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(ticTacToeBoard_Laursen);
		assertTrue(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(Mark.O, ticTacToeBoard_Laursen.getWinner());
	}

	@Test
	public void testXWinsFirst() {
		int[] moveArray = new int[] { 4, 5, 3, 2, 0, 7, 6};
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(ticTacToeBoard_Laursen);
		assertTrue(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(Mark.X, ticTacToeBoard_Laursen.getWinner());
	}

	@Test(expected = AssertionError.class)
	public void testXWinsFirstAlmostFullBoard() {
		int[] moveArray = new int[] { 4, 5, 3, 2, 0, 7, 6, 8, -1 };
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(ticTacToeBoard_Laursen);
		assertTrue(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(Mark.X, ticTacToeBoard_Laursen.getWinner());
	}

	@Test 
	public void MultipleNegatives() {
		int[] moveArray = new int[] { 4, 5, 3, 2, 0, -1, -2, -1, -2 };
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(ticTacToeBoard_Laursen);
		assertFalse(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(null, ticTacToeBoard_Laursen.getWinner());
	}
	
	@Test(expected = AssertionError.class)
	// This fails at index 6
	public void testXWinsFirstFullBoard() {
		int[] moveArray = new int[] { 4, 5, 3, 2, 0, 7, 6, 8, 1 };
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(ticTacToeBoard_Laursen);
		assertTrue(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(Mark.X, ticTacToeBoard_Laursen.getWinner());
	}

	@Test
	@Ignore("Ask for clarification on whether the game is over or not over at this point")
	public void GameForfeited() {
		int[] moveArray = new int[] { 4, 5, -1, -1, -1, -1, -1, -1, -1 };
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
		System.out.println("Board:");
		getPrettyString(ticTacToeBoard_Laursen);
		assertTrue(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(null, ticTacToeBoard_Laursen.getWinner());

	}

	@Test(expected = AssertionError.class)
	public void testOrder() {
		int[] moveArray = new int[] { 4, 5, -1, 6, 7, 8, -1, -1, -1 };
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
		getPrettyString(ticTacToeBoard_Laursen);
		assertFalse(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(null, ticTacToeBoard_Laursen.getWinner());
	}
	
	@Test(expected = AssertionError.class)
	public void tieNoWinnerExtendedArray() {
		int[] moveArray = new int[] { 0, 1, 2, 3, 5, 4, 6, 8, 7, -1 };
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
		getPrettyString(ticTacToeBoard_Laursen);
		assertFalse(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(null, ticTacToeBoard_Laursen.getWinner());
	}

	@Test
	public void smallArray() {
		int[] moveArray = new int[] { 4, 5};
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
		assertFalse(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(null, ticTacToeBoard_Laursen.getWinner());
	}

	@Test
	public void XhorizontalAndVerticallAtTheSameTime() {
		int[] moveArray = new int[] { 1, 0, 3, 2, 5, 8, 7, 6, 4 };
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
		getPrettyString(ticTacToeBoard_Laursen);
		assertTrue(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(Mark.X, ticTacToeBoard_Laursen.getWinner());
	}

	@Test
	public void emptyBoardTest() {
		for (int i = 0; i < TicTacToeBoard.ROW_COUNT; i++) {
			for (int j = 0; j < TicTacToeBoard.COLUMN_COUNT; j++) {
				assertEquals(null, ticTacToeBoard_Laursen.getMark(i, j));
			}
		}
		assertEquals(Mark.X, ticTacToeBoard_Laursen.getTurn());
		assertEquals(false, ticTacToeBoard_Laursen.isGameOver());
	}

	@Test(expected = AssertionError.class) // this fails because if the game is over, it shouldn't be anyone's turn
	public void getTurnTest() {
		int[] moveArray = new int[] { 0, 1, 2, 3, 4, 5, 6, -1, -1 };
		for (int i : moveArray) {

			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
		getPrettyString(ticTacToeBoard_Laursen);
		assertTrue(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(Mark.X, ticTacToeBoard_Laursen.getWinner());
		assertEquals(null, ticTacToeBoard_Laursen.getTurn());
	}

	@Test(expected = AssertionError.class)
	public void DuplicateTest() {
		int[] moveArray = new int[] { 0, 1, 2, 3, 5, 4, 6, 6, 7 };
			for (int i : moveArray) {
				int row = i / 3;
				int column = i % 3;
				ticTacToeBoard_Laursen.setMark(row, column);
			}
		getPrettyString(ticTacToeBoard_Laursen);
	}
	
	@Test//(expected = AssertionError.class)
	public void DifferentNoMoveInt() {
		int[] moveArray = new int[] { 0, 1, 2, 3, 5, 4, -2, -2, -2 };
			for (int i : moveArray) {
				int row = i / 3;
				int column = i % 3;
				ticTacToeBoard_Laursen.setMark(row, column);
			}
		getPrettyString(ticTacToeBoard_Laursen);
		assertFalse(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(null, ticTacToeBoard_Laursen.getWinner());
	}


	@Test
	public void emptySetTest() {
		int[] moveArray = new int[] {};
		for (int i : moveArray) {
			int row = i / 3;
			int column = i % 3;
			ticTacToeBoard_Laursen.setMark(row, column);
		}
		assertFalse(ticTacToeBoard_Laursen.isGameOver());
		assertEquals(null, ticTacToeBoard_Laursen.getWinner());
	}

	@Test
	public void oneSymbolTest() {
		final int ROW = 0;
		final int COLUMN = 2;
		final Mark MARK = Mark.X;
		ticTacToeBoard_Laursen.setMark(ROW, COLUMN);
		for (int i = 0; i < TicTacToeBoard.ROW_COUNT; i++) {
			for (int j = 0; j < TicTacToeBoard.COLUMN_COUNT; j++) {
				if (i == ROW && j == COLUMN) {
					assertEquals(MARK, ticTacToeBoard_Laursen.getMark(i, j));
				}
			}
		}
	}

	@Test(expected = AssertionError.class)
	public void setMark_OutOfRange() {
		final int ROW1 = 4;
		final int COLUMN1 = 4;
		ticTacToeBoard_Laursen.setMark(ROW1, COLUMN1);
	}

}
