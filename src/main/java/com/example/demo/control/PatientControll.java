package com.example.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping("/api/v1")
public class PatientControll {
	
	@Autowired
	private PatientService ptser;
	
	@GetMapping("/register")
	public void register(@RequestBody Student stu) {
		ptser.add(stu);
	}
	
	@GetMapping("/showPatients")
	public Iterable<Student> showpt( Student stu){
		return ptser.show(stu);
	}
}
