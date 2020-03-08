package project1.constructors;

import javax.swing.JOptionPane;
public class TestRectangle2 {
   public static void main(String[] args) {
      Rectangle r2 = new Rectangle("My Rectangle");
      JOptionPane.showMessageDialog(null,
         "Rectangle 2"
         + "\nLength: " + r2.getLength()
         + "\nWidth: " + r2.getWidth()
         + "\nName: " + r2.getName()
      );
   }
}

