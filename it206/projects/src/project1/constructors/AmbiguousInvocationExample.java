package project1.constructors;

import javax.swing.JOptionPane;

public class AmbiguousInvocationExample {
   public static void main(String[] args) {
      JOptionPane.showMessageDialog(null, area(3, 4));
   }
   
   // Area of a rectangle
//   public static double area(double length, double width) {
//      return length * width;
//   }
   
   // Area of a triangle
   public static double area(double base, double height) {
      return 0.5 * base * height;
   }
}

