// Reverse a number.

// Example:

// 12345
// ↓

// 54321


import java.util.*;
public class rev{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int rev=0;
        while(n!=0){
            int digit= n%10;
            rev= rev*10+digit;
            n=n/10;
        }
        System.out.println("Reverse is: "+rev);
    }
}