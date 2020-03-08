package project1.exceptions;

import javax.swing.JOptionPane;
public class ExitProgramExample {  
   public static void main(String args[]) throws NumberFormatException {
      boolean error = true;
      
      if (error) {
         JOptionPane.showMessageDialog(null, "Error Found!",
            "Error Dialog", JOptionPane.ERROR_MESSAGE);
         System.exit(99); // programmer made up error code (99)
	   }
   }
}


