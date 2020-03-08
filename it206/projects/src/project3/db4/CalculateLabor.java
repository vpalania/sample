package project3.db4;
import javax.swing.*;

public class CalculateLabor {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("Peter Jackson", 15),
                new Employee("Harry Potter", 16),
                new Employee("Tony Stark", 15),
                new Employee("Elaine Benes", 22),
                new Employee("Angelina Jolie", 30)
        };

        displayLaborCost(employees);
    }

    private static double calculateLabor(Employee[] employees) {
        double totalLaborCost = 0.0;
        for (int x = 0; x < employees.length; x++) {
            totalLaborCost += employees[x].getHourlyWage() * 40;
        }

        return totalLaborCost;
    }

    public static void displayLaborCost(Employee[] employees) {
        JOptionPane.showMessageDialog(null,
                "Weekly Labor Cost: " + String.format("$%.2f", calculateLabor(employees)));
    }
}
