package com.jaider.gonzalez.springboot.jpamediumdemo;
import jakarta.persistence.*;
import java.util.*;
@Entity
public class Employee {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String firstName;
	private String lastName;
	private String role;
	private Double salary;
    
    public Employee() {

    }
    public Employee(String newFirstName, String newLastName, String newRole, double newSalary) {
        firstName = newFirstName;
        lastName = newLastName;
        role = newRole;
        salary = newSalary;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(role, employee.role) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, lastName, role, salary);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
    
    //getters
    public Long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public Double getSalary() {
        return salary;
    }

    //setters
    public void setEmployeeId(Long newEmployeeID) {
        employeeId = newEmployeeID;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setRole(String newRole) {
        role = newRole;
    }

    public void setSalary(Double newSalary) {
        salary = newSalary;
    }
    
}
