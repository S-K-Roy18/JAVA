//Create a method to calculate the factorial of a number.



import java.util.*;
public class factorial{
    public static void fact(int n){
        if(n<0){
            System.out.println("Invalid number.");
        }
        else{
            int factorial= 1;
        for(int i=1; i<=n; i++){
            factorial= factorial*i;
        }
        System.out.println("Factorial of "+n+" is: "+factorial);
        }
        return;
    }
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        fact(n);
    }
}