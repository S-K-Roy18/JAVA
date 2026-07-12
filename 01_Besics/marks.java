// Calculate Total Marks, Average and Percentage

// Take marks of 5 subjects.

// Print:

// Total
// Average
// Percentage

import java.util.*;
public class marks{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects: ");
        int m1= sc.nextInt();
        int m2= sc.nextInt();
        int m3= sc.nextInt();
        int m4= sc.nextInt();
        int m5= sc.nextInt();
        float total= (m1+m2+m3+m4+m5);
        float average= total/5;
        float percentage= (total/500)*100;
        System.out.println("Total Marks: "+total);
        System.out.println("Average Marks: "+average);
        System.out.println("Percentage: "+percentage+"%");
    }
}