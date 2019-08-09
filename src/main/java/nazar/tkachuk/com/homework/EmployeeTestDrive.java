package nazar.tkachuk.com.homework;

import java.util.*;

public class EmployeeTestDrive {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

//        for (int i = 0; i < 3; i++) {

//            System.out.println("Enter the name of employee");
//            String name = new Scanner(System.in).nextLine();
//            System.out.println("Enter the department of employee");
//            String department = new Scanner(System.in).nextLine();
//            System.out.println("Enter the salary of employee");
//            int salary = new Scanner(System.in).nextInt();
//
//            Employee employee = new Employee(name, department, salary);
//            employeeList.add(employee);
//        }
        employeeList.add(new Employee("a", "hr", 2));
        employeeList.add(new Employee("b", "io", 5));
        employeeList.add(new Employee("c", "ii", 3));
        employeeList.add(new Employee("d", "it", 3));
        employeeList.add(new Employee("d", "it", 3));

        System.out.println("Unsorted list\n");
        employeeList.forEach(System.out::println);

        Collections.sort(employeeList);

        System.out.println("\nSorted list\n");
        employeeList.forEach(System.out::println);

        System.out.println("");

        for (int i = 0; i < employeeList.size(); i++) {
            for (int j = i + 1; j < employeeList.size(); j++) {

                if (Objects.equals(employeeList.get(i).getSalary(), employeeList.get(j).getSalary())) {
                    System.out.println("Employee with the same salary: " + employeeList.get(i) + " = " + employeeList.get(j));
                }
                if (employeeList.get(i).equals(employeeList.get(j))) {
                    System.out.println("\nSame employees: " + employeeList.get(i) + " = " + employeeList.get(j));
                }
            }
        }
        for (int i = 0; i < employeeList.size(); i++) {

            if (i == 0) {
                System.out.println("\nThe Minimal salary has: " + employeeList.get(0) + "\n");
            }
            if ((i == employeeList.size() - 1)) {
                System.out.println("The Maximal salary has: " + employeeList.get(employeeList.size() - 1) + "\n");
            }
        }
        employeeList.sort(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()));
        System.out.println("Sorted list in reverse way\n");
        employeeList.forEach(System.out::println);
    }
}

