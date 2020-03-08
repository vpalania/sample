package project3.arraysOfObjects;

public class Item {
   private String description;
   private double price;
   public static final double MIN_PRICE = 0.00;
   public static final double MAX_PRICE = 100.00;

   public Item(String description, double price) {
      if (description == null || description.equals("")) {
         throw new IllegalArgumentException("A description must be provided");
      }
      // Assume the initial price of the item must be between 0.00 and 100.00 inclusive
      if (price < MIN_PRICE || price > MAX_PRICE) {
         throw new IllegalArgumentException("Price must be between "
            + String.format("$%.2f", MIN_PRICE) + " and " + String.format("$%.2f", MAX_PRICE));
      }
   
      this.description = description;
      this.price = price;
   }

   public String getDescription() { return this.description; }
   public double getPrice() { return this.price; }

	public void setDescription(String description) {
      if (description == null || description.equals("")) {
         throw new IllegalArgumentException("The description cannot be changed to not have a value.");
      }   
		this.description = description;
	}   

   // Assume the item price can change to any value at or above the minimum
	public void setPrice (double price) {
      if (price < MIN_PRICE) {
         throw new IllegalArgumentException("Price can only be set to values at or above "
            + String.format("$%.2f", MIN_PRICE));
      }
      this.price = price;
	}
}

