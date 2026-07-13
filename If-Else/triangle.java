// //Check whether three sides can form a valid triangle.

// Condition:

// a + b > c
// a + c > b
// b + c > a



import java.util.*;
public class triangle{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three edges:");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        if(a+b>c){
            if(b+c>a){
                if(c+a>b){
                    System.out.println("These are valid to create a triangle.");
                }
                else{
                    System.out.println("Not valid.");
                }
            }
            else{
                System.out.println("Not valid.");
            }
        }
        else{
            System.out.println("Not valid.");
        }
    }
}