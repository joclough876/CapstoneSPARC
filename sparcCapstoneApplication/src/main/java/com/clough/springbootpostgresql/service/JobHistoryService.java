package com.clough.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clough.springbootpostgresql.model.Jobhistory;
import com.clough.springbootpostgresql.repository.JobHistoryRepository;

@Service
public class JobHistoryService {
	
	@Autowired
	private JobHistoryRepository jobHistoryRepository;
	
	private boolean existsById(Long job_history_id) {
		return jobHistoryRepository.existsById(job_history_id);
	}
public List<Jobhistory> findAll(){
	List<Jobhistory> jobhistory = jobHistoryRepository.findAll();
	return jobhistory;
}
}
/*
--jobs working
--jobhistory no error or data
--departmens working
--employees working
--time not working - null variable 
--projects not working 
*/
