package project3.db4;

public class Employee {
    private int hourlyWage;
    private String name;

    public Employee() {}

    public Employee(String name, int hourlyWage) {
        if (hourlyWage <= 0.0) {
            throw new IllegalArgumentException("Width must be greater than 0.0");
        }

        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name cannot be blank");
        }

        this.name = name;
        this.hourlyWage = hourlyWage;

    }

    public int getHourlyWage() { return this.hourlyWage; }
    public String getName() { return this.name; }

    public void setHourlyWage(int hourlyWage) {
        if (hourlyWage > 0.0) {
            this.hourlyWage = hourlyWage;
        }
        else {
            throw new IllegalArgumentException("Hourly Wage must be greater than 0");
        }
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Name cannot be blank");
        }
    }

    public String toString() {
        return "Employee Details:"
                + "\nHourly Wage: " + this.getHourlyWage()
                + "\nName: " + this.getName();
    }
}
