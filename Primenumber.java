//Q2. Write a program to find whether the number is prime or not.

public class Primenumber {
    static void PrimeCheck(int num) {


        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); ) {
                if (num % i == 1)
                    isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("It is not Prime Number  ");

        } else {
            System.out.println("It is Prime Number  ");
        }
    }

    public static void main(String[] args) {
        PrimeCheck(19);
    }
}
