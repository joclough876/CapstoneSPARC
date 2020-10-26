package com.clough.springbootpostgresql.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {

	//MEMBER VARIABLES
	@Id
	//                         table_primary key name_seq
	@GeneratedValue(generator="employees_eid_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "employees_eid_seq",
			sequenceName="employees_eid_seq",
			allocationSize=1
			)
	private Long eid;
	
	@Column(name="elast_name")
	private String elast_name;
	
	@Column(name="efirst_name")
	private String efirst_name;
	
	@Column(name="currentd_id")
	 private String currentd_id;
	
	@Column(name="job_code")
	private String job_code;
	
	@Column(name="is_manager")
	private String is_manager;
	
	@Column(name="is_sponsor")
	 private String is_sponsor;
	
	@Column(name="is_supervisor")
	private String is_supervisor;
	
	@Column(name="e_userid")
	private String e_userid;



public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

public Employees(String efirst_name, String elast_name, String currentd_id, String job_code, String is_manager, String is_sponsor, String is_supervisor, String e_userid) {
	super();
	this.efirst_name = efirst_name;
	this.elast_name = elast_name;
	this.currentd_id = currentd_id;
	this.job_code = job_code;
	this.is_manager = is_manager;
	this.is_sponsor = is_sponsor;
	this.is_supervisor = is_supervisor;
	this.e_userid = e_userid;
}

public Employees() {
	super();
}



public String getElast_name() {
	return elast_name;
}

public void setElast_name(String elast_name) {
	this.elast_name = elast_name;
}

public String getEfirst_name() {
	return efirst_name;
}

public void setEfirst_name(String efirst_name) {
	this.efirst_name = efirst_name;
}

public String getCurrentd_id() {
	return currentd_id;
}

public void setCurrentd_id(String currentd_id) {
	this.currentd_id = currentd_id;
}

public String getJob_code() {
	return job_code;
}

public void setJob_code(String job_code) {
	this.job_code = job_code;
}

public String getIs_manager() {
	return is_manager;
}

public void setIs_manager(String is_manager) {
	this.is_manager = is_manager;
}

public String getIs_sponsor() {
	return is_sponsor;
}

public void setIs_sponsor(String is_sponsor) {
	this.is_sponsor = is_sponsor;
}

public String getIs_supervisor() {
	return is_supervisor;
}

public void setIs_supervisor(String is_supervisor) {
	this.is_supervisor = is_supervisor;
}

public String getE_userid() {
	return e_userid;
}

public void setE_userid(String e_userid) {
	this.e_userid = e_userid;
}

@OneToMany(mappedBy="employees", cascade=CascadeType.ALL, fetch=FetchType.EAGER, targetEntity=Time.class)
private List<Time> time;



public List<Time> getTime() {
	return time;
}

public void setTime(List<Time> time) {
	this.time = time;
}

}