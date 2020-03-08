package project2.variables;

public class BankAccount {
   private double balance;
   private int accountNumber;
   private static int lastAssignedNumber = 1000;
   
   public BankAccount() {
      // Set the account number for a specific account by 
      // incrementing lastAssignedNumber for the next
      // created account
      this.accountNumber = ++lastAssignedNumber;
   }
   
   public static int getLastAssignedNumber() { return lastAssignedNumber; }
   public int getAccountNumber() { return this.accountNumber; }
   
   // Rest of the class
}

