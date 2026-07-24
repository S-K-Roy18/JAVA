// Reverse an array.

// Example

// 1 2 3 4 5

// ↓

// 5 4 3 2 1


import java.util.*;
public class Q09reverse{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter "+n+" elements: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Reversed array element are: ");
        int start= 0;
        int end= arr.length-1;
        while(start<end){
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
