package com.clough.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.clough.springbootpostgresql.model.Projects;
import com.clough.springbootpostgresql.model.Time;
import com.clough.springbootpostgresql.repository.TimeRepository;

@Service
public class TimeService {

	@Autowired
	private TimeRepository timeRepository;
	
	private boolean existsById(Long timeid) {
		return timeRepository.existsById(timeid);
	}
public List<Time> findAll(){
	List<Time> time = timeRepository.findAll();
	return time;
}

public Time findById(Long timeid) throws Exception {

    Time time = timeRepository.findById(timeid).orElse(null);

    if(time == null) {

                throw new Exception("Cannot find project with id: " + timeid);

    }

    else

                return time;

}

public Time save(Time time) throws Exception {
	if(!StringUtils.isEmpty(time.getTimespent())) {
		if(time.getTimeid() != null && existsById(time.getTimeid())) {
			throw new Exception("Time with id: " + time.getTimeid() +
					" already exists");
		}
		return timeRepository.save(time);
	} else {
		Exception e = new Exception("Failed to save time");
		throw e; 
	}
}


public void update(Time time) throws Exception {
	if(!StringUtils.isEmpty(time.getTimespent())) {
		if(!existsById(time.getTimeid())) {
			throw new Exception("Cannot find Time with id: " + time.getTimeid());
		}
		
		timeRepository.save(time);
		
	} else {
		Exception e = new Exception("Failed to save time");
		throw e;
	}
}

public void deleteById(Long timeid) throws Exception {
	if(!existsById(timeid)) {
		throw new Exception("Cannot find time with id: " + timeid);
	} else {
		timeRepository.deleteById(timeid);
	}
	}
}