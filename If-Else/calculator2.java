//+, -, *, /, %


import java.util.*;
public class calculator2{
    public static void main(String[] a){
        System.out.println("1: Add    2: Sub   3: Mult    4: Div   5:Remainder");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number: ");
        float n1= sc.nextFloat();
        float n2= sc.nextFloat();
        System.out.print("Enter your operation number: ");
        int c= sc.nextInt();
        switch(c){
            case 1:
                System.out.println("Addition is: "+n1+n2);
                break;
            case 2:
                System.out.println("Substraction is: "+(n1-n2));
                break;
            case 3:
                System.out.println("Multiplication is: "+n1*n2);
                break;
            case 4:
                System.out.println("Division is: "+n1/n2);
                break;
            case 5:
                System.out.println("Remainder is: "+n1%n2);
                break;
            default: System.out.println("Invalid operator");
        } 
    }
}