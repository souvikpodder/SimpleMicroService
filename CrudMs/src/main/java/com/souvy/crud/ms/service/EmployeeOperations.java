package com.souvy.crud.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.souvy.crud.ms.model.Employee;
import com.souvy.crud.ms.model.EmployeeRepo;

@Component
@Service
public class EmployeeOperations {

	@Autowired
	EmployeeRepo employeeRepo;

	public ResponseEntity<String> addEmployee(Employee employee) {

		String response = null;
		System.out.println(employee);
		if (!employeeRepo.existsById(employee.getEmpCode())) {
			employeeRepo.save(employee);
			response = "success";
		} else {
			response = "fail";
		}
		return new ResponseEntity<String>(response, HttpStatus.OK);

	}

	public ResponseEntity<String> editEmployee(Employee employee) {

		String response = null;
		System.out.println(employee);
		if (employeeRepo.existsById(employee.getEmpCode())) {
			employeeRepo.save(employee);
			response = "updated";
		} else {
			response = "user does not exist";
		}
		return new ResponseEntity<String>(response, HttpStatus.OK);

	}

}
