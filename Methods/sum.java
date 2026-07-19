//Create a method to return the sum of two numbers.


import java.util.*;
public class sum{
    public static void printSum(int a, int b){
        int sum= a+b;
        System.out.print("Sum of "+a+" and "+b+" is: "+sum);
        return;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        printSum(a,b);
    }
}