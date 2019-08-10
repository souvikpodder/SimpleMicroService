package com.souvy.crud.ms.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepo extends JpaRepository<Employee, String>{

}
