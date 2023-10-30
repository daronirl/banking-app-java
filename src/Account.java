import java.util.Scanner;

public class Account {
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    // Class Constructor
    Account (String cname, String cid) {
        customerName = cname;
        customerID = cid;
    }

    // Function for depositing money
    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    // Function for withdrawing money
    void withdraw (int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    // Function showing previous transaction
    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);

        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));

        } else {
            System.out.println("No transaction occurred");
        }
    }

    // Function calculating interest of current funds after a number of years
    void calculateInterests(int years) {
        double interestRate = .0185;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current interest rate is " + (100 * interestRate));
        System.out.println("After " + years + " years , you will be: " + newBalance);

    }

    // Functions to show menu
    void showMenu () {
        char option = '\0';

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + customerName + "!");
        System.out.println("Your ID is: " + customerID);

    }
}
