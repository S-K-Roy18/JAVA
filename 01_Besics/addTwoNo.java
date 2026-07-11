//Add two numbers.

import java.util.*;
public class addTwoNo{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1= sc.nextInt();
        System.out.print("Enter Second No: ");
        int n2= sc.nextInt();
        int sum=n1+n2;
        System.out.println("Sum of two number is: "+sum);
    }
}