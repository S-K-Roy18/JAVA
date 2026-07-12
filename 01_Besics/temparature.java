//Convert temperature from Celsius to Fahrenheit.


import java.util.*;
public class temparature{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temparature in celcius: ");
        double c= sc.nextDouble();
        double f= 1.8*c+32;
        System .out.println("Temparature in Farhenheit is: "+f);
    }
}