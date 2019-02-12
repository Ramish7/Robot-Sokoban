
package robotSokoban;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Robot extends Figure {
 int energy;
 int direction;

 public Robot(int row, int col, String robot) {
  super(row, col, robot);
  energy = 200;
 }
 public static void PlaySound(File Sound)
 {
  try
  {
   Clip clip = AudioSystem.getClip();
   clip.open(AudioSystem.getAudioInputStream(Sound));
   clip.start();

   Thread.sleep(clip.getMicrosecondLength()/1000);

  }catch(Exception e)
  {
  }
 }
 public void setEnergy(int e){
  energy = e;
 }
 public int getEnergy(){
  return energy;
 }
 public void move(int row, int col){
  File Step = new File("\\Users\\serkan\\Desktop\\Sokoban\\bin\\RobotSokoban\\stepSound.WAV");
  PlaySound(Step);
  int row1 = this.getRow() + row;
  int col1 = this.getCol() + col;
  this.setRow(row1);
  this.setCol(col1);
  this.energy--;

  if(row == 0 && col == -48){
   setImage("uprobot.png");
   direction = 1;
  }
  else if (row == 0 && col == 48){
   setImage("robot.png");
   direction = 2;
  }
  else if (row == 48 && col == 0){
   setImage("rightrobot.png");
   direction = 3; 
  }

  else if (row == -48 && col == 0){
   setImage("leftrobot.png");
   direction = 4;
  }

 }



}
