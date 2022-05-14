package com.bridgelabz;

import static com.bridgelabz.UserRegistration.scanner;

public class UserRegistrationMain {
    public static void main(String args[]) {

        System.out.println("Enter 2 : to validate Last Name ");
        switch (scanner.nextInt()){
            case 2:
                UserRegistration.validLastName();
                break;
             }
    }
}
