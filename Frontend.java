public class Frontend extends Employee {
    private String framework;

    public Frontend(String employeeId, String fullName, String department, double monthlySalary, String framework) {
        super(employeeId, fullName, department, monthlySalary);
        this.framework = framework;
    }

    @Override
    public void work() {
        System.out.println(getFullName() + " develops user interfaces.");
    }

    public void buildInterface() {
        System.out.println(getFullName() + " is building a user interface with " + framework + ".");
    }
}
