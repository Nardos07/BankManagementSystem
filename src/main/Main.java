package main;

import model.Account;
import model.SavingsAccount;
import model.CurrentAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Account> accounts = new ArrayList<>();

        SavingsAccount saving1 =
                new SavingsAccount(101, "Nardos", 10000, 5);

        CurrentAccount current1 =
                new CurrentAccount(202, "Abel", 5000, 2000);

        accounts.add(saving1);
        accounts.add(current1);

        try {

            System.out.println("Welcome to Bank System");

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");

            System.out.print("Enter choice: ");
            int choice = input.nextInt();

            if(choice == 1) {

                saving1.deposit(1000);

            }
            else if(choice == 2) {

                saving1.withdraw(3000);

            }
            else {
                System.out.println("Invalid choice");
            }

        }
        catch(Exception e) {

            System.out.println("Invalid input");
        }

        System.out.println();

        for(Account acc : accounts) {

            acc.displayInfo();
            System.out.println();
        }

        input.close();
    }
}