//Create a method to find the largest of three numbers.


import java.util.*;
public class large{
    public static void largeNumCheck(int a, int b, int c){
        if(a>b&&a>c){
            System.out.println("Greater among 3 number is: "+a);
        }
        else if(b>c&&b>a){
            System.out.println("Greater among 3 number is: "+b);
        }
        else if(c>a&&c>b){
            System.out.println("Greater among 3 number is: "+c);
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a= sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b= sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c= sc.nextInt();
        largeNumCheck(a, b, c);
    }
}