// Check whether the array is sorted.

// Example

// 1 2 3 4 5

// ↓

// Sorted
// 1 5 3 4

// ↓

// Not Sorted

import java.util.*;
public class Q11sort{
    public static boolean isSorted(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" element: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        if(isSorted(arr)){
            System.out.println("Sorted.");
        }
        else{
            System.out.println("Not Sorted.");
        }
    }
}
