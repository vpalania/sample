package project2.strings;

import javax.swing.JOptionPane;
public class ValidateZipCode {
   public static void main(String[] args) {
      String zipCode = JOptionPane.showInputDialog(
         "Enter your zip code: ");
      
      String zipCodeNumbers = zipCode.replace("-", "");
         
      boolean validZipCode = true;
      
      if (zipCodeNumbers.length() != 5 && zipCodeNumbers.length() != 9) {
         validZipCode = false;
      }
      
      int x = 0;
      while (validZipCode && x < zipCodeNumbers.length()) {
         if (!Character.isDigit(zipCodeNumbers.charAt(x))) {
            validZipCode = false;
          }      
          else {
            ++x;
          }
      }
      
      if (validZipCode) {
         JOptionPane.showMessageDialog(null, "Zip Code: " + zipCode);
      }
      else {
         JOptionPane.showMessageDialog(null, "You did not enter a valid zip code");
      }
   }
}



