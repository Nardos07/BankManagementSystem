public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String ownerName,
                          double balance, double overdraftLimit) {

        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {

        if(amount <= getBalance() + overdraftLimit) {

            setBalance(getBalance() - amount);

            System.out.println(amount + " withdrawn from current account");

        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }

    public void showOverdraftLimit() {
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}