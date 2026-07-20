// Create a method to check whether a number is an Armstrong Number.

// Use these methods:

// countDigits()
// power()

// Don't use Math.pow().



import java.util.*;
public class amstrong{
    public static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = countDigits(n);
        while (n != 0) {
            int digit = n % 10;
            sum = sum + power(digit, digits);
            n = n / 10;
        }
        return original == sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("It is an Armstrong Number.");
        } else {
            System.out.println("It is not an Armstrong Number.");
        }
        sc.close();
    }
}