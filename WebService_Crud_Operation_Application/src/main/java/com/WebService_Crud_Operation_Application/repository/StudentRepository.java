package com.WebService_Crud_Operation_Application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.WebService_Crud_Operation_Application.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{

	Student findByRollno(int rollno);

	String deleteByRollno(int rollno);
	
	

}
