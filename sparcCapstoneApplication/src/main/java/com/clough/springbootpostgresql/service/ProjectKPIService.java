package com.clough.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clough.springbootpostgresql.model.Projectkpi;
import com.clough.springbootpostgresql.repository.ProjectKPIRepository;

@Service
public class ProjectKPIService {


		@Autowired
		private ProjectKPIRepository projectkpiRepository;
		
		private boolean existsById(Long id) {
			return projectkpiRepository.existsById(id);
		}
	public List<Projectkpi> findAll(){
		List<Projectkpi> projectkpi = projectkpiRepository.findAll();
		return projectkpi;
	}
	}
