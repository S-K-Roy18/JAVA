// Q19. Count the frequency of every element ⭐⭐⭐

// Example

// 1 2 2 3 1 5

// Output

// 1 -> 2
// 2 -> 2
// 3 -> 1
// 5 -> 1

import java.util.*;
public class Q19frequency{
    public static void freq(int arr[]){
        boolean visited[]= new boolean[arr.length];
        for(int i=0; i<arr.length; i++){
            if (visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+"->"+count);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter all "+n+" elements: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        freq(arr);
    }
}