package com.clough.springbootpostgresql.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobhistory")
public class Jobhistory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="job_history_id")
	 private Long job_history_id;
	@Column(name="employeeid")
	 private long employeeid;	
	@Column(name="startdate")
	 private Date startdate;	
	@Column(name="endate")
	 private Date enddate;	
	@Column(name="job_code")
	 private String job_code;	
	@Column(name="departmentid")
	 private long departmentid;	
	@Column(name="managereid")
	 private long managereid;	
	@Column(name="is_current")
	 private String is_current;	
	@Column(name="status")
	 private String status;
	
	public Long getJob_history_id() {
		return job_history_id;
	}
	public void setJob_history_id(Long job_history_id) {
		this.job_history_id = job_history_id;
	}
	public long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getJob_code() {
		return job_code;
	}
	public void setJob_code(String job_code) {
		this.job_code = job_code;
	}
	public long getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(long departmentid) {
		this.departmentid = departmentid;
	}
	public long getManagereid() {
		return managereid;
	}
	public void setManagereid(long managereid) {
		this.managereid = managereid;
	}
	public String getIs_current() {
		return is_current;
	}
	public void setIs_current(String is_current) {
		this.is_current = is_current;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Jobhistory(long employeeid, Date startdate, Date enddate, String job_code, long departmentid,
			long managereid, String is_current, String status) {
		super();
		this.employeeid = employeeid;
		this.startdate = startdate;
		this.enddate = enddate;
		this.job_code = job_code;
		this.departmentid = departmentid;
		this.managereid = managereid;
		this.is_current = is_current;
		this.status = status;
	}
	public Jobhistory() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	
}
