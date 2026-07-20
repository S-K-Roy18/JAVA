//Create a method to check whether a number is a palindrome.


import java.util.*;
public class pallindrome{
    public static boolean isPallindrome(int n){
        int rev=0;
        int temp= n;
        while(n!=0){
            int ld= n%10;
            rev= rev*10+ld;
            n=n/10;
        }
        if(rev!=temp){
            return false;
        }
        return true;
    }
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        if(isPallindrome(n)){
            System.out.println(n+" is a pallindrome number.");
        }
        else{
            System.out.println(n+" is not a pallindrome number.");
        }
    }
}