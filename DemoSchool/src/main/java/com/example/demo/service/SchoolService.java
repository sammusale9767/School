package com.example.demo.service;

import java.util.List;

import com.example.demo.model.School;

public interface SchoolService {
	
	void add(School s);
	List<School> display();
}
