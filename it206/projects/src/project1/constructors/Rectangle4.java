package project1.constructors;

public class Rectangle4 {
   private double length;
   private double width;
   private String name;
   
   public Rectangle4(double length, double width) {
      this(length, width, null);
   }
     
   public Rectangle4(String name) {
      this(0.0, 0.0, name);
   }
   
   public Rectangle4(double length, double width, String name) {
      this.name = name;
      this.length = length;
      this.width = width;
   }
   
   public double getLength() { return this.length; }
   public double getWidth() { return this.width; }
   public String getName() { return this.name; }
}

