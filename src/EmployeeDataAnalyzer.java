import java.util.List;

public class EmployeeDataAnalyzer {
    public static void main(String[] args){
        EmployeeManager employeeManager = new EmployeeManager();

        employeeManager.addEmployee(new Employee(1,"Aman", "Computer Application", 80000.0));
        employeeManager.addEmployee(new Employee(2,"Abhishek", "fiance", 30000.0));
        employeeManager.addEmployee(new Employee(3,"Himanshu", "Electrical", 70000.0));
        employeeManager.addEmployee(new Employee(4,"Sahil", "It", 40000.0));
        employeeManager.addEmployee(new Employee(5,"Yash", "Sales", 75000.0));

        Thread processor1 = new EmployeeProcessor(employeeManager, 1);
        Thread processor2 = new EmployeeProcessor(employeeManager, 2);
        Thread processor3 = new EmployeeProcessor(employeeManager, 6);

        processor1.start();
        processor2.start();
        processor3.start();

        try {
            processor1.join();
            processor2.join();
            processor3.join();
        } catch (InterruptedException e){
            System.out.println("Error waiting for thread completion: "+ e.getMessage());
        }

        System.out.println("\nEmployee with salary >= 60000:");
        List<Employee> highEarners = employeeManager.sortEmployeesBySalary();
        highEarners.forEach(System.out::println);

        System.out.println("\nEmployees sorted by salary:");
        List<Employee> sortedEmployees = employeeManager.sortEmployeesBySalary();
        sortedEmployees.forEach(System.out::println);
    }
}
