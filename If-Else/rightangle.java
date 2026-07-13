// Determine whether a triangle is Right-angled or not.

// Hint:

// Use

// a² + b² = c²

// (Assume the largest side is entered last, or determine the largest side yourself.)



import java.util.*;
public class rightangle{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three edges of triangle:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a*a+b*b==c*c){
            System.out.println("Its a right-angled triangle.");
        }
        else{
            System.out.println("Its not right-angled.");
        }
    }
}