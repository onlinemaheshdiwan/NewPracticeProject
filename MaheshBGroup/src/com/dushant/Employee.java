package com.dushant;

public class Employee {

	private Integer empId;
	private String empName;
	private Long empMobile;
	
	//Getters and Setters 
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Long getEmpMobile() {
		return empMobile;
	}
	public void setEmpMobile(Long empMobile) {
		this.empMobile = empMobile;
	}
	//parameterized constructor 
	public Employee(Integer empId, String empName, Long empMobile) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMobile = empMobile;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empMobile=" + empMobile + "]";
	}
	
	
	
}
