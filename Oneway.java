package robotSokoban;

public class Oneway extends Figure {
 int direction;
 // up = 1,down = 2, right = 3,left = 4,
 public Oneway(int row, int col, String oneway,int a) {
  super(row, col, oneway);
  direction = a;
 }

}
