package com.clough.springbootpostgresql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="projecttimeassignment")
public class ProjectTimeAssignment {
	
	@Id
	@GeneratedValue(generator="projecttimeassignment_pta_id_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "projecttimeassignment_pta_id_seq",
			sequenceName = "projecttimeassignment_pta_id_seq",
			allocationSize=1
			)
	private Long pta_id;
	
	@Column(name="assignedbyId")
	private long assignedbyid;
	
	@Column(name="assignedto")
	private long assignedto;
	
	@Column(name="projectid")
	private long projectid;
	
	@Column(name="hoursassigned")
	private long hoursassigned;
	
	@Column(name="departmentid")
	private long departmentid;
	
	@Column(name="assigneddate")
	private long assigneddate;

	public long getAssignedbyid() {
		return assignedbyid;
	}

	public void setAssignedbyid(long assignedbyid) {
		this.assignedbyid = assignedbyid;
	}

	public long getAssignedto() {
		return assignedto;
	}

	public void setAssignedto(long assignedto) {
		this.assignedto = assignedto;
	}

	public long getProjectid() {
		return projectid;
	}

	public void setProjectid(long projectid) {
		this.projectid = projectid;
	}

	public long getHoursassigned() {
		return hoursassigned;
	}

	public void setHoursassigned(long hoursassigned) {
		this.hoursassigned = hoursassigned;
	}

	public long getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(long departmentid) {
		this.departmentid = departmentid;
	}

	public long getAssigneddate() {
		return assigneddate;
	}

	public void setAssigneddate(long assigneddate) {
		this.assigneddate = assigneddate;
	}

	public ProjectTimeAssignment(long assignedbyid, long assignedto, long projectid, long hoursassigned,
			long departmentid, long assigneddate) {
		super();
		this.assignedbyid = assignedbyid;
		this.assignedto = assignedto;
		this.projectid = projectid;
		this.hoursassigned = hoursassigned;
		this.departmentid = departmentid;
		this.assigneddate = assigneddate;
	}

	public ProjectTimeAssignment() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
