package project1;

public class Magazine {
	private String title;
	private double cost;
	private int numInStock;
	
	public Magazine(String title, double cost, int numInStock) {
		this.title = title;
		this.cost = cost;
		this.numInStock = numInStock;
	}
	
	public Magazine() {
      this(null, 3.50, 10);
	}

	public String getTitle() {return this.title;}
	public double getCost() {return this.cost;}
	public int getNumInStock() {return this.numInStock;}
	
	public boolean setTitle(String title) {
      if (!title.equals("")) {
   		this.title = title;
         return true;
      }
      else {
         return false;
      }
	}
   
	public boolean setCost(double cost) {
      if (cost > 0 && cost < 100) {
         this.cost = cost;
         return true;
      }
      else {
         return false;
      }
	}

	public boolean setNumInStock(int numInStock) {
      if (numInStock >= 0 && numInStock <= 1000) {
   		this.numInStock = numInStock;
   		return true;      
      }
      else {
			return false;
      }
	}
   
	public boolean sellOne() {
      if (this.getNumInStock() > 0) {
         return this.setNumInStock(this.getNumInStock() - 1);
      }
      else {
         return false;
      }
	}
	
	public double calculateTotalCost(double tax) {
		return (1+tax) * this.getCost();
	}
   
   public String toString() {
      return this.getTitle() + " has a cost of "
             + String.format("$%.2f", this.getCost())
             + " with " + this.getNumInStock() + " remaining in stock";
   }
}

