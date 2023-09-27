package com.springJDBC.Spring_JDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.Dao.studentDao;
import com.springJDBC.Dao.studentDaoIMPL;
import com.springJDBC.Spring_JDBC.Entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springJDBC/Spring_JDBC/Config.xml");

        
        studentDao stu = context.getBean("studentDao" ,studentDao.class) ;
        
        Student student = new Student();
        
//To insert single student into database        
//        student.setId(104);
//        student.setName("manisha kumari");
//        student.setAge("32");
//        student.setCity("kanpur");       
//        int i =stu.insertstudent(student);
        
        
//To update/Change existing data in database        
//        student.setName("raju kumar yadav");
//        student.setAge("45");
//        student.setCity("kolhapur");      
//        int j = stu.changeStudent(student);
        
        
        
// To Delete single student in database       
//        int k =stu.deleteStudent("104");
        
        
// to fetch single student from database
//        Student student1 =stu.getStudent(102);
//        System.out.println(student1);
        
        
// to fetch all the students from database
      List<Student> students=  stu.getStudents();
      for(Student s : students)
      {
    	  System.out.println(s);
      }
      
        
     System.out.println("record inserted/updated/deleted/selected successsfully");
    }
}
