package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.School;
import com.example.demo.service.SchoolService;

@RestController
public class SchoolController {
	
	@Autowired
	private SchoolService ss;
	
	@GetMapping("add")
	public List<School> displaySchool(){
		return ss.display();
	}
	
	@PostMapping("add")
	public void addSchool(School s) {
		ss.add(s);
	}
	
	
}
