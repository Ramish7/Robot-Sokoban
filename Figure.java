package robotSokoban;
 import java.awt.*;
 import java.net.*;
 import javax.swing.*;
public abstract class Figure {
 protected int row;
 protected int col;
 protected Image image;
 public Figure(int row,int col,String filename){
  this.row = row;
  this.col = col;
  URL loc = this.getClass().getResource(filename);
  ImageIcon pic = new ImageIcon(loc);
  Image image = pic.getImage();
  this.image = image; 
 }
 public Image getImage(){
  return this.image;
 }
 public void setImage(String image){
  URL loc = this.getClass().getResource(image);
  ImageIcon pic = new ImageIcon(loc);
  Image image1 = pic.getImage();
  this.image = image1;
 }
 public int getRow(){
  return this.row;
 }
 public int getCol(){
  return this.col;
 }
 public void setRow(int row){
  this.row = row;
 }
 public void setCol(int col){
  this.col = col;
 }
}
