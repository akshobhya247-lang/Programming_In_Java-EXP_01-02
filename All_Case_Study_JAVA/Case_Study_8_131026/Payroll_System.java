class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary + (baseSalary * 0.05);
    }
}

class Manager extends Employee {
    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + 2000;
    }
}

class Executive extends Manager {
    Executive(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + (baseSalary * 0.10);
    }
}

public class Payroll_System {
    public static void main(String[] args) {
        Employee e = new Employee("Alice", 10000);
        Manager m = new Manager("Bob", 10000);
        Employee ex = new Executive("Charlie", 10000);

        System.out.printf("Employee Salary: %.2f%n", e.calculateSalary());
        System.out.printf("Manager Salary: %.2f%n", m.calculateSalary());
        System.out.printf("Executive Salary: %.2f%n", ex.calculateSalary());
    }
}
