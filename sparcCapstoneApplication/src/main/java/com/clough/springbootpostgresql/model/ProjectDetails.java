package com.clough.springbootpostgresql.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="projectdetails")
public class ProjectDetails {

	public ProjectDetails(String pdescription, String ppurpose, String pimpact, long presourcesest, long pcust_impactid,
			long pstatus_id) {
		super();
		this.pdescription = pdescription;
		this.ppurpose = ppurpose;
		this.pimpact = pimpact;
		this.presourcesest = presourcesest;
		this.pcust_impactid = pcust_impactid;
		this.pstatus_id = pstatus_id;
	}
	@Id
	@GeneratedValue(generator="projectdetails_projectdetailsid_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "projectdetails_projectdetailsid_seq",
			sequenceName = "projectdetails_projectdetailsid_seq",
			allocationSize=1
			)
	private Long projectdetailsid;
	
	@Column(name="pdescription")
	 private String pdescription;	
	@Column(name="ppurpose")
	 private String ppurpose;	
	

	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public String getPpurpose() {
		return ppurpose;
	}
	public void setPpurpose(String ppurpose) {
		this.ppurpose = ppurpose;
	}
	public String getPimpact() {
		return pimpact;
	}
	public void setPimpact(String pimpact) {
		this.pimpact = pimpact;
	}
	public long getPresourcesest() {
		return presourcesest;
	}
	public void setPresourcesest(long presourcesest) {
		this.presourcesest = presourcesest;
	}
	public long getPcust_impactid() {
		return pcust_impactid;
	}
	public void setPcust_impactid(long pcust_impactid) {
		this.pcust_impactid = pcust_impactid;
	}
	public long getPstatus_id() {
		return pstatus_id;
	}
	public void setPstatus_id(long pstatus_id) {
		this.pstatus_id = pstatus_id;
	}
	@Column(name="pimpact")
	 private String pimpact;
	@Column(name="presourcesest")
	private long presourcesest;
	@Column(name="pcust_impactid")
	private long pcust_impactid;
	@Column(name="pstatus_id")
	private long pstatus_id;
	
	public ProjectDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	//@OneToMany(mappedBy="pstatus", cascade=CascadeType.ALL, fetch=FetchType.EAGER, targetEntity=Projects.class)
	//private List<Projects> projects;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "projects_pid")
	private Projects projects;


	public Long getProjectdetailsid() {
		return projectdetailsid;
	}
	public void setProjectdetailsid(Long projectdetailsid) {
		this.projectdetailsid = projectdetailsid;
	}
	public Projects getProjects() {
		return projects;
	}
	public void setProjects(Projects projects) {
		this.projects = projects;
	}
	
}
