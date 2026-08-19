// Q20. Find the most frequent element ⭐⭐⭐

// Example

// 1 2 2 2 3 1

// Output

// 2

import java.util.*;
public class Q20frequent{
    public static int mostFrequent(int arr[]){
        int maxCount=0;
        int mostFrequent= arr[0];
        for(int i=0; i<arr.length; i++){
            int count =0;
            for(int j=0; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount= count;
                mostFrequent= arr[i];
            }
        }
        return mostFrequent;
    }
    public static void main(String a[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter all the elemnts: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int result= mostFrequent(arr);
        System.out.print("most frequent element is: "+result);
    }
}