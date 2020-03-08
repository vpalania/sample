package project1.exceptions;

import javax.swing.JOptionPane;
import java.io.IOException;
public class ThrowsExample {
   public static void main(String[] args) {
      try {
         sampleMethod(JOptionPane.showInputDialog("Type YES to force an error"));
      }
      catch(IOException e) {
         JOptionPane.showMessageDialog(null, "This method must catch or declare. It is catching");
      }
   }
   
   public static void sampleMethod(String forceError) throws IOException {
      // For demonstration purposes, may force an IOException to happen
      if (forceError.equalsIgnoreCase("YES")) {
         throw new IOException("Forcing an IOException");
      }
      else {
         JOptionPane.showMessageDialog(null, "No error!");
      }
   }
}


