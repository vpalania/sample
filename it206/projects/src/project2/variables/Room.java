package project2.variables;

public class Room {
   private double length;
   private double width;
   private static double totalArea;
   private static int numberOfRooms;
   public static final double MIN_ROOM_DIMENSION = 0.0;
   public static final double MAX_ROOM_DIMENSION = 1000.0;
   
   public Room() {
      ++numberOfRooms;
   }

   public Room(double length, double width) {
      this();
      if (length <= MIN_ROOM_DIMENSION) {
         throw new IllegalArgumentException("Length must be a positive value");
      }
      if (width <= MIN_ROOM_DIMENSION) {
         throw new IllegalArgumentException("Width must be a positive value");
      }  
   }
   
   public double getLength() { return this.length; }
   public double getWidth() { return this.width; }
   public static int getNumberOfRooms() { return numberOfRooms; }
   public static double getTotalArea() { return totalArea; }
   
   public void setLength(double length) {
      if (validateDimension(length)) {
         this.length = length;
      }
      else {
         throw new IllegalArgumentException(
            "Length must be between " + MIN_ROOM_DIMENSION + " and " + MAX_ROOM_DIMENSION
         );
      }
	}

   public void setWidth(double width) {
      if (validateDimension(width)) {
         this.width = width;
      }
      else {
         throw new IllegalArgumentException(
            "Width must be between " + MIN_ROOM_DIMENSION + " and " + MAX_ROOM_DIMENSION
         );
      }
	}
   
   private boolean validateDimension(double dimension) {
      return (dimension > MIN_ROOM_DIMENSION && dimension <= MAX_ROOM_DIMENSION);
   }
   
   public void calculateArea() {
      totalArea += this.getLength() * this.getWidth();
   }
   
   public String toString() {
      return "This room has room dimensions of " + this.getLength() + " by " + this.getWidth() + " feet";
   }
}


