/* Banking System
Description: Create a banking system with different account types:
Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
Add methods like deposit(double amount) and withdraw(double amount) (concrete) and
calculateInterest() (abstract).
Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
Use encapsulation to secure account details and restrict unauthorized access.
Demonstrate polymorphism by processing different account types and calculating interest dynamically.
*/

//Abstract class BankAccount with fields like accountNumber, holderName, and balance
abstract class BankAccount{
    private String accountNumber;
    private String holderName;
    private double balance;

    //Constructor
    BankAccount(String accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    //Getters
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }

    //Methods like deposit(double amount) and withdraw(double amount) (concrete)
    public void deposit(double amount){
        if(amount>0) {
            balance+=amount;
            System.out.println("Deposited: INR " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: INR " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    //calculateInterest() (abstract)
    public abstract double calculateInterest();

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: INR" + balance);
        System.out.println("Interest over balance: INR" + calculateInterest());
    }
}

//interface Loanable with methods applyForLoan() and calculateLoanEligibility().
interface Loanable{
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

//Implement subclasses SavingsAccount with unique interest calculations.
class SavingsAccount extends BankAccount implements Loanable {
    private double annualIncome;
    //Constructor
    SavingsAccount(String accountNumber, String holderName, double balance, double annualIncome){
        super(accountNumber, holderName, balance);
        this.annualIncome = annualIncome;
    }

    //Getter
    public double getAnnualIncome() {
        return annualIncome;
    }

    @Override
    public double calculateInterest(){
        return getBalance()*0.25; //Interest is 25%
    }

    @Override
    public boolean calculateLoanEligibility() {
        //Loan eligibility based on income (simple logic)
        return annualIncome > 500000;  // Eligibility criteria: income must be more than INR 5,00,000
    }

    @Override
    public void applyForLoan(double amount){
        if (calculateLoanEligibility()) {
            System.out.println("Loan of INR " + amount + " approved for " + getHolderName());
        } else {
            System.out.println("Loan application for " + getHolderName() + " rejected due to insufficient eligibility.");
        }
    }
}

//Implement subclasses CurrentAccount with unique interest calculations.
class CurrentAccount extends BankAccount implements Loanable{
    private double annualIncome;
    //Constructor
    CurrentAccount(String accountNumber, String holderName, double balance, double annualIncome){
        super(accountNumber, holderName, balance);
        this.annualIncome = annualIncome;
    }

    //Getter
    public double getAnnualIncome() {
        return annualIncome;
    }

    @Override
    public double calculateInterest(){
        return getBalance()*0.25; //Interest is 25%
    }

    @Override
    public boolean calculateLoanEligibility() {
        //Loan eligibility based on income (simple logic)
        return annualIncome > 500000;  // Eligibility criteria: income must be more than INR 5,00,000
    }

    @Override
    public void applyForLoan(double amount){
        if (calculateLoanEligibility()) {
            System.out.println("Loan of INR " + amount + " approved for " + getHolderName());
        } else {
            System.out.println("Loan application for " + getHolderName() + " rejected due to insufficient eligibility.");
        }
    }
}

public class Bank{
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("1245878","Vidhi",50000,600000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(2000);
        savingsAccount.calculateInterest();
        savingsAccount.displayDetails();
        savingsAccount.applyForLoan(5000);

        System.out.println();
        CurrentAccount currentAccount = new CurrentAccount("15487890","Jain",5221,200000);
        currentAccount.deposit(522);
        currentAccount.withdraw(522);
        currentAccount.calculateInterest();
        currentAccount.displayDetails();
        currentAccount.applyForLoan(60000);
    }
}
