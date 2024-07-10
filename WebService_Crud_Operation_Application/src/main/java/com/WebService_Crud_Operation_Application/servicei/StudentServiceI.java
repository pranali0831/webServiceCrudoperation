package com.WebService_Crud_Operation_Application.servicei;

import java.util.List;

import com.WebService_Crud_Operation_Application.model.Student;

public interface StudentServiceI {

	void saveStu(Student s);

	
	List<Student> getStu(Student s);


	String putStudent(Student s);

	String patchStudent(Student s);


	String deleteStudent(int rollno);
	
	

	

}

