package accounts;

public abstract class Account {
     protected double balance;
     private double interestRate;

     public Account(double balance, double interestRate) {
          this.balance = balance;
          this.interestRate = interestRate;
     }

     public double getBalance() {
          return balance;
     }

     public double getInterestRate() {
          return interestRate;
     }

     public boolean withdraw(double amount) {
          if (amount > balance) {
               return false;
          }
          balance -= amount;
          return true;
     }

     public boolean deposit(double amount) {
          if (amount <= 0) {
               return false;
          }
          balance += amount;
          return true;
     }

     public void status() {
          System.out.printf("Balance: %.2f\n", balance);
     }
}
