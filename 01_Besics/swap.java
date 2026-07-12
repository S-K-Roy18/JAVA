//Swap two numbers using a third variable.


import java.util.*;
public class swap{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the value of a: ");
    int a= sc.nextInt();
    System.out.print("Enter the value of b: ");
    int b= sc.nextInt();
    int temp= a;
    a=b;
    b=temp;
    System.out.println("After swapping value of a is: "+a);
    System.out.println("After swapping value of b is: "+b);
    }
}
