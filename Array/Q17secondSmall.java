//Find the second smallest element


import java.util.*;
public class Q17secondSmall {
    public static int secondSmall(int arr[]) {
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            }
            else if(arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }
        if(secondSmall == Integer.MAX_VALUE){
            return -1;
        }
        return secondSmall;
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
        int scndSmall = secondSmall(arr);
        if(scndSmall != -1) {
            System.out.println("Second smallest number is: " + scndSmall);
        }
        else {
            System.out.println("Second smallest element not found.");
        }
        sc.close();
    }
}