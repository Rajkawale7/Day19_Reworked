package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in); //Scanner function declared as static

    //User case UC-9
    //Regex to check some valid Email Samples
    public static void validEmailSamples() {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        String Email1 = "Rajkawal00@gmail.com";
        System.out.println(Pattern.compile(regex).matcher(Email1).matches());

        String Email2 = "rajkawale@gmail.com";
        System.out.println(Pattern.compile(regex).matcher(Email2).matches());

        String Email3 = "raj_kawale@gmail.com";
        System.out.println(Pattern.compile(regex).matcher(Email3).matches());

        String Email4 = "712@gmail.com";
        System.out.println(Pattern.compile(regex).matcher(Email4).matches());

        String Email5 = "712@gmail.";
        System.out.println(Pattern.compile(regex).matcher(Email5).matches());

        String Email6 = "RAJ712@GMAIL.COM";
        System.out.println(Pattern.compile(regex).matcher(Email6).matches());
    }
}