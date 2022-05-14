package com.bridgelabz;

import static com.bridgelabz.UserRegistration.scanner;

public class UserRegistrationMain {
    public static void main(String args[]) {

        System.out.println("Enter 5 : to validate User Unique Password ");
        switch (scanner.nextInt()){
            case 5:
                UserRegistration.validPassword();
                break;
             }
    }
}
