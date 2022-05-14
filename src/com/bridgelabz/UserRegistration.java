package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in); //Scanner function declared as static
    public static void validPassword() {
        Scanner scanner = new Scanner(System.in);
        //As a User need to a follow predefined Unique Password format.
        System.out.print("Enter your Unique Password : ");
        String password = scanner.nextLine();
        String regex3 = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(password);
        boolean r3 = m3.matches();
        if (r3)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }
}