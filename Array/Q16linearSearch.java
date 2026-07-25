// Linear Search ⭐

// Search an element in the array.

// Example

// Input:
// 10 20 30 40 50

// Search:
// 30

// Output:
// Found at index 2



import java.util.*;
public class Q16linearSearch{
    public static int search(int arr[], int n2){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n2){
                return i;
            }   
        }
        return -1;
    }
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the elements to search: ");
        int n2= sc.nextInt();
        int index= search(arr, n2);
        if(index!= -1){
            System.out.print(n2+" found at index: "+search(arr, n2));
        }
        else{
            System.out.print("Elements not found in array.");
        }
    }
}
