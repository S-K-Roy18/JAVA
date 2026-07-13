//Find whether a person is eligible to vote.

import java.util.*;
public class vote{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter age- ");
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("Person is eligible for vote.");
        }
        else{
            System.out.println("Person is not visible for vote.");
        }
    }
}