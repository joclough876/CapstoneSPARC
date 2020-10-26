package com.clough.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.clough.springbootpostgresql.model.Pcust_impact;

@Repository
public interface PCust_ImpactRepository extends JpaRepository<Pcust_impact, Long>{

}
