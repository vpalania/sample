package project1;

public class Person {
   private String name;
   private double currentWeight;
   private double idealWeight;

   
   public Person(String name) {
      if (name == null || name.equals("")) {
         throw new IllegalArgumentException("Name cannot be blank");
      }  
      this.name = name;    
   }
   
   public Person(double idealWeight) {
      if (idealWeight > 200.0 || idealWeight < 120.0) {  
         throw new IllegalArgumentException("Ideal weight must be between 120 and 200");
      }
      else {
         this.idealWeight = idealWeight;
      }  
   }
   
   public Person() {

   }
   
   public String getName() { 
    return this.name; 
   }
   
   public double getIdealWeight() { 
      return this.idealWeight; 
   }
   
   public double getCurrentWeight() { 
      return this.currentWeight; 
   }

   public void setName(String name) {
      this.name = name;
   }
   
   public void setCurrentWeight(double currentWeight) {
      if (currentWeight > 0.0) {
         this.currentWeight = currentWeight;
      }
      else {
         throw new IllegalArgumentException("Current weight must be positive");
      }
   }
   
   public void setIdealWeight(double idealWeight) {
      if (idealWeight > 200.0 || idealWeight < 120.0) {  
         throw new IllegalArgumentException("Ideal weight must be between 120 and 200");
      }
      else {
         this.idealWeight = idealWeight;
      }
   }
   
   public boolean isInShape() {
      if (currentWeight < idealWeight || currentWeight == idealWeight)
         return true;
      else 
         return false;
   }
   
   public String toString() {
      return "My name is " + this.getName()
         + " with current weight of: " + this.getCurrentWeight() + " my ideal weight is: "
         + this.getIdealWeight();
   }
}


