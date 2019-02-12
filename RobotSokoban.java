package robotSokoban;

import javax.swing.JFrame;

public final class RobotSokoban extends JFrame{
 public static RobotSokoban sokoban = new RobotSokoban();
 private final int OFFSET = 39;

 public RobotSokoban() {
  Board board = new Board();

  add(board);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(board.getBoardWidth()+(OFFSET/2-3),
    board.getBoardHeight()+OFFSET);
  setLocationRelativeTo(null);         
  setTitle("Robot Sokoban");

 }
 public void goMainMenu(){
  sokoban.dispose();
  Menu newMenu = new Menu();
  newMenu.createAndShowGUI();
 }

 //public static void main(String[] args) {
 // sokoban.setVisible(true);
 //}
}