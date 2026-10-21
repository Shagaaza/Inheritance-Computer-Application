public class DBA extends Employee {
    private String databasePlatform;

    public DBA(String employeeId, String fullName, String department, double monthlySalary, String databasePlatform) {
        super(employeeId, fullName, department, monthlySalary);
        this.databasePlatform = databasePlatform;
    }

    @Override
    public void work() {
        System.out.println(getFullName() + " maintains databases, backups, and access.");
    }

    public void manageDatabase() {
        System.out.println(getFullName() + " is managing the " + databasePlatform + " database platform.");
    }
}
