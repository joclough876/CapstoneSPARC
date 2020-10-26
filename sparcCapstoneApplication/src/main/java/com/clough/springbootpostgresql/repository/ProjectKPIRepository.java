package com.clough.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.clough.springbootpostgresql.model.Projectkpi;

@Repository
public interface ProjectKPIRepository extends JpaRepository<Projectkpi, Long>{

}
