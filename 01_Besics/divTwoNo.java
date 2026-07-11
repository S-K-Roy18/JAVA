//Divide two numbers.

import java.util.*;
public class divTwoNo{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1= sc.nextDouble();
        System.out.print("Enter second number: ");
        double n2= sc.nextDouble();
        double div= n1/n2;
        System.out.println("Division of two numbers is: "+div);
    }
}