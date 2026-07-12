// //Find the ASCII Value of a Character

// Example

// Input:
// A

// Output:
// 65

import java.util.*;
public class ascii{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch= sc.next().charAt(0);
        int ascii= ch;
        System.out.println("ASCII value of "+ch+" is: "+ascii);
    }
}