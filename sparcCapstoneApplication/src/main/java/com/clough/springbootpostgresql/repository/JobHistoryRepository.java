package com.clough.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.clough.springbootpostgresql.model.Jobhistory;

@Repository
public interface JobHistoryRepository extends JpaRepository<Jobhistory, Long>{

}