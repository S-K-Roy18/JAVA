// Create a method to calculate the power of a number.

// Method

// power(int base, int exponent);

// Example

// 2 5

// ↓

// 32


import java.util.*;
public class power{
    public static int power(int base, int exp){
        return (int) Math.pow(base, exp);
    }
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter base: ");
        int base= sc.nextInt();
        System.out.print("Enter exponent: ");
        int exp= sc.nextInt();
        int ans= power(base, exp);
        System.out.println("powered is: "+ans);
    }
}




// public class power{
//     public static int power(int base, int exp){
//         int result= 1;
//         for(int i=1; i<=exp; i++){
//             result= result*base;
//         }
//         return result;
//     }
//     public static void main(String[] a){
//        Scanner sc= new Scanner(System.in);
//         System.out.print("Enter base: ");
//         int base= sc.nextInt();
//         System.out.print("Enter exponent: ");
//         int exp= sc.nextInt();
//         int ans= power(base, exp);
//         System.out.println("powered is: "+ans); 
//     }
// }