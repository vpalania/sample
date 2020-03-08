package project3.arraysOfObjects;

import javax.swing.JOptionPane;

public class HouseWithLoop {
   public static void main(String[] args) {
      Rectangle[] rooms = new Rectangle[5];
      
      for (int x = 0; x < rooms.length; x++) {
         rooms[x] = new Rectangle();
         rooms[x].setName(JOptionPane.showInputDialog("Enter the name of room " + (x+1)));
      }
   }
}