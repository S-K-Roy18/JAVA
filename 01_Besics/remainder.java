//Find the remainder of two numbers.


import java.util.*;
public class remainder{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
         System.out.print("Enter 1st no: ");
         int n1= sc.nextInt();
         System.out.print("Enter second no: ");
         int n2= sc.nextInt();
         int rem= n1%n2;
         System.out.println("Remainder of two number is: "+rem);
        }
}