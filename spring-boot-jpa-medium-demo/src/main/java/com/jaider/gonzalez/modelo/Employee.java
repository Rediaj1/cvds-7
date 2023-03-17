package com.jaider.gonzalez.modelo;
import jakarta.persistence.*;
@Entity
public class Employee {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String firstName;
	private String lastName;
	private String role;
	private Double salary;
    
    public Employee(String newFirstName, String newLastName, String newRole, double newSalary) {
        firstName = newFirstName;
        lastName = newLastName;
        role = newRole;
        salary = newSalary;
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
