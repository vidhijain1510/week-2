
class BankAccount {
    // Instance variables
    public String accountNumber;      
    protected String accountHolder; 
    private double balance;           

    //Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    //Getter method for balance
    public double getBalance() {
        return balance;
    }

    //Setter method for balance
    public void setBalance(double balance) {
        if (balance >= 0) {  // Prevent setting a negative balance
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    //Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    //Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Withdrawal amount must be positive!");
        }
    }

    //Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + "\nAccount Holder: " + accountHolder + "\nBalance:" + balance);
    }
}

//SavingsAccount class - subclass of BankAccount
class SavingsAccount extends BankAccount {

    //Constructor for SavingsAccount that calls the constructor of the BankAccount class
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);  //Calling the parent class constructor
    }

    //Method to display details of the SavingsAccount
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);   // Accessing public accountNumber
        System.out.println("Account Holder: " + accountHolder);   // Accessing protected accountHolder
        System.out.println("Balance: " + getBalance());          // Accessing private balance via getter
    }
}
public class BankAccountSystem {
    public static void main(String[] args) {
        //Creating a BankAccount object
        BankAccount account1 = new BankAccount("123456789", "Alice", 5000.00);
        account1.displayAccountDetails();  //Displaying details of the bank account

        //Deposit and withdraw money from the account
        account1.deposit(1000);
        account1.withdraw(2000);

        //Creating a SavingsAccount object
        SavingsAccount savingsAccount1 = new SavingsAccount("987654321", "Bob", 3000.00);
        savingsAccount1.displaySavingsAccountDetails();  //Displaying details of the savings account

        //Modify the balance using setter method in BankAccount
        account1.setBalance(7000);
        System.out.println("Updated Account 1 Balance: " + account1.getBalance());
    }
}

