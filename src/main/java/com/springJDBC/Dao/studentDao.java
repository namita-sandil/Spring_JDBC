package com.springJDBC.Dao;

import java.util.List;

import com.springJDBC.Spring_JDBC.Entities.Student;

public interface studentDao {
	
	public  int insertstudent(Student student); // insert into query
	
	public int changeStudent(Student student); // where query
	
	public int deleteStudent(String id);
	
	public Student getStudent(int id); // returns 1 student
	
	public List<Student> getStudents();

}
