//Check whether a number is even or odd.


import java.util.*;
public class evenOdd{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Eneter a number: ");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("It is a even number.");
        }
        else{
            System.out.println("It is a odd number.");
        }
    }
}