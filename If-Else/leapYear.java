//Check whether a year is a leap year.

import java.util.*;
public class leapYear{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year= sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It is Leap Year.");
                }
                else{
                    System.out.println("It is not Leap Year.");
                }
            }
            else{
                System.out.println("It is Leap year.");
            }
        }
        else{
            System.out.println("Its not Leap Year.");
        }
    }
}