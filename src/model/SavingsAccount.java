package model;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int accountNumber, String ownerName,
                          double balance, double interestRate) {

        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {

        if(amount > 5000) {
            System.out.println("Cannot withdraw more than 5000");
        }
        else if(amount <= getBalance()) {

            setBalance(getBalance() - amount);

            System.out.println(amount + " withdrawn successfully");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    public void showInterestRate() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
