package com.ruksana.app.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ruksana.app.model.EmpData;

public class EmpDataRowMapper implements RowMapper<EmpData>{

	@Override
	public EmpData mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmpData e = new EmpData();
		e.setEmpID(rs.getString("empID"));
		e.setFullname(rs.getString("fullname"));
		e.setAge(rs.getString("age"));
		e.setCity(rs.getString("city"));
		e.setDesignation(rs.getString("designation"));
		e.setRating(rs.getString("rating"));
		return e;
	}
	

}
