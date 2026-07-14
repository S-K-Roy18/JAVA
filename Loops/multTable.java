//Print the multiplication table of a number.

import java.util.*;
public class multTable{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int mult=1;
        System.out.println("Multiplication table of "+n+" :");
        for(int i=1; i<=10; i++){
            mult= n*i;
            System.out.println(n+" * "+i+" = "+mult);
        }
    }
}