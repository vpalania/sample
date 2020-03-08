package project1.constructors;

public class Circle3 {
   private double radius;

   public Circle3() {
   
   }

   public double getRadius() { return this.radius; }
   
   public boolean setRadius(double radius) {
      if (radius > 0 && radius <= 100) {
         this.radius = radius;
         return true;
      }
      else {
         return false;
      }
   }

   public double circumfrence() {
      return Math.PI * this.radius * 2;
   }
   
   public double area() {
      return Math.PI * Math.pow(this.radius, 2);
   }
}






