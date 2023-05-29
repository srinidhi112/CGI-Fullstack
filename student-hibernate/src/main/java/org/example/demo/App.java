package org.example.demo;

import java.util.Date;
import java.util.Scanner;

import org.example.demo.config.StudentHibernateConfig;
import org.example.demo.model.Student;
import org.example.demo.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner scanner=new Scanner(System.in);
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(StudentHibernateConfig.class);
    	StudentService studentService = context.getBean("studentService", StudentService.class);
    	System.out.println("Pick an option") ;
    	System.out.println("1: Add a Student");
    	System.out.println("2: Display all the Students");
    	System.out.println("3: Find a Student by ID");
    	System.out.println("4: Find a Student by Name");
    	System.out.println("5: Update Student by ID");
    	System.out.println("6: Update Student by Name");
    	System.out.println("7: Find Student by Date");
    	System.out.println("8: Delete Student by ID");
    	System.out.println("9: Delete All Students");
    	Integer option = scanner.nextInt();
    	switch(option) {
    	case 1: 
    		add_student(studentService);
    		break;
    	case 2: 
    		displayStudents(studentService);
    		break;
    	case 3:
    		findStudentbyId(studentService);
    		break;
    	case 4:
    		findStudentByName(studentService);
    		break;
    	case 5:
    		updateStudentById(studentService);
    		break;
    	case 6:
    		updateStudentByName(studentService);
    		break;
    	case 7:
    		findStudentByDate(studentService);
    		break;
    	case 8:
    		deleteStudentById(studentService);
    		break;
    	case 9:
    		deleteAllStudent(studentService);
    		break;
    		
    	}
       
    }
    
    public static void add_student(StudentService studentService) {
    	System.out.println("Enter a name") ;
    	String name = scanner.next();
    	Date date = new Date();
    	System.out.println("Enter Nationality") ;
    	String nationality = scanner.next();
    	System.out.println("enter code") ;
    	String code = scanner.next();
    	
    	Student student = new Student(name, nationality, code, date);
    	studentService.addStudent(student);
    }
    
    public static void displayStudents(StudentService studentService) {
    	studentService.displayAllStudent();
    }
    
    public static void findStudentbyId(StudentService studentService) {
    	System.out.println("Enter Student by ID") ;
    	Integer id = scanner.nextInt();
    	studentService.findStudentById(id);
    }
    
    public static void findStudentByName(StudentService studentService) {
    	System.out.println("Enter a Name") ;
    	String name = scanner.next();
    	studentService.findStudentByName(name);
    }
    
    public static void updateStudentById(StudentService studentService) {
    	System.out.println("Enter Student by ID") ;
    	Integer id = scanner.nextInt();
    	System.out.println("enter name") ;
    	String name = scanner.next();
    	Date date = new Date();
    	System.out.println("Enter Nationality") ;
    	String nationality = scanner.next();
    	System.out.println("enter code") ;
    	String code = scanner.next();
    	Student student = new Student(name, nationality, code, date);
    	studentService.updateStudentById(id, student);
    }
    public static void updateStudentByName(StudentService studentService) {
    	System.out.println("Enter previous name") ;
    	String oldName = scanner.next();
    	System.out.println("enter name") ;
    	String name = scanner.next();
    	Date date = new Date();
    	System.out.println("Enter Nationality") ;
    	String nationality = scanner.next();
    	System.out.println("Enter code") ;
    	String code = scanner.next();
    	Student student = new Student(name, nationality, code, date);
    	studentService.updateStudentByName(oldName, student);
    }
    
    public static void findStudentByDate(StudentService studentService) {
    	System.out.println("Enter Date (please enter without any slash or dash and in ddmmyyyy format") ;
    	String date = scanner.next();
    	studentService.findStudentByDate(date);
    }
    
    public static void deleteStudentById(StudentService studentService) {
    	System.out.println("Enter ID") ;
    	Integer id = scanner.nextInt();
    	studentService.deleteById(id);
    }
    
    public static void deleteAllStudent(StudentService studentService) {
    	studentService.deleteAll();
    }
               
}
