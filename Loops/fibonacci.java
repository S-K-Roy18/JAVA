// Print the Fibonacci series up to N terms.


import java.util.*;
public class fibonacci{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms to print fibonacci series: ");
        int n= sc.nextInt();
        int first=0;
        int second=1;
        for(int i=0; i<=n; i++){
            System.out.print(first+" ");
            int next= first+second;
            first=second;
            second= next;

        }
    }
}