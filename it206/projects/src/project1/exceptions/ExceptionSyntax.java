package project1.exceptions; /**
 * This program determines how to divide lottery winnings among a group of friends
 * Program is meant to demonstrate how project1.exceptions work. It could potentially be enhanced
 * with some looping constructs, depending on business requirements.
 */
import javax.swing.JOptionPane;
public class ExceptionSyntax {
   public static void main(String[] args) {
      final double LOTTERY_WINNINGS = 10000.00;
      try {
         int numPeople = getNumPeople();
         printSharingPlan(numPeople, LOTTERY_WINNINGS);
      }
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Could not determine number of people to share with");
      }
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e.getMessage());
      }
      finally {
         JOptionPane.showMessageDialog(null, "Thank you for using this program.");
      }
   }
   
   public static int getNumPeople() {
      // Warning! Could throw a NumberFormatException.
      int numPeople = Integer.parseInt(JOptionPane.showInputDialog("How many people will you share with?"));
      return numPeople;
   }
   
   public static void printSharingPlan(int numPeople, double winnings) {
      // Information passed into the method is validated before being used.
      // Because the method is only a print method, it does not know how to handle
      // project1.exceptions that may arise, so control must be propagated back to the calling method
      if (numPeople < 0) {
         throw new IllegalArgumentException("You can't share with imaginary friends!");
      }
      if (numPeople == 0) {
         throw new IllegalArgumentException("You can't share with yourself!");
      }
      JOptionPane.showMessageDialog(null, "Each person gets "
         + String.format("$%.2f", winnings / (numPeople + 1)));
   } 
}


