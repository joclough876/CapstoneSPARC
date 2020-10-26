package com.clough.springbootpostgresql.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="timetype")
public class TimeType {
	
	@Id
	@GeneratedValue(generator="timetype_timetypeid_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "timetype_timetypeid_seq",
			sequenceName = "timetype_timetypeid_seq",
			allocationSize=1
			)
	private Long timetypeid;
	
	@Column(name="timetypedesc")
	private String timetypedesc;

	@Column(name="timetypename")
	private String timetypename;

	public String getTimetypedesc() {
		return timetypedesc;
	}

	public void setTimetypedesc(String timetypedesc) {
		this.timetypedesc = timetypedesc;
	}

	public String getTimetypename() {
		return timetypename;
	}

	public void setTimetypename(String timetypename) {
		this.timetypename = timetypename;
	}

	public TimeType(String timetypedesc, String timetypename) {
		super();
		this.timetypedesc = timetypedesc;
		this.timetypename = timetypename;
	}

	public TimeType() {
		super();
		// TODO Auto-generated constructor stub
	}


	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "time_timetypeid")
	private List<Time> time;
	
	public List<Time> getTime() {
		return time;
	}

	public void setTime(List<Time> time) {
		this.time = time;
	}

}
