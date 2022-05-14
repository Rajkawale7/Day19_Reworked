package com.bridgelabz;

import static com.bridgelabz.UserRegistration.scanner;

public class UserRegistrationMain {
    public static void main(String args[]) {

        System.out.println("Enter 3 : to validate User Email ");
        switch (scanner.nextInt()){
            case 3:
                UserRegistration.validUserEmail();
                break;
             }
    }
}
