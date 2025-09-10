//Q10. Write a Java Program to Count the Occurrences of Each Character in String

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        scanner.close();

        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}