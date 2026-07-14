// Perfect Number ⭐⭐⭐

// A number is Perfect if the sum of its proper divisors equals the number.

// Example
// Input:
// 6

// Divisors:
// 1, 2, 3

// Sum:
// 1 + 2 + 3 = 6

// Output

// Perfect Number

// Example:

// 28

// Divisors:
// 1 2 4 7 14

// Sum = 28

import java.util.*;
public class perfectNo{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        boolean divisor= true;
        int sum= 0;
        int temp= n;
        
            for(int i=1; i<n; i++){
                if(n%i==0){
                    sum= sum+i;
                }
            }
        
        if(sum==temp){
            System.out.println("Its a perfect number.");
        }
        else{
            System.out.println("Its not a perfect number.");
        }
    }
}