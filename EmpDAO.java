package com.ruksana.app.repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ruksana.app.model.EmpData;
import com.ruksana.app.model.Employee;

@Repository
public class EmpDAO {
	
	     @Autowired
	     private JdbcTemplate template;
	
	private static final String sql="select * from users";
	private static final String sql1="select * from employeeDdata where empID=?";
	
	public List<Employee> isData(){
		
		List<Employee> emp = new ArrayList<Employee>();
		List<Map<String, Object>>	rows=template.queryForList(sql);
		
		for(Map<String, Object> row :rows) {
			Employee employee= new Employee();
			
			employee.setEmpID((String)row.get("EmpID"));
			employee.setEmpName((String)row.get("EmpName"));
			employee.setGender((String)row.get("gender"));
			employee.setSalary((String)row.get("salary"));
			
			emp.add(employee);
		}
		
		
		 
		 return emp;
		
	}
	

	public List<EmpData> getEmpDataByID(String empID) {
		//return template.queryForObject(sql1,new Object[] {empID}, new EmpDataRowMapper());
		//The above line and the below code does the same work,the above line is having seperate implementation 
		//of RowMapper where as below code uses java 8 feature of lambda expression.
	
		//template.query(sql1,new Object[] {empID}, )
		return template.query(sql1,new Object[] {empID}, (rs,rowNm)->
		new EmpData(
				rs.getString("empID"),
				rs.getString("fullname"),
				rs.getString("age"),
				rs.getString("city"),
				rs.getString("designation"),
				rs.getString("rating")
				
				));
		
		
	}
		
	
	/*
	 * public EmpData getEmpDataByID(String empID) {
	 * 
	 * // String query = "select name from employee where emp_id=?"; Object[] inputs
	 * = new Object[] {empID}; Object empName =
	 * (Object)template.queryForObject(sql1, inputs, String.class); return
	 * empName.toString(); }
	 */
}
	
	
	

	
		
		
	
		

	
	
	
	


	



