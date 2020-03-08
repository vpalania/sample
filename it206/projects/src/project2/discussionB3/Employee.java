package project2.discussionB3;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private String employeeID;
    private static int numberOfEmployees = 1;
    public static final double MIN_EMPLOYEE_SALARY = 0.0;
    private static String lastAssignedEmployeeID = "0001";

    public Employee() {
        ++numberOfEmployees;
        assignEmployeeID();
    }

    public Employee(String firstName, String lastName, double salary) {
        this();
        if (salary <= MIN_EMPLOYEE_SALARY) {
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
        else {
            this.salary = salary;
        }
        if (firstName == null || firstName.equals("")) {
            throw new IllegalArgumentException("First Name must be entered");
        }
        else {
            this.firstName = firstName;
        }
        if (lastName == null || lastName.equals("")) {
            throw new IllegalArgumentException("Last Name must be entered");
        }
        else {
            this.lastName = lastName;
        }
    }

    public Employee(String firstName) {
        this();
        if (firstName == null || firstName.equals("")) {
            throw new IllegalArgumentException("First Name must be entered");
        }
        else {
            this.firstName = firstName;
        }
    }

    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public double getSalary() { return this.salary; }
    public String getEmployeeID() { return this.employeeID; }
    public static int getNumberOfEmployees() { return numberOfEmployees; }
    public static String getLastAssignedEmployeeID() { return lastAssignedEmployeeID; }


    public void setSalary(int salary) {
        if (validateSalary(salary)) {
            this.salary = salary;
        }
        else {
            throw new IllegalArgumentException(
                    "Salary must be greater than " + MIN_EMPLOYEE_SALARY
            );
        }
    }

    public void setFirstName(String firstName) {
        if (validateName(firstName)) {
            this.firstName = firstName;
        }
        else {
            throw new IllegalArgumentException(
                    "First Name must be a valid string value"
            );
        }
    }

    public void setLastName(String lastName) {
        if (validateName(lastName)) {
            this.lastName = lastName;
        }
        else {
            throw new IllegalArgumentException(
                    "Last Name must be a valid string value"
            );
        }
    }

    private void assignEmployeeID() {
        int length = String.valueOf(numberOfEmployees).length();
        if (length >= 4)
            this.setEmployeeID(String.valueOf(numberOfEmployees));
        else {
            if (length == 1)
                this.setEmployeeID("000" + String.valueOf(numberOfEmployees));
            else if (length == 2)
                this.setEmployeeID("00" + String.valueOf(numberOfEmployees));
            else
                this.setEmployeeID("0" + String.valueOf(numberOfEmployees));

        }
    }

    public void setEmployeeID(String employeeID) {
       this.employeeID = employeeID;
       this.lastAssignedEmployeeID = employeeID;
    }

    private boolean validateName(String name) {
        return (firstName != null && !firstName.equals(""));
    }

    private boolean validateSalary(double salary) {
        return (salary > 0);
    }

    public String toString() {
        return "Employee Information: " + "\n Employee Name: " + this.getFirstName() + " " + this.getLastName() +
                " Employee ID: " + this.getEmployeeID() + " Employee Salary: " + this.getSalary();
    }
}
