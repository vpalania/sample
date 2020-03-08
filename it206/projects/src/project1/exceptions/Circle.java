package project1.exceptions;

public class Circle {
   private String name;
   private double radius;
   
   public Circle(String name) {
      if (name == null || name.equals("")) {
         throw new IllegalArgumentException("Name cannot be blank");
      }  
      this.name = name;    
   }
   
   public Circle() {
     radius = 1.0;   
   }
   
   public String getName() { return this.name; }
   public double getRadius() { return this.radius; }

   public void setName(String name) {
      if (name != null && !name.equals("")) {
         this.name = name;
      }
      else {
         throw new IllegalArgumentException("Name cannot be blank");
      }
   }
   
   public void setRadius(double radius) {
      if (radius > 0.0) {
         this.radius = radius;
      }
      else {
         throw new IllegalArgumentException("Radius must be positive");
      }
   }
   
   public double getArea() {
      return Math.pow(this.getRadius(), 2) * Math.PI;
   }
   
   public String toString() {
      return "The area of the circle named " + this.getName()
         + " with radius " + this.getRadius() + " is "
         + String.format("%.1f", this.getArea());
   }
}


