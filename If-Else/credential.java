// Login System

// Store

// Username

// Password

// Take user input.

// Check:

// Username correct?
// Password correct?

// Print

// Login Successful

// or

// Invalid Credentials



import java.util.*;
public class credential{
    public static void main(String[] a){
        String username="Admin";
        String password="admin123";
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter username: ");
        String usernameInput= sc.next();
        System.out.print("Enter password: ");
        String passwordInput= sc.next();
        if(password.equals(passwordInput)&&username.equals(usernameInput)){
            System.out.println("Login succesfull.");
        }
        else{
            System.out.println("Invalid credentials.");
        }
    }
}