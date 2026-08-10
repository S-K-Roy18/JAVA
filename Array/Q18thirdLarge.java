//Find the third largest element


import java.util.*;
public class Q18thirdLarge {
    public static int thirdLarge(int arr[]) {
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int thirdLarge = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > large) {
                thirdLarge = secondLarge;
                secondLarge = large;
                large = arr[i];
            }
            else if(arr[i] > secondLarge && arr[i] != large) {
                thirdLarge = secondLarge;
                secondLarge = arr[i];
            }
            else if(arr[i] > thirdLarge && arr[i] != secondLarge && arr[i] != large) {
                thirdLarge = arr[i];
            }
        }
        if(thirdLarge == Integer.MIN_VALUE){
            return -1;
        }
        return thirdLarge;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int thrdLarge = thirdLarge(arr);
        if(thrdLarge != -1) {
            System.out.println("Third largest number is: " + thrdLarge);
        }
        else {
            System.out.println("Third largest element not found.");
        }
        sc.close();
    }
}