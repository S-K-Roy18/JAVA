//Check whether a number is divisible by both 5 and 11.

import java.util.*;
public class divisable{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        if(n%5==0&&n%11==0){
            System.out.println("Its divisable by both 5 and 11.");
        }
        else{
            System.out.println("Its not divisable by both 5 and 11.");
        }
    }
}