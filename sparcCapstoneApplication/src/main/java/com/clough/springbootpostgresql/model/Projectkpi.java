package com.clough.springbootpostgresql.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="projectkpi")
public class Projectkpi {

	@Id
	@GeneratedValue(generator="projectkpi_pkpi_id_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "projectkpi_pkpi_id_seq",
			sequenceName = "projectkpi_pkpi_id_seq",
			allocationSize=1
			)
	 private Long pkpi_id;
	
	@Column(name="kpi_type")
	 private Long kpi_type;
	
	
	public Long getPkpi_id() {
		return pkpi_id;
	}
	public void setPkpi_id(Long pkpi_id) {
		this.pkpi_id = pkpi_id;
	}
	public Long getKpi_type() {
		return kpi_type;
	}
	public void setKpi_type(Long kpi_type) {
		this.kpi_type = kpi_type;
	}
	public Projectkpi(Long kpi_type) {
		super();
		this.kpi_type = kpi_type;
	}
	public Projectkpi() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	
}
