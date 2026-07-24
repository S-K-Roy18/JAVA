// Count frequency of a given element.

// Example

// 1 2 2 3 2 4

// Search = 2

// ↓

// Frequency = 3


import java.util.*;
public class Q14frequency{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" element: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the number to search frequency: ");
        int n2= sc.nextInt();
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n2){
                count++;
            }
        }
        System.out.println("Frequency of "+n2+" is: "+count);
    }
}