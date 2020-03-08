package project2.variables;

import javax.swing.JOptionPane;
public class Bank {
   public static void main(String[] args) {
      BankAccount collegeFund = new BankAccount();
      BankAccount momsSavings = new BankAccount();
      BankAccount harrysChecking = new BankAccount();
      
      JOptionPane.showMessageDialog(null, 
         "***project2.variables.Bank Accounts***"
         + "\nCollege Fund has account number " + collegeFund.getAccountNumber()
         + "\nMom's Savings has account number " + momsSavings.getAccountNumber()
         + "\nHarry's Checking has account number " + harrysChecking.getAccountNumber()
         + "\n\nThe last assigned number was " + BankAccount.getLastAssignedNumber()
      );
   }
}

