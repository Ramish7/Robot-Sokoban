package robotSokoban;

public class Box extends Figure {

 public Box(int row, int col, String filename) {
  super(row, col, filename);
 }
 public void move(int row, int col){
  int row1 = this.getRow() + row;
  int col1 = this.getCol() + col;
  this.setRow(row1);
  this.setCol(col1);
 }
}
