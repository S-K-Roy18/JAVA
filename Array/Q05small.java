// Find the smallest element.



import java.util.*;
public class Q05small{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" element:");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int small= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
                small= arr[i];
            }
        }
        System.out.println("Smallest element in array is: "+small);
    }
}