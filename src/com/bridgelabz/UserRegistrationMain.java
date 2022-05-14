package com.bridgelabz;

import static com.bridgelabz.UserRegistration.scanner;

public class UserRegistrationMain {
    public static void main(String args[]) {

        System.out.println("Enter 4 : to validate User Mobile Number ");
        switch (scanner.nextInt()){
            case 4:
                UserRegistration.validMobileNumber();
                break;
             }
    }
}
