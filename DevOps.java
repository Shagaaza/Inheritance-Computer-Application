public class DevOps extends Employee {
    private String tools;

    public DevOps(String employeeId, String fullName, String department, double monthlySalary, String tools) {
        super(employeeId, fullName, department, monthlySalary);
        this.tools = tools;
    }

    @Override
    public void work() {
        System.out.println(getFullName() + " automates deployment and manages infrastructure.");
    }

    public void manageDeployment() {
        System.out.println(getFullName() + " uses " + tools + " for deployment.");
    }
}
