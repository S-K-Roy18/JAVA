//Assign grades based on marks.

import java.util.*;
public class grades{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter marks:");
        int marks= sc.nextInt();
        if(marks>=95){
            System.out.println("O");
        }
        else if(marks>=90&&marks<95){
            System.out.println("A+");
        }
        else if(marks>=85&&marks<90){
            System.out.println("A");
        }
        else if(marks>=80&&marks<=85){
            System.out.println("B+");
        }
        else if(marks>=75&&marks<=80){
            System.out.println("B");
        }
        else if(marks>=70&&marks<=75){
            System.out.println("C");
        }
        else if(marks>=40&&marks<=70){
            System.out.println("P");
        }
        else{
            System.out.println("F");
        }
    }
}