// *****
// *****
// *****
// *****
// *****
//user input



import java.util.*;
public class P07{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}