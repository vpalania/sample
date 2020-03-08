package project3.arraysOfObjects;

import javax.swing.JOptionPane;

public class DVDCollection {
   public static void main(String[] args) {
      //final int MAX_NUM_DVDS = 100;
      final int MAX_NUM_DVDS = 2;
      DVD[] collection = new DVD[MAX_NUM_DVDS];
      
      int menuChoice = getMenuOption();
      while (menuChoice != 4) {
         switch(menuChoice) {
            case 1:
               addDVD(collection);
               break;
               
            case 2:
               printNumDVDs();
               break;
               
            case 3:
               printDVDCollection(collection);
               break;
               
            default:
               // Program should never reach this condition if logic is correct
               throw new RuntimeException("Unknown error in menu choice");
         }
         menuChoice = getMenuOption();
      }
   }
   
   public static void addDVD(DVD[] collection) {
      int position = DVD.getNumDVDs();
      
      if (position < collection.length) {
         try {
            DVD oneDvd = new DVD(
               JOptionPane.showInputDialog("Enter the title of the DVD"),
               JOptionPane.showInputDialog("Enter the genre of the DVD. Options are: " + DVD.getGenres())
            );
            collection[position] = oneDvd;
         }
         catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "DVD could not be added to the collection. " + e.getMessage());
         }
      }
      else {
         JOptionPane.showMessageDialog(null, "The collection is full. No more DVDs can be added.");
      }
   }
   
   public static void printNumDVDs() {
      JOptionPane.showMessageDialog(null, "Number of DVDs in Collection: " + DVD.getNumDVDs());
   }
   
   public static void printDVDCollection(DVD[] collection) {
      String output = "";
      
      for (int x = 0; x < DVD.getNumDVDs(); x++) {
         output += collection[x].toString() + "\n";
      }
      
      JOptionPane.showMessageDialog(null, output);
   }
   
   public static int getMenuOption() {
      int menuChoice;
      
      do {
         try {
            menuChoice = Integer.parseInt(JOptionPane.showInputDialog(
               "Enter your selection:"
               + "\n(1) Add DVD"
               + "\n(2) Print Number of DVDs in Collection"
               + "\n(3) Print DVD Collection"
               + "\n(4) Exit Program"
            ));
         }
         catch (NumberFormatException e) {
            menuChoice = 0;
         }
         if (menuChoice < 1 || menuChoice > 4) {
            JOptionPane.showMessageDialog(null, "Invalid choice. Please enter a valid menu option.");
         }
      } while (menuChoice < 1 || menuChoice > 4);
      
      return menuChoice;
   }
}


