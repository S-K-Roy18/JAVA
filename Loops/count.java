// Count the number of digits in a number.
// Find the sum of digits.

// Example:

// 1234

// 1+2+3+4=10



import java.util.*;
public class count{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int sum=0;
        while(n!=0){
            int digit= n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.print("sum of digits: "+sum);
    }
}