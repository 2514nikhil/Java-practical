//Q6. Write a test program that prompts the user to enter ten numbers, invoke a method to reverse the numbers, display the numbers.

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Numbers in reverse order:");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}