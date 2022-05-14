package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in); //Scanner function declared as static
    public static boolean validLastName() {
        //Regex pattern to check User's Last name

        System.out.print("Enter the Last Name : ");
        String lastName = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(lastName);
        boolean r = m.matches();

        if (r)
            System.out.println("Last name is valid");
        else
            System.out.println("Last name is !Invalid");
        return r;
    }
}
