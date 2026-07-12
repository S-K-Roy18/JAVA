//Convert Days into Years, Months and Days

import java.util.*;
public class day{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter days: ");
        int days= sc.nextInt();
        int year= days/365;
        int month= (days%365)/30;
        int day= (days%365)%30;
        System.out.println(year+"Years "+month+"Months "+day+"Days ");
    }
}
