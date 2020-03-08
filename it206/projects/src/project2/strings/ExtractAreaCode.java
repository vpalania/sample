package project2.strings;

import javax.swing.JOptionPane;
public class ExtractAreaCode {
   public static void main(String[] args) {
      String phoneNumber = JOptionPane.showInputDialog(
         "Enter your phone number with area code in the format: XXX-XXX-XXXX");
      String areaCode = phoneNumber.substring(0, 3);
      JOptionPane.showMessageDialog(null, "The area code is: " + areaCode);
   }
}


