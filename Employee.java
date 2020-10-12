package com.ruksana.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ruksana.app.repository.EmpDAO;

public class Employee {
	
	private String EmpID;
    private String EmpName;
    private String	gender;
    private String salary;
    
    public Employee() {
    	
    }
    
	public Employee( String empID, String empName, String gender, String salary) {
		super();
		this.EmpID = empID;
		this.EmpName = empName;
		this.gender = gender;
		this.salary = salary;
	}
	
	
	  public String getEmpID() {
		  return EmpID; 
		  }
	  public void setEmpID(String empID)
	  {
		  this.EmpID = empID; 
		  } 
	  public String getEmpName() { 
		  return EmpName; 
		  } 
	  public void setEmpName(String empName) { 
		  this.EmpName = empName; }
	 
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
    
	
	
	
}
