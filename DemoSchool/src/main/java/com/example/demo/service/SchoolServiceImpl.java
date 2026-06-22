package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.School;
import com.example.demo.repository.SchoolRepository;

public class SchoolServiceImpl implements SchoolService {

	@Autowired
	private SchoolRepository rs;
	@Override
	public void add(School s) {
		// TODO Auto-generated method stub
		
		rs.save(s);

	}

	@Override
	public List<School> display() {
		// TODO Auto-generated method stub
		return rs.findAll();
	}

}
