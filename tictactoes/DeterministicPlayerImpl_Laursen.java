package tictactoes;

import java.util.List;

public class DeterministicPlayerImpl_Laursen implements tictactoes.Player {

  public DeterministicPlayerImpl_Laursen(final List<Integer> rankedLocationList_lrtb) {
  }

  @Override
  public tictactoes.Move getNextMove(final tictactoes.TicTacToeBoard ticTacToeBoard) {
    final List<Integer> terribleChickenLocationList =
        ChickenPlayerUtils_Laursen.getTerribleChickenLocationList(ticTacToeBoard);
    final Integer index = terribleChickenLocationList.get(0);
    int row = index / 3;
    int col = index % 3;
    return new MoveImpl(row, col, ticTacToeBoard.getTurn());
  }
}
