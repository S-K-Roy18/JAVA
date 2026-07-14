// LCM of Two Numbers ⭐⭐⭐

// Input:

// 12
// 18

// Output

// LCM = 36

// Hint:

// Start from the larger number and keep increasing until you find a number divisible by both.



import java.util.*;
public class LCM{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number: ");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        System.out.print("LCM= ");
        int start;
        if(n1<n2){
            start= n1;
        }else{
            start= n2;
        }
        for(int i=start; i<=(n1*n2); i++){
            if(i%n1==0 && i%n2==0){
                System.out.println(i);
                break;
            }
        }
    }
}