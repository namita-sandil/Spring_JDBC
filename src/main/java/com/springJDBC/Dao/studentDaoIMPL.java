package com.springJDBC.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.Spring_JDBC.Entities.Student;

public class studentDaoIMPL implements studentDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
// insert into database
	@Override
	public int insertstudent(Student student) {
		String query = "insert into student(id , name , age , city) values(?,?,?,?)";
		int result =this.jdbcTemplate.update(query ,student.getId() , student.getName() , student.getAge() ,student.getCity());
		return result;
	}
//update in database
	@Override
	public int changeStudent(Student student) {
		String query= "update student set name=? , age= ? , city = ? where id= 104";
		int result = jdbcTemplate.update(query , student.getName() , student.getAge() , student.getCity());
		return result;
	}

//delete from database
	@Override
	public int deleteStudent(String id) {
		
		String query = "delete from student where id=?";
		int result = jdbcTemplate.update(query ,id );
		return result;
	}

	
//select one student from database
	@Override
	public Student getStudent(int id) {
		org.springframework.jdbc.core.RowMapper<Student> rowMapper = new RowMapper();
		String query = "select * from student where id=?";
		Student student = jdbcTemplate.queryForObject(query, rowMapper ,id );
		return student;
	}

	@Override
	public List<Student> getStudents() {
		org.springframework.jdbc.core.RowMapper<Student> rowmapper = new RowMapper();
		String query = "select * from student";
		List<Student> li =jdbcTemplate.query(query, rowmapper);
		return li;
	}
	
	
	
	

}
