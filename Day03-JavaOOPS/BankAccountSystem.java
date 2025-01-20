/*
 * Bank Account System
Create a BankAccount class with the following features:
Static:
A static variable bankName shared across all accounts.
A static method getTotalAccounts() to display the total number of accounts.
This:
Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
Final:
Use a final variable accountNumber to ensure it cannot be changed once assigned.
Instanceof:
Check if an account object is an instance of the BankAccount class before displaying its details.
 */
class BankAccount {
    //Static variable shared across all accounts
    static String bankName = "Global Bank";
    static int totalAccounts = 0; //Keeps track of total accounts

    //Final variable to ensure account number cannot be changed
    final int accountNumber;
    String accountHolderName;

    //Constructor
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    //Method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) { //Checks if the object is an instance of BankAccount
            System.out.println("Bank Name: " + BankAccount.bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid account object!");
        }
    }
}


public class BankAccountSystem {
    public static void main(String[] args) {
        //Creating bank accounts
        BankAccount account1 = new BankAccount("Alice", 1001);
        BankAccount account2 = new BankAccount("Bob", 1002);

        //Displaying account details
        account1.displayAccountDetails();
        System.out.println();
        account2.displayAccountDetails();

        //Displaying total accounts
        System.out.println("\nTotal Accounts: " + BankAccount.totalAccounts);
    }
}
