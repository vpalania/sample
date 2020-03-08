package project3.arraysOfObjects;

public class Card {
   // Making these constants private as they will not be used in the implementation
   private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
   private static final int[] RANKS = {2, 3, 4, 5, 6, 7, 8, 9, 10};
   
   private String suit;
   private int rank;
   
   public Card() {
      // Using Math.random will generate a random suit and rank
      this.suit = SUITS[(int)(Math.random() * SUITS.length)];
      this.rank = RANKS[(int)(Math.random() * RANKS.length)];
   }
   
   public String getSuit() { return this.suit; }
   public int getRank() { return this.rank; }

   public String toString() {
      return this.getRank() + " of " + this.getSuit();
   }
}



