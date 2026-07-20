//Create a method to print all Prime numbers between 1 and N.


import java.util.*;

public class primeNum {

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }

        }

        return true;
    }

    public static void printPrime(int n) {

        for (int i = 2; i <= n; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers between 1 and " + n + " are:");

        printPrime(n);
    }
}