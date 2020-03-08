package project1.constructors;

import javax.swing.JOptionPane;
public class TestBankAccount {
   public static void main(String[] args) {
      BankAccount savingsAccount = new BankAccount(); 
      JOptionPane.showMessageDialog(null, savingsAccount.getAccountNumberLength());
   }
}

