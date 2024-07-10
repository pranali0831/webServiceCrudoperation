package com.WebService_Crud_Operation_Application.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebService_Crud_Operation_Application.model.Student;
import com.WebService_Crud_Operation_Application.repository.StudentRepository;
import com.WebService_Crud_Operation_Application.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	StudentRepository sr;
	@Override
	public void saveStu(Student s) {
		
		sr.save(s);
		
	}
	@Override
	public List<Student> getStu(Student s) {
		
		return (List<Student>) sr.findAll();
	}
	
	
	@Override
	public String putStudent(Student s) {
		
		 sr.save(s);
		return "data update";
		 
		
	}
	@Override
	public String patchStudent(Student s) {
	
		sr.save(s);
		return "patch method minimum data updated";
	}
	@Override
	public String deleteStudent(int rollno) {
		
		sr.deleteByRollno(rollno);
		return "delete";
	}
	
}

