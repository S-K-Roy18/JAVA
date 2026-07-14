//Print all prime numbers between 1 and N.




import java.util.*;
public class primePrint{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        System.out.print("Prime numbers between 1 and " + n + " are: ");
        for(int num=2; num<n; num++){
        boolean prime= true;
        for(int i=2; i<num; i++){
            if(num%i==0){
                prime= false;
                break;
            }
        }
        if(prime){
            System.out.print(num + ", ");
        }
        }
    }
}