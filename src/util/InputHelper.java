package util;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine().trim();
    }

    public static int getInt(String prompt) {
        while (true) {
            System.out.print(prompt + ": ");
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid integer.");
            }
        }
    }

    public static String getEmail(String prompt) {
        while (true) {
            System.out.print(prompt + ": ");
            String input = scanner.nextLine().trim();
            if (input.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                return input;
            } else {
                System.out.println("⚠️ Invalid email format. Please try again.");
            }
        }
    }

    public static String getPhoneNumber(String prompt) {
        while (true) {
            System.out.print(prompt + ": ");
            String input = scanner.nextLine().trim();
            if (input.matches("^\\+?\\d{10,15}$")) {
                return input;
            } else {
                System.out.println("⚠️ Invalid phone number. Must be 10–15 digits, optionally starting with '+'.");
            }
        }
    }
}
