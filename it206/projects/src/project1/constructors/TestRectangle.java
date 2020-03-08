package project1.constructors;

import javax.swing.JOptionPane;
public class TestRectangle {
   public static void main(String[] args) {
      Rectangle r1 = new Rectangle();
      JOptionPane.showMessageDialog(null,
         "Rectangle 1"
         + "\nLength: " + r1.getLength()
         + "\nWidth: " + r1.getWidth()
         + "\nName: " + r1.getName()
      );
   }
}

