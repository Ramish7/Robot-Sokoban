package robotSokoban;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Level extends JPanel implements ActionListener {
 protected JButton b1, b2, b3, b4, b5, b6, b7, b8;   
 public static int level;   
 public Level()
 {
  b1 = new JButton("level 1");
  b2 = new JButton("Level 2");
  b3 = new JButton("Level 3");
  b4 = new JButton("Level 4");
  b5 = new JButton("Level 5");
  b6 = new JButton("Level 6");
  b7 = new JButton("Level 7");
  b8 = new JButton("Level 8");

  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  b8.addActionListener(this);

  b1.setBackground(Color.green);
  b2.setBackground(Color.blue);
  b3.setBackground(Color.CYAN);
  b4.setBackground(Color.pink);
  b5.setBackground(Color.magenta);
  b6.setBackground(Color.ORANGE);
  b7.setBackground(Color.RED);
  b8.setBackground(Color.YELLOW);

  add(b1);
  add(b2);
  add(b3);
  add(b4);
  add(b5);
  add(b6);
  add(b7);
  add(b8);

  JPanel p1 = new JPanel();
  JPanel p2 = new JPanel();

  p1.setLayout (new BoxLayout (p1, BoxLayout.X_AXIS));
  p1.add(b1);
  p1.add (javax.swing.Box.createRigidArea(new Dimension(20, 0)));
  p1.add(b2);
  p1.add (javax.swing.Box.createRigidArea(new Dimension(20, 0)));
  p1.add(b3);
  p1.add (javax.swing.Box.createRigidArea(new Dimension(20, 0)));
  p1.add(b4);
  p1.add (javax.swing.Box.createRigidArea(new Dimension(20, 0)));

  p2.add(b5);
  p2.add (javax.swing.Box.createRigidArea(new Dimension(20, 0))); 
  p2.add(b6);
  p2.add (javax.swing.Box.createRigidArea(new Dimension(20, 0)));
  p2.add(b7);
  p2.add (javax.swing.Box.createRigidArea(new Dimension(20, 0)));
  p2.add(b8);
  p2.add (javax.swing.Box.createRigidArea(new Dimension(20, 0)));

  p2.setLayout (new BoxLayout (p2, BoxLayout.X_AXIS));

  p1.setBackground(Color.green);
  p2.setBackground(Color.green);      
  setBackground(Color.orange);

  setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
  add (javax.swing.Box.createRigidArea(new Dimension(20, 20)));
  add(p1);
  add (javax.swing.Box.createRigidArea(new Dimension(20, 20)));
  add(p2);
  add (javax.swing.Box.createRigidArea(new Dimension(20, 20)));
 }
 static String[][] level1 = new String[][]{{"W","W","W","W","W","W"," "},
  {"W","P","B","P","F","W","W"},//25 point
  {"W","F","P","P","B","P","W"},
  {"W","P","P","B","R","F","W"},
  {"W","W","W","W","W","W","W"}};

  static String[][] level2 = new String[][]{{"W","W","W","W","W","W","W"},//PULL
   {"W","B","P","P","F","R","W"},//35 point
   {"W","W","W","W","W","W","W"}};

   static String[][] level3 = new String[][]{{"W","W","W","W","W","W","W","W","W","W"},//SWÝTCH
    {"W","R","P","B","B","P","P","F","F","W"},//45
    {"W","W","W","W","W","W","W","W","W","W"}};

    static String[][] level4 = new String[][]{{"W","W","W","W","W","W","W","W","W"},
     {"W","R","P","P","W","P","B","F","W"},//20
     {"W","F","B","P","r","P","P","P","W"},
     {"W","P","P","P","W","P","P","P","W"},
     {"W","W","W","W","W","W","W","d","W"},
     {"W","F","B","P","l","P","P","P","W"},
     {"W","P","P","P","W","F","B","P","W"},
     {"W","W","W","W","W","W","W","W","W"}};

     static String[][] level5 = new String[][]{{"W","W","W","W","W","W","W","W","W"},//TELEPORT
      {"W","P","P","B","P","F","W","F","W"},//20
      {"W","F","B","P","I","W","W","P","W"},
      {"W","P","P","P","W","W","P","B","W"},
      {"W","P","P","W","W","W","P","P","W"},
      {"W","P","W","W","P","P","P","P","W"},
      {"W","R","W","O","P","P","B","F","W"},
      {"W","W","W","W","W","W","W","W","W"}};

      static String[][] level6 = new String[][]{{"W","W","W","W","W","W","W"," "},//90
       {"W","P","P","P","P","P","W","W"},
       {"W","P","W","W","B","B","P","W"},
       {"W","P","W","P","P","W","P","W"},
       {"W","P","P","P","P","W","P","W"},
       {"W","F","W","P","P","r","P","W"},
       {"W","F","P","R","W","W","W","W"},
       {"W","W","W","W","W"," "," ","W"}};

       static String[][] level7 = new String[][]{{"W","W","W","W","W","W","W"},//35
        {"W","R","P","B","F","P","W"},
        {"W","u","W","W","W","d","W"},
        {"W","I","W","F","W","P","W"},
        {"W","P","W","B","W","P","W"},
        {"W","P","W","O","W","P","W"},
        {"W","P","W","W","W","P","W"},
        {"W","P","P","P","l","P","W"},
        {"W","P","B","P","W","W","W"},
        {"W","P","P","F","W"," "," "},
        {"W","W","W","W","W"," "," "}};

        static String[][] level8 = new String[][]{{"W","W","W","W","W"," ","W","W","W","W","W"},//200
         {"W","P","P","P","W","W","W","P","P","P","W"},
         {"W","P","P","P","P","W","W","P","P","P","W"},
         {"W","W","P","P","P","P","B","B","P","W"," "},
         {" ","W","P","P","W","P","P","B","P","W"," "},
         {" ","W","W","W","P","P","W","P","P","W"," "},
         {" "," "," ","W","P","R","W","W","W","W"," "},
         {" "," "," ","W","P","P","P","P","W"," "," "},
         {" ","W","W","W","P","W","W","P","W"," "," "},
         {" ","W","P","P","P","P","W","P","W"," "," "},
         {" ","W","F","F","P","F","W","P","W"," "," "},
         {" ","W","W","P","W","W","W","P","W"," "," "},
         {" "," ","W","P","P","P","P","P","W"," "," "},
         {" "," ","W","W","W","W","W","W","W"," "," "}};

         public void actionPerformed(ActionEvent event) {
          if (event.getSource() == b1)
          {     
           level = 0;
           RobotSokoban next = new RobotSokoban();
           next.setVisible(true);
          }
          else if (event.getSource() == b2)
          {       
           level = 1;
           RobotSokoban next = new RobotSokoban();
           next.setVisible(true);
          }
          else if (event.getSource() == b3)
          {       
           level = 2;
           RobotSokoban next = new RobotSokoban();
           next.setVisible(true);
          }
          else if (event.getSource() == b4)
          {      
           level = 3;
           RobotSokoban next = new RobotSokoban();
           next.setVisible(true);
          }
          else if (event.getSource() == b5)
          {      
           level = 4;
           RobotSokoban next = new RobotSokoban();
           next.setVisible(true);
          }
          else if (event.getSource() == b6)
          {
           level = 5;
           RobotSokoban next = new RobotSokoban();
           next.setVisible(true);
          }
          else if (event.getSource() == b7)
          {
           level = 6;
           RobotSokoban next = new RobotSokoban();
           next.setVisible(true);
          }
          else if (event.getSource() == b8)
          {

           level = 7;
           RobotSokoban next = new RobotSokoban();
           next.setVisible(true);
          }


         }
         private static String[][][] allmaps = {level1,level2,level3,level4,level5,level6,level7,level8};
         public static int getLevelEnergies(){
          if(level == 0)
           return 25;
          else if(level == 1)
           return 35;
          else if(level == 2)
           return 45;
          else if(level == 3)
           return 20;
          else if(level == 4)
           return 20;
          else if(level == 5)
           return 90;
          else if(level == 6)
           return 35;
          else if(level == 7)
           return 200;
          else
           return 0;
         }  

         public static String[][] getLevel(){
          return allmaps[level];
         }
         public static void ShowGraphics() {

          JFrame frame = new JFrame("RobotSokoban");

          Level newContentPane = new Level();
          newContentPane.setOpaque(true);
          frame.setContentPane(newContentPane);

          frame.pack();
          frame.setVisible(true);
         }
}