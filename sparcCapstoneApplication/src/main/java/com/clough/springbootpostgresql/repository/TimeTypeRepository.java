package com.clough.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.clough.springbootpostgresql.model.TimeType;

@Repository
public interface TimeTypeRepository extends JpaRepository<TimeType, Long>{

}