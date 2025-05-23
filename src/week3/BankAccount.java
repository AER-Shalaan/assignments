package week3;

public class BankAccount {

    private String accountID;
    private double balance;

    public BankAccount() {
        this.accountID = "";
        this.balance = 0.0;
    }

    public BankAccount(String accountID, double initialBalance) {
        this.accountID = accountID;
        this.balance = initialBalance;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Withdrawal failed.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Deposit failed.");
        }
    }
}
