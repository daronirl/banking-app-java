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

    void withdraw (int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }
}
