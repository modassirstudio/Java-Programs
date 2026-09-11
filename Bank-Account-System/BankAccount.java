package Practices;

import java.util.ArrayList;

public class BankAccount {
    
    private String accountHolder;
    private double balance;
    private ArrayList<String> history;
    
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.history = new ArrayList<>();
        history.add("Account opened with ₹" + initialBalance);
    }
    
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        history.add("Deposited ₹" + amount + " | Balance: ₹" + balance);
        System.out.println("₹" + amount + " deposited successfully.");
    }
    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance. Available: ₹" + balance);
            return;
        }
        balance -= amount;
        history.add("Withdrew ₹" + amount + " | Balance: ₹" + balance);
        System.out.println("₹" + amount + " withdrawn successfully.");
    }
    
    public void showBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
    
    public void showHistory() {
        System.out.println("\n--- Transaction History ---");
        for (String entry : history) {
            System.out.println(entry);
        }
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
}