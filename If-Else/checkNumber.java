//Check whether a number is positive, negative, or zero.

import java.util.Scanner;
public class checkNumber{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        if(n==0){
            System.out.println("This Number is Zero.");
        }
        else if(n<0){
            System.out.println("This Number is Negative.");
        }
        else{
            System.out.println("This Number is Positive.");
        }
    }
}