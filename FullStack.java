public class FullStack extends Employee {
    private String technologies;

    public FullStack(String employeeId, String fullName, String department, double monthlySalary, String technologies) {
        super(employeeId, fullName, department, monthlySalary);
        this.technologies = technologies;
    }

    @Override
    public void work() {
        System.out.println(getFullName() + " develops both frontend and backend.");
    }

    public void developApplication() {
        System.out.println(getFullName() + " is developing an application using " + technologies + ".");
    }
}
