package com.clough.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clough.springbootpostgresql.model.Pcust_impact;
import com.clough.springbootpostgresql.repository.PCust_ImpactRepository;

@Service
public class PCust_ImpactService {

		
		@Autowired
		private PCust_ImpactRepository pcust_impactRepository;
		
		private boolean existsById(Long id) {
			return pcust_impactRepository.existsById(id);
		}
	public List<Pcust_impact> findAll(){
		List<Pcust_impact> pcust_impact = pcust_impactRepository.findAll();
		return pcust_impact;
	}
	}
