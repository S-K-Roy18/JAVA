//Create a method to print numbers from 1 to N.

import java.util.*;
public class numPrint{
    public static void printNum(int n){
        System.out.println("numbers from 1 to "+n+" are: ");
        for(int i=1; i<=n; i++){
            System.out.print(i+", ");
        }
        return ;
    }
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        printNum(n);
    }
}