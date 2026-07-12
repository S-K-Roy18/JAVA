//Convert Seconds into Hours, Minutes and Seconds

import java.util.*;
public class time{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the seconds: ");
        int sec= sc.nextInt();
        int hours= sec/3600;
        int minute= (sec%3600)/60;
        int seconds= sec%60;
        System.out.println(hours+"Hours "+minute+"Minutes "+seconds+"Seconds");
    }
}