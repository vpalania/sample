package project1.constructors;

import javax.swing.JOptionPane;

public class MethodOverloadingExample {
   public static void main(String[] args) {
      print("A string");
      print(5);
      
      int[] numArray = {1, 2, 3};
      print(numArray);  
   }
   
   public static void print(String s) {
      JOptionPane.showMessageDialog(null, "The string you entered was: " + s);
   }
   
   public static void print(int i) {
      JOptionPane.showMessageDialog(null, "The number you entered was: " + i);
   }
   
   public static void print(int[] i) {
      String output = "";
      for (int number : i) {
         output += number + " ";
      }      
      JOptionPane.showMessageDialog(null, "The numbers in the array are: " + output);
   }
}

