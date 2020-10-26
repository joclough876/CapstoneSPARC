package com.clough.springbootpostgresql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="projectdepartments")
public class ProjectDepartments {

	//MEMBER VARIABLES
	@Id
	@GeneratedValue(generator="projectdepartments_pd_key_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "projectdepartments_pd_key_seq",
			sequenceName = "projectdepartments_pd_key_seq",
			allocationSize=1
			)
	 private Long pd_key;
	
	@Column(name="pid")
	private long pid;
	
	@Column(name="did")
	private long did;

	public Long getPd_key() {
		return pd_key;
	}

	public void setPd_key(Long pd_key) {
		this.pd_key = pd_key;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public long getDid() {
		return did;
	}

	public void setDid(long did) {
		this.did = did;
	}

	public ProjectDepartments(long pid, long did) {
		super();
		this.pid = pid;
		this.did = did;
	}

	public ProjectDepartments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
