//Find the largest element.



import java. util.*;
public class Q04large{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" element: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int large= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>large){
                large= arr[i];
            } 
        }
        System.out.println("Largest element is array is: "+large);
    }
}