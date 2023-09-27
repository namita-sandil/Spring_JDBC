package com.springJDBC.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.springJDBC.Spring_JDBC.Entities.Student;

public class RowMapper implements org.springframework.jdbc.core.RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setAge(rs.getString(3));
		student.setCity(rs.getString(4));
		
		return student;
	}

	

}
