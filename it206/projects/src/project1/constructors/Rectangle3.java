package project1.constructors;

public class Rectangle3 {
   private double length;
   private double width;
   private String name;
   
   public Rectangle3() {
      this.width = 1.0;
      this.length = 1.0;
   }
     
   public Rectangle3(String name) {
      this.name = name;
   }
   
   public Rectangle3(double length, double width, String name) {
      this(name);
      this.length = length;
      this.width = width;
   }
   
   public double getLength() { return this.length; }
   public double getWidth() { return this.width; }
   public String getName() { return this.name; }
}

