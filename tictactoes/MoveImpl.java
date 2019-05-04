package tictactoes;

public class MoveImpl implements Move {
  private int row;
  private int col;
  private Mark mark;

  public MoveImpl(final int row, final int col, final Mark mark) {
    this.row = row;
    this.col = col;
    this.mark = mark;
  }

  @Override
  public int getRow() {
    return row;
  }

  @Override
  public int getColumn() {
    return col;
  }

  @Override
  public Mark getMark() {
    return mark;
  }
}
