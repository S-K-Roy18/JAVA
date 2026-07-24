// Find the second largest element.

import java.util.*;
public class Q12secondLarge{
    public static void main(String[] a){
        // int arr[]= {5,9,3,4,7,2,8};


        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" element: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int largest= arr[0];
        int secondLargest= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                secondLargest= largest;
                largest= arr[i];
            }
            else if (arr[i]> secondLargest && arr[i]!= largest){
                secondLargest= arr[i];
            }
        }
        System.out.println("Second Largest is: "+secondLargest);
    }
}
















// I want to add one more feature is Extra meal.

// what is this extra meal- it is a meal count when suppose someones friend come to the mess in any day and he takes meal then his meal count should add to his friend of our mess.
// where to add- for manager add this entrytable under the meal entry tables save button, there also should be same as meal entry table and every member can see this in dashboards in meal track page(suppose he takes an extra meal on any date, so it should look on that date as 1 extra meal) and in dashboard meal cost table should also a column for extra meal
// and remember this extra meal should also count as +1 meal count