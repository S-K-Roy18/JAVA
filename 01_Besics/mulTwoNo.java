//Multiply two numbers.

import java.util.*;
public class mulTwoNo{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1= sc.nextInt();
        System.out.print("Enter Second No: ");
        int n2= sc.nextInt();
        int mul= n1*n2;
        System.out.println("Multiply of two number is: "+mul);
    }
}