// Count Positive, Negative and Zero.

import java.util.*;
public class Q08count2{
     public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" element: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int posCount=0;
        int negCount=0;
        int zeroCount=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
            posCount++;
        }
        else if(arr[i]<0){
            negCount++;
        }
        else{
            zeroCount++;
        }
        }
        System.out.println("positive number has: "+posCount);
        System.out.println("Negative number has: "+posCount);
        System.out.println("Zero number has: "+zeroCount);
    }
}