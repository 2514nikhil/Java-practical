//Q8. The employee list for a company contains employee code, name, designation and basic pay. The employee is given HRA of 10% of the basic and DA of 45% of the basic pay. The total pay of the employee is calculated as Basic pay+HRA+ DA. Write a class to define the details of the employee. Write a constructor to assign the required initial values. Add a method to calculate HRA, DA and Total pay and print them out. Write another class with a main method. Create objects for three different employees and calculate the HRA, DA and total pay.

public class Employee {
    private String empCode;
    private String name;
    private String designation;
    private double basicPay;

    public Employee(String empCode, String name, String designation, double basicPay) {
        this.empCode = empCode;
        this.name = name;
        this.designation = designation;
        this.basicPay = basicPay;
    }

    public double calculateHRA() {
        return 0.10 * basicPay; // HRA is 10% of basic pay
    }

    public double calculateDA() {
        return 0.45 * basicPay; // DA is 45% of basic pay
    }

    public double calculateTotalPay() {
        return basicPay + calculateHRA() + calculateDA();
    }

    public void displayDetails() {
        System.out.println("Employee Code: " + empCode);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Total Pay: " + calculateTotalPay());
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("E001", "Alice", "Manager", 50000);
        Employee emp2 = new Employee("E002", "Bob", "Developer", 40000);
        Employee emp3 = new Employee("E003", "Charlie", "Designer", 30000);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
