// subject marks

// Check

// Fail if any subject < 35
// Otherwise calculate percentage

// Then print

// Distinction

// First Division

// Second Division

// Third Division

// Fail

import java.util.*;
public class marks{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 subject marks: ");
        float m1= sc.nextFloat();
        float m2= sc.nextFloat();
        float m3= sc.nextFloat();
        if(m1<35||m2<35||m3<35){
            System.out.println("Fail in one subject");
        }
        else{
            float total= m1+m2+m3;
            float percentage=total/300*100;
            if(percentage>=90){
                System.out.println("Distinction.");
            }
            else if(percentage>=80&&percentage<90){
                System.out.println("First Division.");
            }
            else if(percentage>=70&&percentage<80){
                System.out.println("Second Division.");
            }
            else if(percentage>=35&&percentage<70){
                System.out.println("Third Division.");
            }
            else{
                System.out.println("Fail.");
            }
        }
    }
}