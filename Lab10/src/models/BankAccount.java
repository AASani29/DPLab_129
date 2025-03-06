package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactionHistory;

    public BankAccount(String accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        this.transactionHistory = new ArrayList<>();
        logTransaction("Deposit", initialDeposit);
    }

    public void deposit(double amount) {
        balance += amount;
        logTransaction("Deposit", amount);
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            logTransaction("Failed Withdrawal", amount);
            return false;
        }
        balance -= amount;
        logTransaction("Withdraw", amount);
        return true;
    }

    private void logTransaction(String type, double amount) {
        Transaction transaction = new Transaction(UUID.randomUUID().toString(), accountNumber, type, amount);
        transactionHistory.add(transaction);
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
