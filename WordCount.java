//Q9. Write a Java Program to Count Number of Words in Given String.

import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Split the string by whitespace to count words
        String[] words = input.trim().split("\\s+");
        int wordCount = words.length;

        System.out.println("Number of words: " + wordCount);
        scanner.close();
    }
}