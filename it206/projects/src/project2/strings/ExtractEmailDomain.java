package project2.strings;

import javax.swing.JOptionPane;
public class ExtractEmailDomain {
   public static void main(String[] args) {
      String email = JOptionPane.showInputDialog(
         "Enter your email address: ");
      int position = email.indexOf('@');
      if (position > 0) {
         JOptionPane.showMessageDialog(null, "Domain: "
            + email.substring(position+1));
      }
      else {
         JOptionPane.showMessageDialog(null, "Invalid email address!");
      }

   }
}


