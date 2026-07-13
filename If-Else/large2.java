//Find the largest of three numbers.

import java.util.*;
public class large2{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1= sc.nextInt();
        System.out.print("Enter second number: ");
        int n2= sc.nextInt();
        System.out.print("Enter third no: ");
        int n3= sc.nextInt();
        if(n1>n2&&n1>n2){
            System.out.println("Lagrest number is: "+n1);
        }
        else if(n2>n1&&n2>n3){
            System.out.println("Largest number is: "+n2);
        }
        else{
            System.out.println("Largest number is: "+n3);
        }
    }
}
