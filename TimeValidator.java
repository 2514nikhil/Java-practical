//Q14. 14.	Write an exception class for a time of day that can accept only 24 hour representation of clock hours. Write a java program to input various formats of timings and throw suitable error messages.

import java.util.Scanner;
class InvalidTimeException extends Exception {
    public InvalidTimeException(String message) {
        super(message);
    }
}

public class TimeValidator {
    public static void validateTime(String time) throws InvalidTimeException {
        if (!time.matches("\\d{2}:\\d{2}")) {
            throw new InvalidTimeException("Invalid format! Please use HH:mm (24-hour format).");
        }
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour must be between 00 and 23.");
        }
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute must be between 00 and 59.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time (24-hour format HH:mm): ");
        String input = scanner.nextLine();
        try {
            validateTime(input);
            System.out.println("Valid time: " + input);
        } catch (InvalidTimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
