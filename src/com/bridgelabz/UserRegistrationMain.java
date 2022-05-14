package com.bridgelabz;

import static com.bridgelabz.UserRegistration.scanner;

public class UserRegistrationMain {
    public static void main(String args[]) {

        System.out.println("Enter 6 : to Check Valid Email Samples ");
        switch (scanner.nextInt()){
            case 6:
                UserRegistration.validEmailSamples();
                break;
             }
    }
}
