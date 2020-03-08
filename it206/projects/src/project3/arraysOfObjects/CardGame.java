package project3.arraysOfObjects;

import javax.swing.JOptionPane;
public class CardGame {
   public static void main(String[] args) {
      final int NUM_CARDS_IN_HAND = 3;
   
      Card[] playerHand = new Card[NUM_CARDS_IN_HAND];
      Card[] dealerHand = new Card[NUM_CARDS_IN_HAND];
      dealHand(playerHand);
      dealHand(dealerHand);
      
      printHand(playerHand, "Player Hand");
      printHand(dealerHand, "Dealer Hand");
      printWinner(playerHand, dealerHand);
   }

   public static void dealHand(Card[] gameHand) {
      for (int x = 0; x < gameHand.length; x++) {
         gameHand[x] = new Card();
      }
   }

   public static void printHand(Card[] gameHand, String handOwner) {
      String output = handOwner + "\n\n";
      int cardTotal = 0;
      for (Card aCard : gameHand) {
         output += aCard.toString() + "\n";
      }
      output += "----------\n";
      output += "Card Total: " + calculateHand(gameHand);
 
      JOptionPane.showMessageDialog(null, output);
   }   

   public static int calculateHand(Card[] gameHand) {
      int cardTotal = 0;

      for (Card aCard : gameHand) {
         cardTotal += aCard.getRank();
      }      
      
      return cardTotal;
   }      
   
   public static void printWinner(Card[] playerHand, Card[] dealerHand) {
      int compareResult = compareHands(playerHand, dealerHand);
      
      if (compareResult > 0) {
         JOptionPane.showMessageDialog(null, "Player Wins!");
      }
      else if (compareResult < 0) {
         JOptionPane.showMessageDialog(null, "Dealer Wins!");
      }
      else {
         JOptionPane.showMessageDialog(null, "Draw!");
      }
   }

   public static int compareHands(Card[] gameHand1, Card[] gameHand2) {
      if (calculateHand(gameHand1) > calculateHand(gameHand2)) {
         return 1;
      }
      else if (calculateHand(gameHand1) < calculateHand(gameHand2)) {
         return -1;
      }
      else return 0;
   }
}

