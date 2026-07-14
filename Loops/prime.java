//Check whether a number is prime.


import java.util.*;
public class prime{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        boolean prime= true;
        if(n<1){
           prime=false;
        }
        else{
            for(int i=2; i<n; i++){
                if(n%i==0){
                    prime=false;
                    break;
                }
            }
        }
        if(prime){
            System.out.println("Its a prime number.");
        }
        else{
            System.out.println("Its not a prime");
        }
    }
}
