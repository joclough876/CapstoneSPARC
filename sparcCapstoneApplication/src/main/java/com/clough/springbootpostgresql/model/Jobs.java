package com.clough.springbootpostgresql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="jobs")
public class Jobs {
	
	@Id
	@GeneratedValue(generator="jobs_jobid_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "jobs_jobid_seq",
			sequenceName = "jobs_jobid_seq",
			allocationSize=1
			)
	private Long jobid;
	

	public String getJob_code() {
		return job_code;
	}

	public void setJob_code(String job_code) {
		this.job_code = job_code;
	}

	public String getManager_code() {
		return manager_code;
	}

	public void setManager_code(String manager_code) {
		this.manager_code = manager_code;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getManager_title() {
		return manager_title;
	}

	public void setManager_title(String manager_title) {
		this.manager_title = manager_title;
	}

	@Column(name="job_code")
	private String job_code;
	
	@Column(name="manager_code")
	private String manager_code;
	
	@Column(name="job_title")
	private String job_title;
	
	@Column(name="manager_title")
	private String manager_title;

	public Jobs(String job_code, String manager_code, String job_title, String manager_title) {
		super();
		this.job_code = job_code;
		this.manager_code = manager_code;
		this.job_title = job_title;
		this.manager_title = manager_title;
	}

	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getJobid() {
		return jobid;
	}

	public void setJobid(Long jobid) {
		this.jobid = jobid;
	}
	

}
