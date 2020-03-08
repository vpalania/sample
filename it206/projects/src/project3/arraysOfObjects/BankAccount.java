package project3.arraysOfObjects;

public class BankAccount {
   public static final double INTEREST_RATE = 0.02;

   private double balance;
   private int accountNumber;
   private static int lastAssignedNumber = 1000;
   
   public BankAccount() {
      lastAssignedNumber++;
      accountNumber = lastAssignedNumber;
   }
   
   public double getBalance() { return balance; }
   public int getAccountNumber() { return accountNumber; }
   public static int getLastAssignedNumber() { return lastAssignedNumber; }
   
   public void setBalance (double balance) {
      if (balance < 0.00) {
         throw new IllegalArgumentException("Bank account cannot have a negative balance!");      
      }
      this.balance = balance;
	}
}



