// ATM Machine Simulation

// Balance:

// 5000

// User enters withdrawal amount.

// Check:

// Negative amount
// Zero amount
// More than balance
// Valid withdrawal

// Print remaining balance.



import java.util.*;
public class atm{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        int withdraw= sc.nextInt();
        int balance=5000;
        if(withdraw<0){
            System.out.println("Nagative amount.");
        }
        else if(withdraw==0){
            System.out.println("Zero amount.");
        }
        else if(withdraw>balance){
            System.out.println("More than balance.");
        }
        else{
            System.out.println("Valid Withdrawl.");
            int remain= balance-withdraw;
            System.out.println("Remaining amount: "+remain);
        }
        
    }
}