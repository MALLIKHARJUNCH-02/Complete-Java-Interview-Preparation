class Employee {

    void calculateSalary() {
        System.out.println("Employee Salary Calculation");
    }
}

class SoftwareDeveloper extends Employee {
    void calculateSalary() {
        System.out.println("Software Developer Salary = ₹70,000");
    }
}

class Tester extends Employee {
    void calculateSalary() {
        System.out.println("Tester Salary = ₹55,000");
    }
}

public class MethodOverridingExample {

    public static void main(String[] args) {

        SoftwareDeveloper developer = new SoftwareDeveloper();
        developer.calculateSalary();

        Tester tester = new Tester();
        tester.calculateSalary();
    }
}