package project1.exceptions;

import javax.swing.JOptionPane;
public class RuntimeErrorExample {
   public static void main(String[] args) {
      String input = JOptionPane.showInputDialog("Enter any integer");
      int number = Integer.parseInt(input);
      
      JOptionPane.showMessageDialog(null, "You entered: " + number);
   }
}


