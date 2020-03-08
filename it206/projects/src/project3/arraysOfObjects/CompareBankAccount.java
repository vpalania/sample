package project3.arraysOfObjects;

import project3.arraysOfObjects.BankAccount;

import javax.swing.JOptionPane;

public class CompareBankAccount {
   public static void main(String[] args) {
      BankAccount checkingAccount = new BankAccount();
      checkingAccount.setBalance(1000.00);
      
      BankAccount savingsAccount = new BankAccount();
      savingsAccount.setBalance(200.00);
      
      BankAccount largerAccount = compareBalances(checkingAccount, savingsAccount);
      JOptionPane.showMessageDialog(null,
         "The larger account has " + String.format("$%.2f", largerAccount.getBalance()));
   }
   
   public static BankAccount compareBalances(BankAccount account1, BankAccount account2) {
      BankAccount largerAccount;
      
      if (account1.getBalance() > account2.getBalance()) {
         largerAccount = account1;
      }
      else if (account2.getBalance() > account1.getBalance()) {
         largerAccount = account2;
      }
      else largerAccount = account1;
      
      return largerAccount;
   }
}

