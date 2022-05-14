package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in); //Scanner function declared as static
    public static boolean validFirstName() {
        //Regex pattern to check User's First name

        System.out.print("Enter the First Name : ");
        String firstName = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(firstName);
        boolean r = m.matches();

        if (r)
            System.out.println("First name is valid");
        else
            System.out.println("First name is !Invalid");
        return r;
    }
}
