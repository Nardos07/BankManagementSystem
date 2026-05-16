# Bank Management System

## Project Description
This is a simple Java Bank Management System created using Object-Oriented Programming concepts.

The system allows:
- Depositing money
- Withdrawing money
- Displaying account information

The project demonstrates:
- Classes and Objects
- Encapsulation
- Inheritance
- Polymorphism

---

## Classes Used

### Account.java
Base class that stores:
- account number
- owner name
- balance

### SavingsAccount.java
Child class of Account.
Demonstrates inheritance and method overriding.

### CurrentAccount.java
Child class of Account.
Demonstrates inheritance and polymorphism.

### Main.java
Contains the main method and tests the program.

---

## OOP Concepts Demonstrated

### 1. Classes and Objects
Objects are created in Main.java

Example:
```java
SavingsAccount saving1 = new SavingsAccount(...);
```

### 2. Encapsulation
Private variables are used in Account.java

Example:
```java
private double balance;
```

Getters and setters are also implemented.

### 3. Inheritance
SavingsAccount and CurrentAccount inherit from Account.

Example:
```java
public class SavingsAccount extends Account
```

### 4. Polymorphism

#### Method Overriding
withdraw() method is overridden in child classes.

#### Method Overloading
deposit() method is overloaded in Account.java

Example:
```java
deposit(double amount)
deposit(int amount)
```

---

## How to Run the Project

1. Open project in IntelliJ IDEA
2. Open Main.java
3. Click the Run button

---

## Author
Nardos