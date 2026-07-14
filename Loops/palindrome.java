// Check whether a number is a palindrome.

// Example:

// 121

// Palindrome


import java.util.*;
public class palindrome{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int rev=0;
        int original=n;
        while(n!=0){
            int digit= n%10;
            rev= rev*10+digit;
            n=n/10;
        }
        if(original==rev){
            System.out.println("Its a palindrome number.");
        }
        else{
            System.out.println("Its not a palindrome number.");
        }
    }
}
