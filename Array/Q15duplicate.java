// Print all duplicate elements.

// Example

// 1 2 3 2 5 1

// ↓

// 1
// 2

import java.util.*;
public class Q15duplicate{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Duplicate elements are: ");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}