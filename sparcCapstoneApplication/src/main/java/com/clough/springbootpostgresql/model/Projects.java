package com.clough.springbootpostgresql.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="projects")
public class Projects {

	@Id
	@GeneratedValue(generator="projects_pid_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "projects_pid_seq",
			sequenceName="projects_pid_seq",
			allocationSize=1
			)
	 private Long pid;
	
	@Column(name="pname")
	 private String pname;	
	@Column(name="pstartdate")
	 private Date pstartdate;	
	@Column(name="pendate")
	 private Date penddate;
	@Column(name="ptimeforecast")
	private String ptimeforecast;
	@Column(name="pestimatebudget")
	private long pestimatebudget;
	@Column(name="psponsorid")
	private Long psponsorid;
	@Column(name="prequestorid")
	private String prequestorid;
	@Column(name="psubmittedbyid")
	private String psubmittedbyid;
	@Column(name="psubmittedbydate")
	private Date psubmittedbydate;
	@Column(name="projectleadid")
	private Long projectleadid;
	
	@Column(name="projectdetailsid")
	private long projectdetailsid;
	
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getPstartdate() {
		return pstartdate;
	}
	public void setStartdate(Date pstartdate) {
		this.pstartdate = pstartdate;
	}
	public Date getPenddate() {
		return penddate;
	}
	public void setPenddate(Date penddate) {
		this.penddate = penddate;
	}
	public String getPtimeforecast() {
		return ptimeforecast;
	}
	
	public void setPtimeforecast(String ptimeforecast) {
		this.ptimeforecast = ptimeforecast;
	}
	public long getPestimatebudget() {
		return pestimatebudget;
	}
	public void setPestimatebudget(long pestimatebudget) {
		this.pestimatebudget = pestimatebudget;
	}
	public long getPsponsorid() {
		return psponsorid;
	}
	public void setPsponsorid(long psponsorid) {
		this.psponsorid = psponsorid;
	}
	public String getPrequestorid() {
		return prequestorid;
	}
	public void setPrequestorid(String prequestorid) {
		this.prequestorid = prequestorid;
	}
	public String getPsubmittedbyid() {
		return psubmittedbyid;
	}
	public void setPsubmittedbyid(String psubmittedbyid) {
		this.psubmittedbyid = psubmittedbyid;
	}
	public Date getPsubmittedbydate() {
		return psubmittedbydate;
	}
	public void setPsubmittedbydate(Date psubmittedbydate) {
		this.psubmittedbydate = psubmittedbydate;
	}
	public Long getProjectleadid() {
		return projectleadid;
	}
	public void setProjectleadid(Long projectleadid) {
		this.projectleadid = projectleadid;
	}
	public long getProjectdetailsid() {
		return projectdetailsid;
	}
	public void setProjectedetailsid(long projectdetailsid) {
		this.projectdetailsid = projectdetailsid;
	}
	public Projects(String pname, Date pstartdate, Date penddate, String ptimeforecast, long pestimatebudget,
			Long psponsorid, String prequestorid, String psubmittedbyid, Date psubmittedbydate, Long projectleadid,
			long projectdetailsid) {
		super();
		this.pname = pname;
		this.pstartdate = pstartdate;
		this.penddate = penddate;
		this.ptimeforecast = ptimeforecast;
		this.pestimatebudget = pestimatebudget;
		this.psponsorid = psponsorid;
		this.prequestorid = prequestorid;
		this.psubmittedbyid = psubmittedbyid;
		this.psubmittedbydate = psubmittedbydate;
		this.projectleadid = projectleadid;
		this.projectdetailsid = projectdetailsid;
	}
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@ManyToOne
	@JoinColumn(name="projectstatus_pstatusid")
	private ProjectStatus projectstatus;

	public ProjectStatus getProjectstatus() {
		return projectstatus;
	}
	public void setProjectstatus(ProjectStatus projectstatus) {
		this.projectstatus = projectstatus;
	}
	public void setPstartdate(Date pstartdate) {
		this.pstartdate = pstartdate;
	}
	public void setPsponsorid(Long psponsorid) {
		this.psponsorid = psponsorid;
	}
	public void setProjectdetailsid(long projectdetailsid) {
		this.projectdetailsid = projectdetailsid;
	}

}
