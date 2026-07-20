//Create a method to reverse a number.


import java.util.*;
public class reverse{
    public static void reverseNum(int n){
        int rev=0;
        int temp= n;
        while(n!=0){
            int ld= n%10;
            rev= rev*10+ld;
            n=n/10;
        }
        System.out.println("Reverse of "+temp+" is: "+rev);
        return;
    }
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        reverseNum(n);
    }
}