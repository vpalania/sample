package project1.constructors;

public class Rectangle5 {
   private double length;
   private double width;
   private String name;
   
   public Rectangle5(double length, double width) {
      this(length, width, null);
   }
     
   public Rectangle5(String name) {
      this(0.0, 0.0, name);
   }
   
   public Rectangle5(double length, double width, String name) {
      this.name = name;
      this.length = length;
      this.width = width;
   }
   
   public double getLength() { return this.length; }
   public double getWidth() { return this.width; }
   public String getName() { return this.name; }
   
   public String toString() {
      return "Rectangle Details:"
         + "\nLength: " + this.getLength()
         + "\nWidth: " + this.getWidth()
         + "\nName: " + this.getName();
   }
}

