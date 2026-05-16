package model;

public abstract class Account {

    private int accountNumber;
    private String ownerName;
    private double balance;

    public Account(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method Overloading
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited successfully");
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited successfully");
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance);
    }

    // Abstract Method
    public abstract void withdraw(double amount);
}