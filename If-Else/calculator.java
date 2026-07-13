//  Menu Driven Calculator

// Display

// 1. Add

// 2. Subtract

// 3. Multiply

// 4. Divide

// User enters

// Choice

// Use

// if-else

// (Not switch.)


import java.util.*;
public class calculator{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.println("1.Add   2.Subtract   3.Multiply   4.Divide");
        System.out.print("Enter any choice: ");
        int choice= sc.nextInt();
        System.out.println("Enter two numbers: ");
        float n1=sc.nextFloat();
        float n2= sc.nextFloat();
        if(choice==1){
            float add= n1+n2;
            System.out.println("Addition is: "+add);
        }
        else if(choice==2){
            float sub=n1-n2;
            System.out.println("Subtract is: "+sub);
        }
        else if(choice==3){
            float mult=n1*n2;
            System.out.println("Multiply is: "+mult);
        }
        else {
            float div=n1/n2;
            System.out.println("Divide is: "+div);
        }
    }
}