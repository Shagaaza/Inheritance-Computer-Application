public class Main {
    public static void main(String[] args) {
        FullStack fullStack = new FullStack("EMP101", "Ahmed Hassan", "Software Development", 1800.0, "JavaScript and Java");
        Frontend frontend = new Frontend("EMP102", "Amina Ali", "Frontend Development", 1400.0, "React");
        Backend backend = new Backend("EMP103", "Mohamed Omar", "Backend Development", 1600.0, "Java");
        DBA dba = new DBA("EMP104", "Fatima Yusuf", "Database Administration", 1500.0, "MySQL");
        DevOps devOps = new DevOps("EMP105", "Hassan Abdi", "Infrastructure", 1700.0, "Docker and Jenkins");

        System.out.println("===== EMPLOYEE INFORMATION =====");
        fullStack.displayInfo();
        fullStack.work();
        fullStack.developApplication();
        System.out.println("Annual Salary: " + fullStack.calculateAnnualSalary());
        System.out.println();

        frontend.displayInfo();
        frontend.work();
        frontend.buildInterface();
        System.out.println("Annual Salary: " + frontend.calculateAnnualSalary());
        System.out.println();

        backend.displayInfo();
        backend.work();
        backend.developAPI();
        System.out.println("Annual Salary: " + backend.calculateAnnualSalary());
        System.out.println();

        dba.displayInfo();
        dba.work();
        dba.manageDatabase();
        System.out.println("Annual Salary: " + dba.calculateAnnualSalary());
        System.out.println();

        devOps.displayInfo();
        devOps.work();
        devOps.manageDeployment();
        System.out.println("Annual Salary: " + devOps.calculateAnnualSalary());

        Employee[] employees = {fullStack, frontend, backend, dba, devOps};
        System.out.println("\n===== POLYMORPHISM: EMPLOYEE WORK =====");
        for (Employee employee : employees) {
            employee.work();
        }
    }
}
