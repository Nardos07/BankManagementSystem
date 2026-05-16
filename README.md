# Bank Management System

## Project Description
This is a simple Java Bank Management System developed using Object-Oriented Programming (OOP) concepts.

The system allows users to:
- Deposit money
- Withdraw money
- Display account information

This project was developed as a Minimum Viable Product (MVP) to demonstrate the core OOP concepts learned in Java.

---

# OOP Concepts Implemented

## 1. Classes and Objects
The project uses classes and objects to represent real-world bank accounts.

Example:
```java
SavingsAccount saving1 =
        new SavingsAccount(101, "Nardos", 10000, 5);
```

---

## 2. Encapsulation
Private variables are used to protect account data.

Example:
```java
private double balance;
```

Getters and setters are used to access and modify the data safely.

Example:
```java
public double getBalance()
public void setBalance(double balance)
```

---

## 3. Constructors
Constructors are used to initialize objects when they are created.

Example:
```java
public SavingsAccount(int accountNumber, String ownerName,
                      double balance, double interestRate)
```

---

## 4. Inheritance
Inheritance is implemented using the extends keyword.

Example:
```java
public class SavingsAccount extends Account
```

Both SavingsAccount and CurrentAccount inherit from the Account class.

---

## 5. Method Overriding
The withdraw() method is overridden in child classes.

Example:
```java
@Override
public void withdraw(double amount)
```

Different account types use different withdrawal rules.

---

## 6. Polymorphism
Polymorphism is demonstrated using parent class references.

Example:
```java
ArrayList<Account> accounts = new ArrayList<>();
```

The program stores different account objects using the Account reference type.

---

## 7. Abstraction
Abstraction is implemented using an abstract class.

Example:
```java
public abstract class Account
```

The abstract withdraw() method forces child classes to provide their own implementation.

---

## 8. Packages
The project uses packages to organize classes.

Packages used:
- model
- main

---

## 9. Access Modifiers
Different access modifiers are used:
- private
- public

Example:
```java
private double balance;
public void deposit(double amount)
```

---

## 10. ArrayList
ArrayList is used to store multiple account objects dynamically.

Example:
```java
ArrayList<Account> accounts = new ArrayList<>();
```

---

## 11. Scanner
Scanner is used to accept user input from the keyboard.

Example:
```java
Scanner input = new Scanner(System.in);
```

---

## 12. Exception Handling
try-catch is used to handle invalid user input.

Example:
```java
try {
    int choice = input.nextInt();
}
catch(Exception e) {
    System.out.println("Invalid input");
}
```

---

# Classes Used

## Account.java
Abstract parent class that stores:
- account number
- owner name
- balance

Contains:
- deposit()
- displayInfo()
- abstract withdraw()

---

## SavingsAccount.java
Child class of Account.

Features:
- withdrawal limit
- method overriding

---

## CurrentAccount.java
Child class of Account.

Features:
- overdraft limit
- method overriding

---

## Main.java
Contains:
- main method
- Scanner input
- ArrayList
- try-catch
- object creation

---

# How to Run the Project

1. Open the project in IntelliJ IDEA
2. Open Main.java
3. Click the Run button
4. Enter menu choices in the console

---

# Technologies Used
- Java
- IntelliJ IDEA
- Git
- GitHub

---

# Author
Nardos