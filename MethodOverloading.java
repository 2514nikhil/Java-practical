//Q11. Write a program to illustrate the concept of class with Method overloading.
class MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println("Sum of a and b: " + obj.add(2, 3));
        System.out.println("Sum of a and b: " + obj.add(1, 2, 3));
        System.out.println("Sum of a and b: " + obj.add(2.5, 3.5));
    }
}
