//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TicTacToeBoardImplTest_Laursen {
  private tictactoe.TicTacToeBoard ticTacToeBoard_Laursen;

  public TicTacToeBoardImplTest_Laursen() {
  }

  @Before
  public void setUp() {
    this.ticTacToeBoard_Laursen = new tictactoe.TicTacToeBoardImpl_Laursen();
  }

  private void getPrettyString(tictactoe.TicTacToeBoard movesArray) {
    int i;
    for(i = 0; i < 3; ++i) {
      System.out.print(movesArray.getMark(0, i) == null ? " | " : movesArray.getMark(0, i));
    }

    System.out.println("\n------");

    for(i = 0; i < 3; ++i) {
      System.out.print(movesArray.getMark(1, i) == null ? " | " : movesArray.getMark(1, i));
    }

    System.out.println("\n------");

    for(i = 0; i < 3; ++i) {
      System.out.print(movesArray.getMark(2, i) == null ? " | " : movesArray.getMark(2, i));
    }

    System.out.println();
  }

  private static List<Integer> getLeftToRightTopToBottomLocationList(int rowCount, int columnCount) {
    List<Integer> locationList_LRTB = new ArrayList();
    int location = 0;

    for(int i = 0; i < rowCount; ++i) {
      for(int j = 0; j < columnCount; ++j) {
        locationList_LRTB.add(location);
        ++location;
      }
    }

    return locationList_LRTB;
  }

  @Test
  public void testDeterministicChicken() {
    List<Integer> rankedLocationList_LRTB = getLeftToRightTopToBottomLocationList(3, 3);
    tictactoe.Player DeterministicChicken = new DeterministicPlayerImpl_Laursen(rankedLocationList_LRTB);
    this.ticTacToeBoard_Laursen.setMark(0, 2);
    this.ticTacToeBoard_Laursen.setMark(1, 1);
    this.ticTacToeBoard_Laursen.setMark(2, 1);
    this.ticTacToeBoard_Laursen.setMark(0, 0);
    this.getPrettyString(this.ticTacToeBoard_Laursen);
    tictactoe.Move move = DeterministicChicken.getNextMove(this.ticTacToeBoard_Laursen);
    tictactoe.Mark EMPTY = null;
    Assert.assertTrue(EMPTY == this.ticTacToeBoard_Laursen.getMark(move.getRow(), move.getColumn()));
    int rowOfHighestRankedEmptyLocation = 0;
    int columnOfHighestRankedEmptyLocation = 1;
    Assert.assertTrue(rowOfHighestRankedEmptyLocation == move.getRow());
    Assert.assertTrue(columnOfHighestRankedEmptyLocation == move.getColumn());
    tictactoe.Mark markOfNextMove = this.ticTacToeBoard_Laursen.getTurn();
    Assert.assertTrue(markOfNextMove == move.getMark());
  }

  @Test
  public void testDeterministicChicken2() {
    List<Integer> rankedLocationList_LRTB = getLeftToRightTopToBottomLocationList(3, 3);
    tictactoe.Player DeterministicChicken = new DeterministicPlayerImpl_Laursen(rankedLocationList_LRTB);
    this.ticTacToeBoard_Laursen.setMark(0, 2);
    this.ticTacToeBoard_Laursen.setMark(1, 1);
    this.ticTacToeBoard_Laursen.setMark(2, 1);
    this.ticTacToeBoard_Laursen.setMark(0, 0);
    this.ticTacToeBoard_Laursen.setMark(0, 1);
    this.getPrettyString(this.ticTacToeBoard_Laursen);
    tictactoe.Move move = DeterministicChicken.getNextMove(this.ticTacToeBoard_Laursen);
    tictactoe.Mark EMPTY = null;
    Assert.assertTrue(EMPTY == this.ticTacToeBoard_Laursen.getMark(move.getRow(), move.getColumn()));
    int rowOfHighestRankedEmptyLocation = 1;
    int columnOfHighestRankedEmptyLocation = 2;
    Assert.assertTrue(rowOfHighestRankedEmptyLocation == move.getRow());
    Assert.assertTrue(columnOfHighestRankedEmptyLocation == move.getColumn());
    tictactoe.Mark markOfNextMove = this.ticTacToeBoard_Laursen.getTurn();
    Assert.assertTrue(markOfNextMove == move.getMark());
  }

  @Test
  public void testDeterministicChicken3() {
    List<Integer> rankedLocationList_LRTB = getLeftToRightTopToBottomLocationList(3, 3);
    tictactoe.Player DeterministicChicken = new DeterministicPlayerImpl_Laursen(rankedLocationList_LRTB);
    this.ticTacToeBoard_Laursen.setMark(0, 2);
    this.ticTacToeBoard_Laursen.setMark(1, 1);
    this.ticTacToeBoard_Laursen.setMark(2, 1);
    this.ticTacToeBoard_Laursen.setMark(0, 0);
    this.ticTacToeBoard_Laursen.setMark(0, 1);
    this.ticTacToeBoard_Laursen.setMark(1, 0);
    this.getPrettyString(this.ticTacToeBoard_Laursen);
    tictactoe.Move move = DeterministicChicken.getNextMove(this.ticTacToeBoard_Laursen);
    tictactoe.Mark EMPTY = null;
    Assert.assertTrue(EMPTY == this.ticTacToeBoard_Laursen.getMark(move.getRow(), move.getColumn()));
    int rowOfHighestRankedEmptyLocation = 1;
    int columnOfHighestRankedEmptyLocation = 2;
    Assert.assertTrue(rowOfHighestRankedEmptyLocation == move.getRow());
    Assert.assertTrue(columnOfHighestRankedEmptyLocation == move.getColumn());
    tictactoe.Mark markOfNextMove = this.ticTacToeBoard_Laursen.getTurn();
    Assert.assertTrue(markOfNextMove == move.getMark());
  }

  @Test
  public void testDeterministicChickenWinnerO() {
    List<Integer> rankedLocationList_LRTB = getLeftToRightTopToBottomLocationList(3, 3);
    tictactoe.Player DeterministicChicken = new DeterministicPlayerImpl_Laursen(rankedLocationList_LRTB);
    this.ticTacToeBoard_Laursen.setMark(0, 2);
    this.ticTacToeBoard_Laursen.setMark(1, 1);
    this.ticTacToeBoard_Laursen.setMark(2, 1);
    this.ticTacToeBoard_Laursen.setMark(0, 0);
    this.ticTacToeBoard_Laursen.setMark(0, 1);
    this.ticTacToeBoard_Laursen.setMark(1, 0);
    this.ticTacToeBoard_Laursen.setMark(1, 2);
    this.getPrettyString(this.ticTacToeBoard_Laursen);
    tictactoe.Move move = DeterministicChicken.getNextMove(this.ticTacToeBoard_Laursen);
    tictactoe.Mark EMPTY = null;
    Assert.assertTrue(EMPTY == this.ticTacToeBoard_Laursen.getMark(move.getRow(), move.getColumn()));
    int rowOfHighestRankedEmptyLocation = 2;
    int columnOfHighestRankedEmptyLocation = 0;
    Assert.assertTrue(rowOfHighestRankedEmptyLocation == move.getRow());
    Assert.assertTrue(columnOfHighestRankedEmptyLocation == move.getColumn());
    tictactoe.Mark markOfNextMove = this.ticTacToeBoard_Laursen.getTurn();
    Assert.assertTrue(markOfNextMove == move.getMark());
    this.ticTacToeBoard_Laursen.setMark(rowOfHighestRankedEmptyLocation, columnOfHighestRankedEmptyLocation);
    Assert.assertEquals(true, this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals(tictactoe.Mark.O, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test
  public void testRandomChicken() {
    tictactoe.Player randomChicken = new RandomChickenPlayerImpl();
    this.ticTacToeBoard_Laursen.setMark(0, 2);
    this.ticTacToeBoard_Laursen.setMark(1, 1);
    this.ticTacToeBoard_Laursen.setMark(2, 1);
    this.ticTacToeBoard_Laursen.setMark(0, 0);
    tictactoe.Move move = randomChicken.getNextMove(this.ticTacToeBoard_Laursen);
    tictactoe.Mark EMPTY = null;
    Assert.assertTrue(EMPTY == this.ticTacToeBoard_Laursen.getMark(move.getRow(), move.getColumn()));
    tictactoe.Mark markOfNextMove = this.ticTacToeBoard_Laursen.getTurn();
    Assert.assertTrue(markOfNextMove == move.getMark());
  }

  @Test
  public void testTerribleChicken() {
    List<Integer> terribleRankedLocationList = Arrays.asList(1, 5, 6, 3, 2, 6, 8, 0, 4);
    tictactoe.Player terribleChicken = new DeterministicPlayerImpl_Laursen(terribleRankedLocationList);
    this.ticTacToeBoard_Laursen.setMark(0, 2);
    this.ticTacToeBoard_Laursen.setMark(1, 1);
    this.ticTacToeBoard_Laursen.setMark(2, 1);
    this.ticTacToeBoard_Laursen.setMark(0, 0);
    tictactoe.Move move = terribleChicken.getNextMove(this.ticTacToeBoard_Laursen);
    tictactoe.Mark EMPTY = null;
    Assert.assertTrue(EMPTY == this.ticTacToeBoard_Laursen.getMark(move.getRow(), move.getColumn()));
    int rowOfHighestRankedEmptyLocation = 0;
    int columnOfHighestRankedEmptyLocation = 1;
    Assert.assertTrue(rowOfHighestRankedEmptyLocation == move.getRow());
    Assert.assertTrue(columnOfHighestRankedEmptyLocation == move.getColumn());
    tictactoe.Mark markOfNextMove = this.ticTacToeBoard_Laursen.getTurn();
    Assert.assertTrue(markOfNextMove == move.getMark());
  }

  @Test
  public void chickenVsChicken() {
    List<Integer> randomRankedLocationList = tictactoe.ChickenPlayerUtils_Laursen.getRandomLocationList(this.ticTacToeBoard_Laursen);
    tictactoe.Player randomChicken = new DeterministicPlayerImpl_Laursen(randomRankedLocationList);
    List<Integer> terribleRankedLocationList = Arrays.asList(1, 5, 7, 3, 2, 6, 8, 0, 4);
    tictactoe.Player terribleChicken = new DeterministicPlayerImpl_Laursen(terribleRankedLocationList);
    tictactoe.Player[] playerOrder = new tictactoe.Player[]{randomChicken, terribleChicken};
    int INDEX_OF_X = false;
    boolean var7 = true;

    while(!this.ticTacToeBoard_Laursen.isGameOver()) {
      int indexOfCurrentPlayer = this.ticTacToeBoard_Laursen.getTurn() == tictactoe.Mark.X ? 0 : 1;
      tictactoe.Player currentPlayer = playerOrder[indexOfCurrentPlayer];
      tictactoe.Move nextMove = currentPlayer.getNextMove(this.ticTacToeBoard_Laursen);
      int nextMoveRow = nextMove.getRow();
      int nextMoveColumn = nextMove.getColumn();
      this.ticTacToeBoard_Laursen.setMark(nextMoveRow, nextMoveColumn);
    }

    tictactoe.Mark TIE = null;
    if (this.ticTacToeBoard_Laursen.getWinner() != TIE) {
      System.out.println("Tie");
    } else {
      tictactoe.Mark winner = this.ticTacToeBoard_Laursen.getWinner();
      tictactoe.Player winningPlayer = winner == tictactoe.Mark.X ? playerOrder[0] : playerOrder[1];
      if (winningPlayer == randomChicken) {
        System.out.println("Random chicken is the winner");
      }
    }

  }

  @Test
  public void testRandomChicken2() {
    List<Integer> randomRankedLocationList = tictactoe.ChickenPlayerUtils_Laursen.getRandomLocationList(this.ticTacToeBoard_Laursen);
    new DeterministicPlayerImpl_Laursen(randomRankedLocationList);
    this.ticTacToeBoard_Laursen.setMark(0, 2);
    this.ticTacToeBoard_Laursen.setMark(1, 1);
  }

  @Test
  public void playGame() {
    int[] moveArray = new int[]{0, 1, 2, 3, 5, 4, 6, 8, 7};
    int i = 0;
    Random r = new Random();
    int player = r.nextInt(2);

    while(!this.ticTacToeBoard_Laursen.isGameOver()) {
      this.getPrettyString(this.ticTacToeBoard_Laursen);
      int row = moveArray[i] / 3;

      int column;
      for(column = moveArray[i] % 3; this.ticTacToeBoard_Laursen.getMark(row, column) != null; column = moveArray[i] % 3) {
        ++i;
        row = moveArray[i] / 3;
      }

      this.ticTacToeBoard_Laursen.setMark(row, column);
      if (!this.ticTacToeBoard_Laursen.isGameOver()) {
        if (player == 0) {
          this.badChicken();
        } else {
          this.goodChicken();
        }
      }
    }

    this.getPrettyString(this.ticTacToeBoard_Laursen);
    System.out.printf("winner: %s\n", this.ticTacToeBoard_Laursen.getWinner());
  }

  public void badChicken() {
    for(int i = 0; i < 3; ++i) {
      for(int j = 0; j < 3; ++j) {
        if (this.ticTacToeBoard_Laursen.getMark(i, j) == null) {
          this.ticTacToeBoard_Laursen.setMark(i, j);
          return;
        }
      }
    }

  }

  public void goodChicken() {
    int[] possibleMoves = new int[9];
    int count = 0;

    int i;
    int j;
    for(i = 0; i < 3; ++i) {
      for(j = 0; j < 3; ++j) {
        if (this.ticTacToeBoard_Laursen.getMark(i, j) == null) {
          possibleMoves[count] = i * 3 + j;
          ++count;
        }
      }
    }

    System.out.print("possible Moves: ");

    for(i = 0; i < count; ++i) {
      System.out.printf("%d ", possibleMoves[i]);
    }

    System.out.println();
    Random r = new Random();
    j = r.nextInt(count);
    System.out.printf("Move: %d\n", possibleMoves[j]);
    int row = possibleMoves[j] / 3;
    int column = possibleMoves[j] % 3;
    this.ticTacToeBoard_Laursen.setMark(row, column);
  }

  @Test
  public void GetMark1() {
    int[] moveArray = new int[]{0, 1, 2, 3, 5, 4, 6, 8, 7};
    tictactoe.Mark mark = tictactoe.Mark.X;
    int[] var6 = moveArray;
    int var5 = moveArray.length;

    for(int var4 = 0; var4 < var5; ++var4) {
      int i = var6[var4];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
      mark = tictactoe.Mark.values()[(mark.ordinal() + 1) % 2];
    }

    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getMark(0, 0));
    Assert.assertEquals(tictactoe.Mark.O, this.ticTacToeBoard_Laursen.getMark(0, 1));
    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getMark(0, 2));
    Assert.assertEquals(tictactoe.Mark.O, this.ticTacToeBoard_Laursen.getMark(1, 0));
    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getMark(1, 2));
    Assert.assertEquals(tictactoe.Mark.O, this.ticTacToeBoard_Laursen.getMark(1, 1));
    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getMark(2, 0));
    Assert.assertEquals(tictactoe.Mark.O, this.ticTacToeBoard_Laursen.getMark(2, 2));
    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getMark(2, 1));
  }

  @Test
  public void GetMarkNegative() {
    int[] moveArray = new int[0];
    tictactoe.Mark mark = tictactoe.Mark.X;
    int[] var6 = moveArray;
    int var5 = moveArray.length;

    for(int var4 = 0; var4 < var5; ++var4) {
      int i = var6[var4];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
      mark = tictactoe.Mark.values()[(mark.ordinal() + 1) % 2];
    }

    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getMark(0, 0));
  }

  @Test
  public void NoWinner2() {
    int[] moveArray = new int[]{0, 1, 2, 3, 4, -1, -1, -1, -1};
    tictactoe.Mark mark = tictactoe.Mark.X;
    int[] var6 = moveArray;
    int var5 = moveArray.length;

    for(int var4 = 0; var4 < var5; ++var4) {
      int i = var6[var4];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
      mark = tictactoe.Mark.values()[(mark.ordinal() + 1) % 2];
    }

    Assert.assertFalse(this.ticTacToeBoard_Laursen.isGameOver());
  }

  @Test
  public void GetMarkNull2() {
    int[] moveArray = new int[]{0, 1, 2, 3, 5, 4};
    tictactoe.Mark mark = tictactoe.Mark.X;
    int[] var6 = moveArray;
    int var5 = moveArray.length;

    for(int var4 = 0; var4 < var5; ++var4) {
      int i = var6[var4];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
      mark = tictactoe.Mark.values()[(mark.ordinal() + 1) % 2];
    }

    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getMark(2, 2));
  }

  @Test(
      expected = AssertionError.class
  )
  public void GetMarkOOB() {
    int[] moveArray = new int[0];
    tictactoe.Mark mark = tictactoe.Mark.X;
    int[] var6 = moveArray;
    int var5 = moveArray.length;

    for(int var4 = 0; var4 < var5; ++var4) {
      int i = var6[var4];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
      mark = tictactoe.Mark.values()[(mark.ordinal() + 1) % 2];
    }

    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getMark(9, 9));
  }

  @Test(
      expected = AssertionError.class
  )
  public void SetMarkTwice() {
    int[] moveArray = new int[]{0, 1, 2, 3, 5, 4, 6, 8, 7};
    tictactoe.Mark mark = tictactoe.Mark.X;
    int[] var6 = moveArray;
    int var5 = moveArray.length;

    for(int var4 = 0; var4 < var5; ++var4) {
      int i = var6[var4];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
      this.ticTacToeBoard_Laursen.setMark(row, column);
      mark = tictactoe.Mark.values()[(mark.ordinal() + 1) % 2];
    }

  }

  @Test
  public void breakOnNegative() {
    int[] moveArray = new int[]{0, 8, 3, 5, -1, -1, -1, -1, -1};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

  }

  @Test
  public void testTargetMethod() {
    int[] moveArray = new int[]{0, 1, 2, 7, 5, 3, 6, 8, 4};
    Assert.assertEquals(5L, (long) tictactoe.TicTacToeBoardImpl_Laursen.getSmallestIndex(moveArray, 3));
    Assert.assertEquals(-1L, (long) tictactoe.TicTacToeBoardImpl_Laursen.getSmallestIndex(moveArray, 9));
  }

  @Test(
      expected = AssertionError.class
  )
  public void testTargetMethod2() {
    int[] moveArray = new int[]{0, 1, 2, 7, 5, 3, 6, 8, 4, 9, 6, 1};
    tictactoe.TicTacToeBoardImpl_Laursen.getSmallestIndex(moveArray, 6);
  }

  @Test
  public void tieNoWinner() {
    int[] moveArray = new int[]{0, 1, 2, 3, 5, 4, 6, 8, 7};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    System.out.println("Board:");
    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertTrue(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test(
      expected = AssertionError.class
  )
  public void TwoWinnersSameBoard() {
    int[] moveArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    System.out.println("Board:");
    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertTrue(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test(
      expected = AssertionError.class
  )
  public void testOWinsFirst() {
    int[] moveArray = new int[]{4, 5, 3, 2, 1, 8, 7, -1, -1};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    System.out.println("Board:");
    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertTrue(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals(tictactoe.Mark.O, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test
  public void testXWinsFirst() {
    int[] moveArray = new int[]{4, 5, 3, 2, 0, 7, 6};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    System.out.println("Board:");
    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertTrue(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test(
      expected = AssertionError.class
  )
  public void testXWinsFirstAlmostFullBoard() {
    int[] moveArray = new int[]{4, 5, 3, 2, 0, 7, 6, 8, -1};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    System.out.println("Board:");
    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertTrue(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test
  public void MultipleNegatives() {
    int[] moveArray = new int[]{4, 5, 3, 2, 0, -1, -2, -1, -2};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    System.out.println("Board:");
    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertFalse(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test(
      expected = AssertionError.class
  )
  public void testXWinsFirstFullBoard() {
    int[] moveArray = new int[]{4, 5, 3, 2, 0, 7, 6, 8, 1};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    System.out.println("Board:");
    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertTrue(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test(
      expected = AssertionError.class
  )
  public void GameForfeited() {
    int[] moveArray = new int[]{4, 5, -1, -1, -1, -1, -1, -1, -1};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    System.out.println("Board:");
    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertFalse(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test(
      expected = AssertionError.class
  )
  public void testOrder() {
    int[] moveArray = new int[]{4, 5, -1, 6, 7, 8, -1, -1, -1};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertFalse(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test(
      expected = AssertionError.class
  )
  public void tieNoWinnerExtendedArray() {
    int[] moveArray = new int[]{0, 1, 2, 3, 5, 4, 6, 8, 7, -1};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertFalse(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test
  public void smallArray() {
    int[] moveArray = new int[]{4, 5};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    Assert.assertFalse(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test
  public void XhorizontalAndVerticallAtTheSameTime() {
    int[] moveArray = new int[]{1, 0, 3, 2, 5, 8, 7, 6, 4};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertTrue(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test
  public void notwellformed() {
    int[] moveArray = new int[]{0, 4};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getTurn());
    Assert.assertEquals(false, this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test(
      expected = AssertionError.class
  )
  public void emptyBoardTest() {
    for(int i = 0; i < 3; ++i) {
      for(int j = 0; j < 3; ++j) {
        Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getMark(i, j));
        System.out.println(this.ticTacToeBoard_Laursen.getMark(i, j));
      }
    }

    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getTurn());
    Assert.assertEquals(false, this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test(
      expected = AssertionError.class
  )
  public void twoRoundsGetWinner() {
    int[] moveArray = new int[]{0, 4};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getTurn());
    Assert.assertEquals(false, this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test(
      expected = AssertionError.class
  )
  public void twoRoundsGetWinner2() {
    for(int i = 0; i < 3; ++i) {
      for(int j = 0; j < 3; ++j) {
        this.ticTacToeBoard_Laursen.setMark(i, j);
      }
    }

    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getTurn());
    Assert.assertEquals(false, this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test(
      expected = AssertionError.class
  )
  public void twoRoundsGetWinner3() {
    int[] moveArray = new int[]{0, 4};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getTurn());
    Assert.assertEquals(false, this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test(
      expected = AssertionError.class
  )
  public void threeRoundsGetWinner() {
    int[] moveArray = new int[]{0, 4, 6};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertEquals(false, this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test(
      expected = AssertionError.class
  )
  public void getTurnTest() {
    int[] moveArray = new int[]{0, 1, 2, 3, 4, 5, 6, -1, -1};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertTrue(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals(tictactoe.Mark.X, this.ticTacToeBoard_Laursen.getWinner());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getTurn());
  }

  @Test(
      expected = AssertionError.class
  )
  public void DuplicateTest() {
    int[] moveArray = new int[]{0, 1, 2, 3, 5, 4, 6, 6, 7};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    this.getPrettyString(this.ticTacToeBoard_Laursen);
  }

  @Test(
      expected = AssertionError.class
  )
  public void DifferentNoMoveInt() {
    int[] moveArray = new int[]{0, 1, 2, 3, 5, 4, -2, -2, -2};
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    this.getPrettyString(this.ticTacToeBoard_Laursen);
    Assert.assertFalse(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test
  public void emptySetTest() {
    int[] moveArray = new int[0];
    int[] var5 = moveArray;
    int var4 = moveArray.length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int column = i % 3;
      this.ticTacToeBoard_Laursen.setMark(row, column);
    }

    Assert.assertFalse(this.ticTacToeBoard_Laursen.isGameOver());
    Assert.assertEquals((Object)null, this.ticTacToeBoard_Laursen.getWinner());
  }

  @Test
  public void oneSymbolTest() {
    int ROW = false;
    int COLUMN = true;
    tictactoe.Mark MARK = tictactoe.Mark.X;
    this.ticTacToeBoard_Laursen.setMark(0, 2);

    for(int i = 0; i < 3; ++i) {
      for(int j = 0; j < 3; ++j) {
        if (i == 0 && j == 2) {
          Assert.assertEquals(MARK, this.ticTacToeBoard_Laursen.getMark(i, j));
        }
      }
    }

  }

  @Test(
      expected = AssertionError.class
  )
  public void setMark_OutOfRange() {
    int ROW1 = true;
    int COLUMN1 = true;
    this.ticTacToeBoard_Laursen.setMark(4, 4);
  }
}
