// GCD (HCF) of Two Numbers ⭐⭐⭐

// Input

// 24
// 36

// Output

// 12

// Hint:

// Loop from 1 to the smaller number and keep updating the greatest common divisor whenever both numbers are divisible by the current value.


import java.util.*;
public class GCD{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number: ");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int small;
        if(n1<n2){
            small= n1;
        }
        else{
            small= n2;
        }
        for(int i= small; i>=1; i--){
            if(n2%i==0&&n1%i==0){
                System.out.println("GCD: "+i);
                break;
            }
        }
    }
}