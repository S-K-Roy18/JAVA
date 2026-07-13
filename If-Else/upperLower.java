//Check whether a character is uppercase or lowercase.



import java.util.*;
public class upperLower{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch= sc.next().charAt(0);
        if(ch>='A'&&ch<='Z'){
            System.out.println("Uppercase.");
        }
        else if(ch>='a'&&ch<='z'){
            System.out.println("Lowercase.");
        }
        else{
            System.out.println("Its not a chacracter.");
        }
    }
}