package project1.exceptions;

public class Rectangle {
   private double length;
   private double width;
   private String name;
   
   public Rectangle(double length, double width, String name) {
      if (name == null || name.equals("")) {
         throw new IllegalArgumentException("Name cannot be blank");
      }
      if (length <= 0.0) {
         throw new IllegalArgumentException("Length must be a positive value");
      }
      if (width <= 0.0) {
         throw new IllegalArgumentException("Width must be a positive value");
      }      
      this.name = name;
      this.length = length;
      this.width = width;
   }
   
   public double getLength() { return this.length; }
   public double getWidth() { return this.width; }
   public String getName() { return this.name; }
   
   public void setLength(double length) {
      if (length > 0.0) {
         this.length = length;
      }
      else {
         throw new IllegalArgumentException("Length must be greater than 0.0");
      }
   }

   public void setWidth(double width) {
      if (width > 0.0) {
         this.width = width;
      }
      else {
         throw new IllegalArgumentException("Width must be greater than 0.0");
      }
   }
   
   public void setName(String name) {
      if (name != null && !name.equals("")) {
         this.name = name;
      }
      else {
         throw new IllegalArgumentException("Name cannot be blank");
      }
   }
   
   public String toString() {
      return "Rectangle Details:"
         + "\nLength: " + this.getLength()
         + "\nWidth: " + this.getWidth()
         + "\nName: " + this.getName();
   }
}

