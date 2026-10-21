public class Employee {
    private String employeeId;
    private String fullName;
    private String department;
    private double monthlySalary;

    public Employee(String employeeId, String fullName, String department, double monthlySalary) {
        if (monthlySalary < 0) {
            throw new IllegalArgumentException("Monthly salary cannot be negative.");
        }
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.department = department;
        this.monthlySalary = monthlySalary;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Full Name: " + fullName);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: " + monthlySalary);
    }

    public void work() {
        System.out.println(fullName + " is working.");
    }

    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    public String getFullName() {
        return fullName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}
