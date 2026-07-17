//Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.


import java.util.Scanner;
public class month{
    public static void main(String[] a){
        Scanner sc= new Scanner(System.in);
        System.out.print("Choose a number from 1 to 12: ");
        int n= sc.nextInt();
        if(n==1){
            System.out.println("1 no month is January.");
        }
        else if(n==2){
            System.out.println("2 no month is February.");
        }
        else if(n==3){
            System.out.println("3 no month is March.");
        }
        else if(n==4){
            System.out.println("4 no month is April.");
        }
        else if(n==5){
            System.out.println("5 no month is May.");
        }
        else if(n==6){
            System.out.println("6 no month is Jun.");
        }
        else if(n==7){
            System.out.println("7 no month is Jully.");
        }
        else if(n==8){
            System.out.println("8 no month is August.");
        }
        else if(n==9){
            System.out.println("9 no month is September.");
        }
        else if(n==10){
            System.out.println("10 no month is October.");
        }
        else if(n==11){
            System.out.println("11 no month is November.");
        }
        else if(n==12){
            System.out.println("12 no month is December.");
        }
        else{
            System.out.println("Invalid input.");
        }
    }
}