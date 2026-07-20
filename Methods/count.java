//Create a method to count the digits of a number.
// Example

// 987654

// ↓

// 6


import java.util.*;
public class count{
    public static void countDigit(int n){
        int count= 0;
        int temp= n;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.print("Total digits in "+temp+" is: "+count);
        return;
    }
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        countDigit(n);
    }
}