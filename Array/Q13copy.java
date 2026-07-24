//Copy one array into another.


import java.util.*;
public class Q13copy{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        int[] arr2= new int[n];
        System.out.println("Enter "+n+" element: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Copied array: ");
        for(int i=0; i<n; i++){
            arr2[i]= arr[i];
        }
        for(int i=0; i< arr.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}