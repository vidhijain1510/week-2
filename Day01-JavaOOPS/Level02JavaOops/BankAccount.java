/*Program to Simulate an ATM
Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
Depositing money.
Withdrawing money (only if sufficient balance exists).
Displaying the current balance.
Explanation: The BankAccount class stores bank account details as attributes. 
The methods allow interaction with these attributes to modify and view the account's state.
 */

import java.util.*;

class Bank{
    String accountHolder;
    String accountNumber;
    double balance;

    //Constructor
    public Bank(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Method for depositing money
    double depositingMoney(double depositeMoney){
        if(depositeMoney < 0){//If deposite can not be less than 0 
            throw new IllegalArgumentException ("Deposite money can not be negative!");
        }else{
            balance += depositeMoney; 
        }  
        return balance;//Returning updated balance
        
    }

    //Method for withdraw money
    double withdrawingMoney(double withdrawMoney){
        if(balance >= withdrawMoney){//If balance is available than only withdraw id possible
            balance -=  withdrawMoney;  
        } 
        return balance;//Returning updated balance
    }

    //Method to display details
    void display(){
        System.out.println("Account holder: " + accountHolder + "\nAccount number: " + accountNumber + "\nBalance: " + balance) ;
    }

}

public class BankAccount{
    public static void main(String[] args) {
        //To take user input
        Scanner input = new Scanner(System.in);

        //Taking user input for name of account holder, account number, and current balance
        System.out.println("Enter the name of account holder: ");
        String accountHolder = input.nextLine();
        System.out.println("Enter the account number: ");
        String accountNumber = input.nextLine();
        System.out.println("Enter the current balance of account: ");
        double balance = input.nextDouble();

        System.out.println();
        
        //Creating object to call methods
        Bank bank = new Bank(accountHolder, accountNumber, balance);
		System.out.println("Functioning of ATM started: ");
		System.out.println("Choose one of these \n1. withdraw \n2. deposite \n3. Current Balance ");
		
		int choice = input.nextInt();
		if(choice == 1){
			System.out.println("Enter money to be withdrawn: ");//Withdraw money input from user
			double withdrawMoney = input.nextDouble();
			bank.withdrawingMoney(withdrawMoney);//Calling withdrawingMoney method to withdraw money
			bank.display();//Calling method to display details
		}else if(choice == 2){
			System.out.println("Enter money to be deposite: ");//Deposite money input from user
			double depositeMoney = input.nextDouble();
			bank.depositingMoney(depositeMoney);//Calling depositeMoney Method to deposite money       
			bank.display();//Calling method to display details
		}else if(choice == 3){
			bank.display();
		}
        input.close();

    }
}
