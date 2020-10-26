package com.clough.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clough.springbootpostgresql.model.TimeType;
import com.clough.springbootpostgresql.repository.TimeTypeRepository;

@Service
public class TimeTypeService {


		@Autowired
		private TimeTypeRepository TimeTypeRepository;
		
		private boolean existsById(Long id) {
			return TimeTypeRepository.existsById(id);
		}
	public List<TimeType> findAll(){
		List<TimeType> timetype = TimeTypeRepository.findAll();
		return timetype;
	}
	}