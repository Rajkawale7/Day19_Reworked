package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in); //Scanner function declared as static
    public static boolean validUserEmail() {
        //As a User need to enter the valid Email ID
        System.out.print("Enter the Email Id : ");
        String email = scanner.next();
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        boolean r = m.matches();

        if (r)
            System.out.println("Email is valid");
        else
            System.out.println("Email is !Invalid");
        return r;
    }
}
