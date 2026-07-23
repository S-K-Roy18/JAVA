// Create an array of 5 integers.

// Take input and print them.



import java.util.*;
public class Q01create{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        int[] num= new int[5];
        System.out.println("Enter 5 integers:");
        // num[0]= sc.nextInt();
        // num[1]= sc.nextInt();
        // num[2]= sc.nextInt();
        // num[3]= sc.nextInt();
        // num[4]= sc.nextInt();
        for(int i=0; i<num.length; i++){
            num[i]= sc.nextInt();
        }
        System.out.print("elements in arrays are: ");
        for(int i=0; i<num.length; i++){
            System.out.print(+num[i]+" ");
        }
    }
}
