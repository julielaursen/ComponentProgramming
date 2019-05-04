//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package tictactoes;

import java.util.ArrayList;
import java.util.List;

import tictactoes.TicTacToeBoard;

public class ChickenPlayerUtils_Laursen {
  static int[] intArray = new int[]{1, 5, 7, 3, 2, 6, 8, 0, 5};

  private ChickenPlayerUtils_Laursen() {
  }

  public static List<Integer> getRandomLocationList(TicTacToeBoard ticTacToeBoard) {
    List<Integer> randomLocationList = new ArrayList();

    for(int i = 0; i < 3; ++i) {
      for(int j = 0; j < 3; ++j) {
        if (ticTacToeBoard.getMark(i, j) == null) {
          randomLocationList.add(j * 3 + i);
        }
      }
    }

    return randomLocationList;
  }

  public static List<Integer> getTerribleChickenLocationList(TicTacToeBoard ticTacToeBoard) {
    List<Integer> terribleLocationList = new ArrayList();
    int[] var5;
    int var4 = (var5 = intArray).length;

    for(int var3 = 0; var3 < var4; ++var3) {
      int i = var5[var3];
      int row = i / 3;
      int col = i % 3;
      if (ticTacToeBoard.getMark(row, col) == null) {
        System.out.println("Row " + row + "Col " + col);
        terribleLocationList.add(i);
        System.out.println("Index" + i);
      }
    }

    System.out.println("Terrible location list: " + terribleLocationList);
    return terribleLocationList;
  }
}
