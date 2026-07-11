//Subtract two numbers.

import java.util.*;
public class subTwoNo{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1= sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2= sc.nextInt();
        int sub= n1-n2;
        System.out.println("Subtract of two numbers is: " +sub);
    }
}