package com.springJDBC.Spring_JDBC.Entities;

public class Student {
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	int id;
	String name;
	String age;
	String city;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	public Student(int id, String name, String age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String i) {
		this.age = i;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
