import java.util.ArrayList;

public class Account {
    private String accountNumber;
    private double balance;
    private String accountType;
    private ArrayList<String> transactionHistory;

    public Account(String accountNumber, double initialBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountType = accountType;
        this.transactionHistory = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(ArrayList<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public void deposit(double amount) { //200
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid deposit amount.");
            }
            balance += amount; //1200
            recordTransaction("Deposit: +" + amount);
            System.out.println("Deposit successfull");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void withdraw(double amount) { //
        try {
            if (amount <= 0 || amount > balance) {
                throw new IllegalArgumentException("Invalid withdrawal amount or insufficient funds.");
            }
            balance -= amount;
            recordTransaction("Withdrawal: -" + amount);
            System.out.println("Withdrawal successful.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }



    public double getBalance() {
        return balance;
    }

    public void displayTransactionHistory() {
        System.out.println("Transaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    private void recordTransaction(String transaction) {
        transactionHistory.add(transaction);
    }
}