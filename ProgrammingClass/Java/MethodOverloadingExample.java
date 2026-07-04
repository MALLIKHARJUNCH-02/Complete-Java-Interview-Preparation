class SalaryCalculator {

    void calculateSalary(double basicSalary) {
        System.out.println("Salary : " + basicSalary);
    }

    void calculateSalary(double basicSalary, double bonus) {
        System.out.println("Salary : " + (basicSalary + bonus));
    }

    void calculateSalary(double basicSalary, double bonus, double incentive) {
        System.out.println("Salary : " + (basicSalary + bonus + incentive));
    }
}

public class MethodOverloadingExample {

    public static void main(String[] args) {

        SalaryCalculator sc = new SalaryCalculator();

        sc.calculateSalary(50000);

        sc.calculateSalary(50000, 5000);

        sc.calculateSalary(50000, 5000, 3000);
    }
}