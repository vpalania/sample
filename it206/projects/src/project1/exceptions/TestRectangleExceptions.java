package project1.exceptions;

import javax.swing.JOptionPane;
public class TestRectangleExceptions {
   public static void main(String[] args) {
      // Create a Rectangle object with hardcoded values
      Rectangle r1 = new Rectangle(3.0, 4.0, "Hardcoded Rectangle From Java Code");
      
      do {
         // Try to create a Rectangle based on user input. If successful, print the details
         // of the hardcoded Rectangle and Rectangle from user-input
         try {
            Rectangle r2 = getRectangle();
            printRectangles(r1, r2);
         }
         // While creating the Rectangle object, it is possible an invalid value could
         // be entered for length or width (non-positive, numeric value) or name
         // (anything other than a String). Capture and handle these project1.exceptions
         catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Rectangle could not be created.\n"
               + "Only numeric values are permitted for length and width!");
         }
         catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Rectangles could not be printed.\n"
               + "Entry of the second rectangle contained a problem: " + e.getMessage());
         }
      }
      while(JOptionPane.showInputDialog("Enter YES to create another Rectangle").equalsIgnoreCase("yes"));
   }
   
   public static Rectangle getRectangle() {
      String name = JOptionPane.showInputDialog("Enter the rectangle's name");
      
      // If a NumberFormatException happens in the two lines below, control will immediately exit and return
      // to the calling method
      double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the rectangle's length: "));
      double width = Double.parseDouble(JOptionPane.showInputDialog("Enter the rectangle's width: "));
      
      // Create and return a new Rectangle based on user input
      return new Rectangle(length, width, name);
   }
   
   public static void printRectangles(Rectangle r1, Rectangle r2) {
      JOptionPane.showMessageDialog(null, 
         "*** My Rectangles ***\n"
         + r1.toString() + "\n\n"
         + r2.toString() + "\n\n"
      );
   }
}

