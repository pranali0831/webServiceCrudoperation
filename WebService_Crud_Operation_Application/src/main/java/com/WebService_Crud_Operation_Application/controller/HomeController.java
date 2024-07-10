package com.WebService_Crud_Operation_Application.controller;

import java.util.List;

import org.hibernate.dialect.MySQL8Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.WebService_Crud_Operation_Application.model.Student;
import com.WebService_Crud_Operation_Application.servicei.StudentServiceI;

@RestController
public class HomeController {
	
	
	@Autowired
	StudentServiceI ssi;
	@PostMapping("/savedata")
	public String saveStu(@RequestBody Student s)
	{
		
//		Student s1=new Student();
//		   s.setRollno(1);               
//		   s.setName("xyz");
//		   s.setUsername("xy123");
//		   s.setPassword("12345");
		   ssi.saveStu(s);
		return "data save";
		
	}
	
	@GetMapping("/getAllData")
	public List<Student> getStudent(@RequestBody Student s)
	{
		List<Student>list=ssi.getStu(s);
		return  list;
		
	}
   
	 @PutMapping("/putSingleData/{rollno}")                                        ///put method use for update maximum data
	 public String putStudent(@RequestBody Student s,@PathVariable int rollno)
	 {
		 System.out.println(s.getRollno());
	     ssi.putStudent(s);
		return "data updated";
		 
	 }
	 
	 @PatchMapping("/patchSingleData/{rollno}")                                        ///put method use for update maximum data
	 public String patchStudent(@RequestBody Student s,@PathVariable int rollno)
	 {
		 System.out.println(s.getRollno());
	     ssi.patchStudent(s);
		return "data updated";
		 
	 }
	 
	 @DeleteMapping("/deleteByRollno/{rollno}")
	 public String deleteStudent(@RequestBody Student s,@PathVariable int rollno)
	 {
		System.out.println(s.getRollno());
		   ssi.deleteStudent(rollno);
		return "delete data";
		 
	 }
}
