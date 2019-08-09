package nazar.tkachuk.com.homework;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private String name;
    private String department;
    private Integer salary;

    public Employee(String name, String department, Integer salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getName().equals(employee.getName()) &&
                getDepartment().equals(employee.getDepartment()) &&
                getSalary().equals(employee.getSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDepartment(), getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(this.getSalary(), employee.getSalary());
    }
}

