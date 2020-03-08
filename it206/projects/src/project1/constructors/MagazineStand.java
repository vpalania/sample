package project1.constructors;

import javax.swing.JOptionPane;
public class MagazineStand {
	public static void main(String [] args) {
      final double TAX = 0.05;
		Magazine magazine1 = new Magazine("Sports Illustrated", 5.25, 100);
		Magazine magazine2 = getFeaturedMagazine();
		sellMagazine(magazine1, magazine2, TAX);
	}

	public static Magazine getFeaturedMagazine() {
		Magazine aMagazine = new Magazine();
      
      boolean magazineTitleSet;
		do {
         magazineTitleSet = aMagazine.setTitle(JOptionPane.showInputDialog("Enter the title of today's featured magazine"));
         if (!magazineTitleSet) {
            JOptionPane.showMessageDialog(null, "You must enter a magazine title.");
         }
		} while (!magazineTitleSet);

      boolean magazineCostSet;
		do {
         try {
   			magazineCostSet = aMagazine.setCost(Double.parseDouble(JOptionPane.showInputDialog(
               "Enter the cost of " + aMagazine.getTitle())));
         }
         catch (NumberFormatException e) {
            magazineCostSet = false;
         }
         if (!magazineCostSet) {
            JOptionPane.showMessageDialog(null, "Invalid cost. Try again.");
         }
		} while (!magazineCostSet);

      boolean magazineNumInStockSet;
		do {
         try {
   			magazineNumInStockSet = aMagazine.setNumInStock(Integer.parseInt(JOptionPane.showInputDialog(
               "Enter the number of " + aMagazine.getTitle() + " in stock")));
         }
         catch (NumberFormatException e) {
            magazineNumInStockSet = false;
         }
         if (!magazineNumInStockSet) {
            JOptionPane.showMessageDialog(null, "Invalid number in stock. Try again.");
         }
		} while (!magazineNumInStockSet);

		return aMagazine;
	}

	public static void sellMagazine(Magazine magazine1, Magazine magazine2, double salesTax) {
		int choice;
      do {
         try {
      		choice = Integer.parseInt(JOptionPane.showInputDialog(
                 "Choose one from our magazine selection:\n"
               + "1. " + magazine1.toString() + "\n"
               + "2. " + magazine2.toString() + "\n"
               + "\nSelect 1 or 2: "));
         }
         catch(NumberFormatException e) {
            choice = 0;
         }
         
   		switch (choice) {
   			case 1:
               checkout(magazine1, salesTax);
               break;
   			case 2:
               checkout(magazine2, salesTax);
   		      break;
   			default:
               JOptionPane.showMessageDialog (null, "I'm sorry, that is an invalid choice.");
               break;
   		}
      } while (choice != 1 && choice != 2);
	}

	public static void checkout(Magazine aMagazine, double salesTax) {
      if (aMagazine.sellOne()) {
         JOptionPane.showMessageDialog(null, "Thank you. The total cost for "
         + aMagazine.getTitle() + " is " + String.format("$%.2f", aMagazine.calculateTotalCost(salesTax)));
      }
      else {
         JOptionPane.showMessageDialog(null, "I'm sorry, but that magazine has sold out.");
      }
	}
}



