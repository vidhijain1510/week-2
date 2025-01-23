import java.util.ArrayList;
class Account {
    private String accountNumber;
    private double balance;

    //Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Method to get balance
    public double getBalance() {
        return balance;
    }

    //Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    //Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    //Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    //Method to add account to customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    //Method to view all account balances
    public void viewBalances() {
        System.out.println(name + " Accounts and Balances:");
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + " - Balance: INR" + account.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}
class Bank {
    private String name;
    private ArrayList<Customer> customers;

    //Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    //Method to open a new account for a customer
    public Account openAccount(Customer customer, String accountNumber, double initialDeposit) {
        Account newAccount = new Account(accountNumber, initialDeposit);
        customer.addAccount(newAccount);
        customers.add(customer);
        return newAccount;
    }

    //Method to get all customers of the bank
    public void listCustomers() {
        System.out.println("Customers of " + name + ":");
        for (Customer customer : customers) {
            System.out.println(customer.getName());
        }
    }
}

public class BankAccount{
    public static void main(String[] args) {
        //Creating a bank
        Bank bank = new Bank("National Bank");

        //Creating customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        //Opening accounts for customers
        Account aliceAccount1 = bank.openAccount(customer1, "AC01", 50.0);
        Account aliceAccount2 = bank.openAccount(customer1, "AC02", 100.0);
        Account bobAccount1 = bank.openAccount(customer2, "AC03", 150.0);

        //Making some deposits and withdrawals
        aliceAccount1.deposit(200.0);
        aliceAccount2.withdraw(150.0);
        bobAccount1.deposit(500.0);

        //Viewing account balances for customers
        customer1.viewBalances();
        customer2.viewBalances();
    }
}
