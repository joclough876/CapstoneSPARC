package com.clough.springbootpostgresql.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="time")
public class Time {
	
	@Id
	@GeneratedValue(generator="time_timeid_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "time_timeid_seq",
			sequenceName = "time_timeid_seq",
			allocationSize=1
			)
	private Long timeid;

	@Column(name="timetypeid")
	private long timetypeid;

	@Column(name="time_eid")
	private long time_eid;
	
	@Column(name="timespent")
	private Long timespent;
	
	@Column(name= "timedate")
	private Date timedate;
	
	@Column(name= "timeprojectid")
	private Long timeprojectid;


	public Time(long timetypeid, long time_eid, Long timespent, Date timedate, Long timeprojectid) {
		super();
		this.timetypeid = timetypeid;
		this.time_eid = time_eid;
		this.timespent = timespent;
		this.timedate = timedate;
		this.timeprojectid = timeprojectid;
	}

	public Time() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getTimetypeid() {
		return timetypeid;
	}

	public void setTimetypeid(long timetypeid) {
		this.timetypeid = timetypeid;
	}

	public long getTime_eid() {
		return time_eid;
	}

	public void setTime_eid(long time_eid) {
		this.time_eid = time_eid;
	}

	public Long getTimespent() {
		return timespent;
	}

	public void setTimespent(Long timespent) {
		this.timespent = timespent;
	}

	public Date getTimedate() {
		return timedate;
	}

	public void setTimedate(Date timedate) {
		this.timedate = timedate;
	}

	public Long getTimeprojectid() {
		return timeprojectid;
	}

	public Long getTimeid() {
		return timeid;
	}

	public void setTimeid(Long timeid) {
		this.timeid = timeid;
	}

	public void setTimeprojectid(Long timeprojectid) {
		this.timeprojectid = timeprojectid;
	}
	
	@ManyToOne
	@JoinColumn(name="employees_eid")
	private Employees employees;


	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}
	

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "timetype_timetypeid")
	private TimeType timetype;


	public TimeType getTimetype() {
		return timetype;
	}

	public void setTimetype(TimeType timetype) {
		this.timetype = timetype;
	}


}
