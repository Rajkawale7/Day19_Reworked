package com.bridgelabz;

import static com.bridgelabz.UserRegistration.scanner;

public class UserRegistrationMain {
    public static void main(String args[]) {

        System.out.println("Enter 1 : to validate First Name ");
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validFirstName();
                break;
             }
    }
}
