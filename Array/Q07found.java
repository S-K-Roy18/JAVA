// Search an element in an array.

// Input

// 10 20 30 40 50

// Search

// 30

// Output

// Found at index 2


public class Q07found{
    public static void main(String[] a){
        int arr[]= {10, 20, 30, 40, 50};
        for(int i=0; i<arr.length; i++){
            if(arr[i]==30){
                System.out.println("30 found at index no: "+i);
            }
        }
    }
}