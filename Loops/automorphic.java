// Automorphic Number ⭐⭐⭐⭐

// A number is Automorphic if its square ends with the number itself.

// Example
// Input:
// 25

// Square:
// 625

// Ends with 25

// Output:
// Automorphic Number

// Another example:

// 76

// 76² = 5776

// Ends with 76


import java.util.*;
public class automorphic{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int square= n*n;
        int count= 0;
        int temp= n;
        int power= 1;
        while(n!=0){
            count++;
            n= n/10;
        }
        for(int i=1; i<=count; i++){
            power = power * 10;
        }
        if(temp==square%power){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not Automorphic Number");
        }
    }
}