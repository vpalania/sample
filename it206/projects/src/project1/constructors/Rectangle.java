package project1.constructors;

public class Rectangle {
   private double length;
   private double width;
   private String name;
   
   public Rectangle() {
      this.width = 1.0;
      this.length = 1.0;
   }
   
   public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
   }
   
   public Rectangle(String name) {
      this.name = name;
   }
   
   public double getLength() { return this.length; }
   public double getWidth() { return this.width; }
   public String getName() { return this.name; }
}

