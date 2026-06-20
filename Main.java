//*Employee and Manager
// Input
// Sagar 50000 IT
// Output Name: Sagar Salary: 50000 Department: IT */

import java.util.Scanner;

class Employee {
    String name;
    double salary;

    void getEmployeeDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void getManagerDetails(String department) {
        this.department = department;
    }

    void displayManager() {
        display();
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double salary = sc.nextDouble();
        sc.nextLine(); // consume newline
        String department = sc.nextLine();

        Manager m = new Manager();

        m.getEmployeeDetails(name, salary);
        m.getManagerDetails(department);

        m.displayManager();

        sc.close();
    }
}