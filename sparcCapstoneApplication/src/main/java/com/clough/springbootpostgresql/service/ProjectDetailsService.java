package com.clough.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clough.springbootpostgresql.model.ProjectDetails;
import com.clough.springbootpostgresql.repository.ProjectDetailsRepository;

@Service
public class ProjectDetailsService {

		@Autowired
		private ProjectDetailsRepository projectdetailsRepository;
		
		private boolean existsById(Long id) {
			return projectdetailsRepository.existsById(id);
		}
	public List<ProjectDetails> findAll(){
		List<ProjectDetails> projectdetails = projectdetailsRepository.findAll();
		return projectdetails;
	}
	}