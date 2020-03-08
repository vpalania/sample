package project3.arraysOfObjects;

import javax.swing.JOptionPane;

public class PassRectangleObject {
   public static void main(String[] args) {
      Rectangle box = new Rectangle(12.0, 5.0);
      displayRectangle(box);
   }
   
   public static void displayRectangle(Rectangle aRectangle) {
      JOptionPane.showMessageDialog(null,
         "Length of the Rectangle: " + aRectangle.getLength() +
         "\nWidth of the Rectangle: " + aRectangle.getWidth()
      );
   }
}


