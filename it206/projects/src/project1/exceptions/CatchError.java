package project1.exceptions;

import javax.swing.JOptionPane;
public class CatchError {
   public static void main(String[] args) {
      int x = 206;
      int y = 0;
      
      try {
         int z = x/y;
         JOptionPane.showMessageDialog(null, "z = " + z);
      }
      catch (ArithmeticException e) {
         JOptionPane.showMessageDialog(null, "ERROR! Division by zero");
      }
   }
}



