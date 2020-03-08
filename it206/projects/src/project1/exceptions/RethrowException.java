package project1.exceptions;

import javax.swing.JOptionPane;
public class RethrowException {
   public static void main(String[] args) {
      try {
         sampleModule();
      }
      catch(NullPointerException e) {
         JOptionPane.showMessageDialog(
            null, "Sorry, an unexpected error occurred: " + e.getMessage());
      }
   }
   
   public static void sampleModule() {
      try {
         // Force an exception to happen for demonstration purposes
         throw new NullPointerException("exception problem");
      }
      catch(NullPointerException e) {
         System.out.println("NullPointerException in sampleModule!");
         throw e;
      }
   }
}

