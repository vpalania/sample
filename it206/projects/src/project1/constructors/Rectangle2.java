package project1.constructors;

public class Rectangle2 {
   private double length;
   private double width;
   private String name;
   
   public Rectangle2() {
      this.width = 1.0;
      this.length = 1.0;
   }
   
   public Rectangle2(double length, double width) {
      this.length = length;
      this.width = width;
   }
   
   public Rectangle2(String name) {
      this.name = name;
   }
   
   public Rectangle2(double length, double width, String name) {
      this.length = length;
      this.width = width;
      this.name = name;
   }
   
   public double getLength() { return this.length; }
   public double getWidth() { return this.width; }
   public String getName() { return this.name; }
}

