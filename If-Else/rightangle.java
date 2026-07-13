// Determine whether a triangle is Right-angled or not.

// Hint:

// Use

// a² + b² = c²

// (Assume the largest side is entered last, or determine the largest side yourself.)



// import java.util.*;
// public class rightangle{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter three edges of triangle:");
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//         int c= sc.nextInt();
//         if(a*a+b*b==c*c){
//             System.out.println("Its a right-angled triangle.");
//         }
//         else{
//             System.out.println("Its not right-angled.");
//         }
//     }
// }

import java.util.*;
public class rightangle{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three edges of triangle:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a+b>c||b+c>a||c+a>b){
            if(a>b&&a>c){
                if(b*b+c*c==a*a){
                    System.out.println("Its a right-angled triangle.");
                }
                else{
                    System.out.println("Its not right-angled.");
                }
            }
            if(b>c&&b>a){
                if(a*a+c*c==b*b){
                    System.out.println("Its a right-angled triangle.");
                }
                else{
                    System.out.println("Its not right-angled.");
                }
            }
            if(c>b&&c>b){
                if(b*b+a*a==c*c){
                    System.out.println("Its a right-angled triangle.");
                }
                else{
                    System.out.println("Its not right-angled.");
                }
            }
        }
        else{
            System.out.println("Invalid edges.");
        }
    }
}