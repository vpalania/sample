package project2.variables;

import javax.swing.JOptionPane;
public class House {
   public static void main(String[] args) {
      do {
         Room aRoom = addRoom();
         aRoom.calculateArea();
      } while (JOptionPane.showInputDialog(
         "Enter YES to enter another room or any other value to quit").equalsIgnoreCase("yes"));
      
      printHouseReport(Room.getNumberOfRooms(), Room.getTotalArea());
   }
   
   public static Room addRoom() {
      Room aRoom = new Room();

      boolean lengthSet = false;
      do {
         try {
            aRoom.setLength(Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the room: ")));
            lengthSet = true;
         }
         catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You did not enter a number. Please try again");
         }
         catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
         }
      }
      while (!lengthSet);

      boolean widthSet = false;
      do {
         try {
            aRoom.setWidth(Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the room: ")));
            widthSet = true;
         }
         catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You did not enter a number. Please try again");
         }
         catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
         }
      }
      while (!widthSet);
      
      return aRoom;
   }
     
   public static void printHouseReport(int numberOfRooms, double totalArea) {
      JOptionPane.showMessageDialog(null, "project2.variables.House Report\n\n"
         + "Total number of rooms: "
         + numberOfRooms + "\nTotal square footage: " + totalArea         
      );   
   }
}




