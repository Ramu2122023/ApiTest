package com.emp.bean;

import java.util.Arrays;

import jakarta.ws.rs.FormParam;

public class Employee {
	
	@FormParam("employeeID")
	private String employeeID;
	@FormParam("firstName")
	private String firstName;
	@FormParam("lastName") 
	private String lastName;
	@FormParam("email")
	private String email;
	@FormParam("phoneNumber")
	private String[] phoneNumber;
	@FormParam("doj")
	private String doj;
	@FormParam("salary")
	private String salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + Arrays.toString(phoneNumber) + ", doj=" + doj + ", salary=" + salary + "]";
	}

}
