public class Main {

    public static void main(String[] args) {

        SavingsAccount saving1 =
                new SavingsAccount(101, "Nardos", 10000, 5);

        CurrentAccount current1 =
                new CurrentAccount(202, "Abel", 5000, 2000);

        saving1.displayInfo();
        System.out.println();

        current1.displayInfo();
        System.out.println();

        saving1.deposit(1000);

        saving1.withdraw(3000);

        current1.withdraw(6000);

        System.out.println();

        Account acc;

        acc = saving1;
        acc.withdraw(7000);

        acc = current1;
        acc.withdraw(6500);
    }
}