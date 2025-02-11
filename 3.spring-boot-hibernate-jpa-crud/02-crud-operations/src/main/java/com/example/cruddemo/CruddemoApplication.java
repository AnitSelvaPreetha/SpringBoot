package com.example.cruddemo;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.SocketOption;
import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
	{
		return runner ->
		{
			//createStudent(studentDAO);

			createMultipleStudents(studentDAO);

//			readStudent(studentDAO);

//			queryForStudents(studentDAO);

//			queryForStudentsByLastName(studentDAO);

//			updateStudent(studentDAO);

//			deleteStudent(studentDAO);

//			deleteAllStudents(studentDAO);



		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {

		System.out.println("Deleting All students");
		int numRowsDeleted=studentDAO.deleteAll();
		System.out.println("Deleted row count:" + numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {

		int studentId=1;
		System.out.println("Deleting student id:"+ studentId);

		studentDAO.delete(studentId);

	}

	private void updateStudent(StudentDAO studentDAO) {

		// return student based on the id:primary key

		int studentId=1;
		System.out.println("Getting student with Id:" + studentId);
		Student myStudent=studentDAO.findById(studentId);

		//change first name to"Scooby"
		System.out.println("Updating the Student.....");
		myStudent.setFirstName("Paul");


		//Update the Student

		studentDAO.update(myStudent);

		//display the updated student
		System.out.println("updated student:"+myStudent);

	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {

		// get a loist of students
		List<Student> theStudents=studentDAO.findByLastName("Duk");


		//display the list of students
		for(Student tempStudent:theStudents)
		{
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		// get a list of students

		List<Student> theStudents=studentDAO.findAll();

		//display the list

		for(Student tempStudent: theStudents)
		{
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO)
	{
		// create a student obj
		System.out.println("creating new student-----");
		Student tempStudent= new Student("Daffy","Duk","daffy@gmail.com");


		// save the student
		System.out.println("Saving the student......");
		studentDAO.save(tempStudent);

		//display id of saved student
		int theId= tempStudent.getId();
		System.out.println("Saved student.Generated id:"+ theId);

		//retrieve student based on the id:primary key

		System.out.println("retrieveing Student with id:"+ theId);
		Student myStudent=studentDAO.findById(theId);

		//display student

		System.out.println("Displayi ng Student:"+ myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		//create multiple students
		System.out.println("Creating 3 student object");
		Student tempStudent1=new Student("John","Doe","John@gmail.com");
		Student tempStudent2=new Student("Mary","Stella","Mary@gmail.com");
		Student tempStudent3=new Student("Celine","Mary","Celine@gmail.com");
		//save students

		System.out.println("Saving the students......");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void createStudent(StudentDAO studentDAO) {

		// create student obj
		System.out.println("Creating new student object");
		Student tempStudent=new Student("Paul","Doe","paul@gmail.com");
		//save the student obj

		System.out.println("Saving the student");
		studentDAO.save(tempStudent);

		//display id of the saved student

		System.out.println("Saved student.Generated id: " + tempStudent.getId());
	}
}






