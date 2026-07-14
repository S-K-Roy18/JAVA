// Strong Number ⭐⭐⭐

// A number is called a Strong Number if the sum of the factorial of its digits equals the number itself.

// Example
// Input:
// 145

// Calculation:
// 1! + 4! + 5!

// = 1 + 24 + 120

// = 145

// Output

// 145 is a Strong Number

import java.util.*;
public class strongNo{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int temp= n;
        int sum=0;
        while(n!=0){
            int digit= n%10;
            int fact=1;
            for(int i=1; i<=digit; i++){
            fact= fact*i;
            }
            n=n/10;
            sum= sum+fact;
        }
        if(temp==sum){
            System.out.println("Its a strong number.");
        }
        else{
            System.out.println("Its not a strong number.");
        }
    }
}