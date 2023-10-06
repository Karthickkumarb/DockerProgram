package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.PatientRepo;

@Service
public class PatientService {
	
	
	@Autowired
	private PatientRepo ptrep;
	
	public void add(Student stu) {
		ptrep.save(stu);
	}
	
	public Iterable<Student> show(Student stu) {
		return ptrep.findAll();
	}

}
