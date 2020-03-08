package project1.exceptions;

import javax.swing.JOptionPane;
public class MultipleCatchError {
   public static void main(String[] args) {
      int[] x = {10, 20, 30};

      /* If y = -1, then ArrayIndexOutOfBoundsException
       * If y = 1, then ArithmeticException
       */
      int y = -1;
      
      try {
         int z = x[y]/0;
         JOptionPane.showMessageDialog(null, "z = " + z);
      }
      catch (ArrayIndexOutOfBoundsException e) {
         JOptionPane.showMessageDialog(null, "ERROR! Index out of bounds");
      }
      catch (ArithmeticException e) {
       JOptionPane.showMessageDialog(null, "ERROR! Division by zero");
      }
   }
}





