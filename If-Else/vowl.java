//Check whether a character is a vowel or consonant.

import java.util.*;
public class vowl{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch= sc.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println("Character is vowl.");
        }
        else{
            System.out.println("Chracter is consonant.");
        }
    }
}