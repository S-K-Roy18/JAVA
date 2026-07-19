//Create a method to return the square of a number.




import java.util.*;
public class square{
    public static void sqr(int n){
        int square= n*n;
        System.out.println("Square of "+n+" is: "+square);
        return;
    }
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        sqr(n);
    }
}