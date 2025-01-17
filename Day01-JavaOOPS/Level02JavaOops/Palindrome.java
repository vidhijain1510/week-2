/*Program to Check Palindrome String
Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
Check if the text is a palindrome.
Display the result.
Explanation: The PalindromeChecker class holds the text attribute. 
The methods operate on this attribute to verify its palindrome status and display the result */

import java.util.*;

class PalindromeChecker{
    String text;//Attribute text

    //Constructor
    PalindromeChecker(String text){
        this.text = text;
    }

    //Method to check if the given string in palindrome or not
    boolean isPalindrome(){
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if(text.charAt(left) != text.charAt(right)){
                return false;
            }            
            left++;
            right--;
        }
        return true;
    }

    //Method to display
    void display(boolean palindromeText){
        System.out.println("The " + text + " is palindrome: " + palindromeText);
    }
}

public class Palindrome{
    public static void main(String[] args) {
        //To take user input
        Scanner input = new Scanner(System.in);

        //Taking string input
        System.out.println("Enter a text: ");
        String text = input.nextLine();

        //Creating object to access method
        PalindromeChecker palindromeString = new PalindromeChecker(text);
        boolean palindromeText = palindromeString.isPalindrome(); //Calling method to check palindrome
        palindromeString.display(palindromeText);//Calling method to display

        input.close();
    }
}