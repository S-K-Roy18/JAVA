//Create a method to check whether a number is even or odd.



import java.util.*;
public class even{
    public static void evenOddCheck(int n){
        if(n%2==0){
            System.out.println(n+" is a even number.");
        }
        else{
            System.out.println(n+" is a odd number.");
        }
    }
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        evenOddCheck(n);
    }
}