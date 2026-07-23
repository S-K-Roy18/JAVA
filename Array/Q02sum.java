// Find the sum of all array elements.

// Example

// 1 2 3 4 5

// ↓

// 15


public class Q02sum{
    public static void main(String[] a){
        int arr[]= {1, 2, 3, 4, 5};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum= sum+arr[i];
        }
        System.out.println("Sum of the array elments is: "+sum);
    }
}