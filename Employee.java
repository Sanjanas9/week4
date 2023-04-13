import java.util.Scanner;

interface Employee {
    void calculateSalary();
    void displayEmployeeDetails();
}

class Manager implements Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;

    public Manager(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public void calculateSalary() {
        if (designation.equals("Manager")) {
            salary = salary + (salary * 0.2); // Add 20% bonus
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class Developer implements Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;

    public Developer(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public void calculateSalary() {
        if (designation.equals("Developer")) {
            salary = salary + (salary * 0.1); 
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class Tester implements Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;

    public Tester(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public void calculateSalary() {
        if (designation.equals("Tester")) {
            salary = salary + (salary * 0.15); // Add 15% bonus
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter employee designation: ");
        String designation = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        Employee employee;
        if (designation.equals("Manager")) {
            employee = new Manager(name, age, designation, salary);
        } else if (designation.equals("Developer")) {
            employee = new Developer(name, age, designation, salary);
        } else {
            employee = new Tester(name, age, designation, salary);
        }

        employee.calculateSalary();
        employee.displayEmployeeDetails();
    }
}
