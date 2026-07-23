// Count Even and Odd numbers.

// Example

// 1 2 3 4 5 6

// Even = 3

// Odd = 3


public class Q06evenOdd{
    public static void main(String[] a){
        int arr[]= {1,2,3,4,5,6,};
        int count1=0;
        int count2=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                count1++;
            }
            else{
                count2++;
            }
        }
        System.out.println("Even numbers has: "+count1);
        System.out.println("odd numbers has: "+count2);
    }
}