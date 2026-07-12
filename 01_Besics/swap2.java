//Swap two numbers without using a third variable.


import java.util.*;
public class swap2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a= sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping value of a is: "+a);
        System.out.println("After swaping value of b is: "+b);
    }
}