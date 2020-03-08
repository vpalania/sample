package project1;

import javax.swing.JOptionPane;
public class LemonPrice {
   public static void main(String[] args) {

      try {
         double lemonPrice = getLemonPrice();
         double lemonWeight = getLemonWeight();
         printReasonablePrice(lemonPrice, lemonWeight);
      }
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Please enter a valid double value");
      }
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e.getMessage());
      }
      finally {
         JOptionPane.showMessageDialog(null, "Thank you for using this program.");
      }
   }
   
   public static double getLemonPrice() {
      double price = Double.parseDouble(JOptionPane.showInputDialog("What is the price of the lemon?"));
      if(price <= 0)
         throw new IllegalArgumentException("Price of lemon has to be greater than 0");
      return price;
   }
   
   public static double getLemonWeight() {
      double weight = Double.parseDouble(JOptionPane.showInputDialog("What is the weight of the lemon in ounces?"));
      if(weight <= 0)
         throw new IllegalArgumentException("Weight of lemon has to be greater than 0");

      return weight;
   }
   
      
   public static void printReasonablePrice(double lemonPrice, double lemonWeight) {
      if (lemonWeight < 0) {
         throw new IllegalArgumentException("You cannot divide by zero!");
      }
      if (lemonPrice == 0) {
         throw new IllegalArgumentException("Go grab as many lemons as you can since you will never get it cheaper than 0!");
      }
      JOptionPane.showMessageDialog(null, "Decide for yourself if the lemon price is reasonable: "
         + String.format("$%.2f", lemonPrice / lemonWeight));
   } 

}


