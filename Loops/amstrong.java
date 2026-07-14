// Check whether a number is an Armstrong number.

// Example:

// 153

// 1³+5³+3³=153

import java.util.*;

public class amstrong {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int org = n;
        int temp = n;
        int sum = 0;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, count);
            temp = temp / 10;
        }
        if (org == sum) {
            System.out.println("It is an Armstrong number.");
        } else {
            System.out.println("It is not an Armstrong number.");
        }
    }
}