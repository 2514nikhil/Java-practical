//Q7. Write a program that declares a class named Person. It should have instance variables to record name, age and salary. Use new operator to create a Person object. Set and display its instance variables. Add a constructor to the Person class developed above.




public class Person {
    String name;
    int age;
    double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Person person1 = new Person("Nikhil", 19, 100000);
        Person person2 = new Person("Vivek", 18, 50000);

        person1.displayDetails();
        person2.displayDetails();
    }
}