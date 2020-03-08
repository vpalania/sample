package project1.constructors;

import javax.swing.JOptionPane;
public class TestRectangle3 {
   public static void main(String[] args) {
      Rectangle r3 = new Rectangle(3.0, 5.0);
      JOptionPane.showMessageDialog(null,
         "Rectangle 3"
         + "\nLength: " + r3.getLength()
         + "\nWidth: " + r3.getWidth()
         + "\nName: " + r3.getName()
      );
   }
}

