package tictactoes;

import java.util.List;
import java.util.Random;

public class RandomChickenPlayerImpl implements tictactoes.Player {
  @Override
  public tictactoes.Move getNextMove(final TicTacToeBoard ticTacToeBoard) {
    final List<Integer> randomLocationList = ChickenPlayerUtils_Laursen.getRandomLocationList(ticTacToeBoard);
    final Integer index = randomLocationList.get(new Random().nextInt(randomLocationList.size()));
    int row = index/3;
    int col = index%3;
    return new MoveImpl(row, col, ticTacToeBoard.getTurn());
  }
}
