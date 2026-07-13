// Find the oldest among four people.

// Don't use arrays.

// Use nested if-else.

import java.util.*;
public class elder{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter four peoples age: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println("Oldest is: "+a);
                }
                else{
                    System.out.println("Oldest is: "+d);
                }
            }
            else{
                if(c>d){
                    System.out.println("oldest is: "+c);
                }
                else{
                    System.out.println("Oldest is: "+d);
                }

            }
        }
        else{
            if(b>c){
                if(b>d){
                    System.out.println("Oldest is: "+b);
                }
                else{
                    System.out.println("Oldest is: "+c);
                }
            }
            else{
                if(c>d){
                    System.out.println("Oldest is: "+c);
                }
                else{
                    System.out.println("Oldest is: "+d);
                }
            }
        
        }
        sc.close();
    }
}
