package com.clough.springbootpostgresql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Departments{
		
	@Id
	@GeneratedValue(generator="departments_did_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "departments_did_seq",
			sequenceName = "departments_did_seq",
			allocationSize=1
			)
	private String did;
		
	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public long getD_cc() {
		return d_cc;
	}

	public void setD_cc(long d_cc) {
		this.d_cc = d_cc;
	}

	@Column(name= "dname")
	private String dname;
	
	@Column(name="d_cc")
	private long d_cc;

	public Departments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departments(String dname, long d_cc) {
		super();
		this.dname = dname;
		this.d_cc = d_cc;
	}
	
	
	}


