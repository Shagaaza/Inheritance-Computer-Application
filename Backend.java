public class Backend extends Employee {
    private String programmingLanguage;

    public Backend(String employeeId, String fullName, String department, double monthlySalary, String programmingLanguage) {
        super(employeeId, fullName, department, monthlySalary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getFullName() + " builds server-side logic and APIs.");
    }

    public void developAPI() {
        System.out.println(getFullName() + " is developing APIs using " + programmingLanguage + ".");
    }
}
