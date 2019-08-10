package com.souvy.crud.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.souvy.crud.ms.model.Employee;
import com.souvy.crud.ms.service.EmployeeOperations;




@Controller
public class MainController {
	
	@Autowired
	EmployeeOperations employeeOp;
	
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
		
		return employeeOp.addEmployee(employee);
				
	}
	@PostMapping("/edit")
	@ResponseBody
	public ResponseEntity<String> editEmployee(@RequestBody Employee employee){
		
		return employeeOp.editEmployee(employee);
				
	}
}
