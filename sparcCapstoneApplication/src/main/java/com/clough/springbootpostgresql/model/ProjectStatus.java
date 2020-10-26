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
@Table(name="projectstatus")
public class ProjectStatus {

	public ProjectStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectStatus(String pstatus) {
		super();
		this.pstatus = pstatus;
	}

	@Id
	@GeneratedValue(generator="projectstatus_pstatus_id_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "projectstatus_pstatus_id_seq",
			sequenceName = "projectstatus_pstatus_id_seq",
			allocationSize=1
			)
	private Long pstatus_id;
	
	@Column(name="pstatus")
	private String pstatus;

	public String getPstatus() {
		return pstatus;
	}

	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}
	
	@OneToMany(mappedBy="projectstatus", cascade=CascadeType.ALL, fetch=FetchType.EAGER, targetEntity=Projects.class)
	private List<Projects> projects;

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}
}
