package com.clough.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clough.springbootpostgresql.model.Jobs;
import com.clough.springbootpostgresql.repository.JobsRepository;

@Service
public class JobsService {
	
	@Autowired
	private JobsRepository jobsRepository;
	
	private boolean existsById(Long jobid) {
		return jobsRepository.existsById(jobid);
	}
public List<Jobs> findAll(){
	List<Jobs> jobs = jobsRepository.findAll();
	return jobs;
}
}
