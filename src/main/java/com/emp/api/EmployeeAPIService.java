package com.emp.api;

import com.emp.bean.Employee;

import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/employee")
public class EmployeeAPIService {
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/register")
	public String saveEmployee(@BeanParam Employee employee) {
		return employee.toString();
	}
	

}
