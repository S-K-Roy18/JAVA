//Create a method to calculate the sum of digits



import java.util.*;
public class SumDigit{
    public static void sumOfDigit(int n){
        int sum=0;
        while(n!=0){
            int ld= n%10;
            sum= sum+ld;
            n=n/10;
        }
        System.out.println("Sum of all digits of "+n+" is: "+sum);
        return;
    }
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        sumOfDigit(n);
    }
}