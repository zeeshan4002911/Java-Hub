package java_essentials.service;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AgeValidator av = new AgeValidator();
        try {
            System.out.print("Enter Username: ");
            String userName = sc.nextLine();
            System.out.print("Enter Age: ");
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number for age.");
                return;
            }
            int age = sc.nextInt();
            av.checkEligibility(userName, age);
        } catch (InvalidAgeException e) {
            System.out.println("Validation failed: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}

class AgeValidator {
    public void checkEligibility(String username, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        } else {
            System.out.println("Welcome " + username + ".");
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}