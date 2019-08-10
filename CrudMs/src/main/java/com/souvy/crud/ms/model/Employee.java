package com.souvy.crud.ms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Component
@Entity
public class Employee {
	private String name;
	private String position;
	@Id
	private String empCode;
	private String mobileNo;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", empCode=" + empCode + ", mobileNo=" + mobileNo
				+ "]";
	}
	public Employee() {
		super();
	}
	public Employee(String name, String position, String empCode, String mobileNo) {
		super();
		this.name = name;
		this.position = position;
		this.empCode = empCode;
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
}
