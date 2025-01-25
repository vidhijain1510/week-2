class BankAccount {
        private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    // Method 
    public void displayAccountType() {
        System.out.println("This is a generic bank account.");
    }
}
// Subclass SavingsAccount created
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Calls the constructor of BankAccount
        this.interestRate = interestRate;
    }

    // Getter method 
    public double getInterestRate() {
        return interestRate;
    }
    // Overriding displayAccountType method
    @Override
    public void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }
}
// Subclass CheckingAccount created
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Calls the constructor of BankAccount
        this.withdrawalLimit = withdrawalLimit;
    }
    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }
    @Override
    public void displayAccountType() {
        System.out.println("This is a Checking Account.");
    }
}
// Subclass FixedDepositAccount created
class FixedDepositAccount extends BankAccount {
    private int depositTerm; // Term in months
    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance); // Calls the constructor of BankAccount
        this.depositTerm = depositTerm;
    }
    public int getDepositTerm() {
        return depositTerm;
    }
    @Override
    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }
}
public class BankAccountSystem {
    public static void main(String[] args) {
        // Creating objects of different account types
        BankAccount savings = new SavingsAccount("S12345", 5000.0, 4.5);
        BankAccount checking = new CheckingAccount("C67890", 3000.0, 1500.0);
        BankAccount fixedDeposit = new FixedDepositAccount("F11223", 10000.0, 12);

        savings.displayAccountType();
        System.out.println("Account Number: " + savings.getAccountNumber());
        System.out.println("Balance: INR" + savings.getBalance());
        System.out.println("Interest Rate: " + ((SavingsAccount) savings).getInterestRate() + "%\n");

        checking.displayAccountType();
        System.out.println("Account Number: " + checking.getAccountNumber());
        System.out.println("Balance: INR" + checking.getBalance());
        System.out.println("Withdrawal Limit: $" + ((CheckingAccount) checking).getWithdrawalLimit() + "\n");

        fixedDeposit.displayAccountType();
        System.out.println("Account Number: " + fixedDeposit.getAccountNumber());
        System.out.println("Balance: INR" + fixedDeposit.getBalance());
        System.out.println("Deposit Term: " + ((FixedDepositAccount) fixedDeposit).getDepositTerm() + " months\n");
    }
}
