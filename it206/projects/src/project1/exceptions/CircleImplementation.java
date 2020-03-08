package project1.exceptions;

import javax.swing.JOptionPane;
public class CircleImplementation {
   public static void main(String[] args) {
      Circle aCircle = new Circle();
      System.out.println(aCircle.getRadius());
      while(JOptionPane.showConfirmDialog(null,
         "Do you want to enter a circle?", "Circle Question", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
         try {
            aCircle = getCircle();
            JOptionPane.showMessageDialog(null,
               "The area of the circle is " + String.format("%.2f", aCircle.getArea()));
         }
         catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Circle could not be created: " + e.getMessage());
         }
      }
   }
   
   private static Circle getCircle() {
      Circle aCircle = new Circle(JOptionPane.showInputDialog("Enter the name of the circle:"));

      boolean radiusSet = false;
      do {
         try {
            aCircle.setRadius(Double.parseDouble(JOptionPane.showInputDialog("Enter the radius for " + aCircle.getName() + ": ")));
            radiusSet = true;
         }
         catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You did not enter a number. Please try again");
         }
         catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
         }
      }
      while (!radiusSet);

      return aCircle;   
   }
}

