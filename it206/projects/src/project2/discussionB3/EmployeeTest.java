package project2.discussionB3;

import javax.swing.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee2 = new Employee("Joe", "Dundy", 1000);
        Employee employee3 = new Employee("Peter", "Pan", 2000);
        Employee employee4 = new Employee("Little", "Mermaid", 5000);
        Employee employee5 = new Employee("Little");
        System.out.println(employee5.getLastName());
        System.out.println(Employee.getNumberOfEmployees());
        System.out.println(Employee.getLastAssignedEmployeeID());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());

    }
}
