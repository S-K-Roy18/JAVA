// Determine the type of triangle.

// Possible outputs:

// Equilateral
// Isosceles
// Scalene


import java.util.*;
public class typeTriangle{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);            
        System.out.println("Enter three edges of triangle:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a==b&&a==c){
            System.out.println("Equilateral.");
        }
        else if(a==b&&a!=c||b==c&&b!=a||c==a&&c!=b){
            System.out.println("Isoceles.");
        }
        else{
            System.out.println("Scalene.");
        }
    }
}