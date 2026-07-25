//Find the second smallest element


import java.util.*;
public class Q17secondSmall{
    public static int secondSmall(int arr[]){
        int small= arr[0];
        int secondSmall= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
                secondSmall=small;
                small= arr[i];
                return arr[i];
            }
            else if(arr[i]<secondSmall && arr[i]!=small){
                secondSmall= arr[i];
                return arr[i];
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
        int scndSmall= secondSmall(arr);
        if(scndSmall!=-1){
            System.out.println("Second smalln numberb is: "+secondSmall(arr));
        }
    }
}