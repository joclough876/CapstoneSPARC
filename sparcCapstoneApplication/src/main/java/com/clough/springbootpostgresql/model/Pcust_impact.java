package com.clough.springbootpostgresql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="pcust_impact")
public class Pcust_impact {

	@Id
	@GeneratedValue(generator="pcust_impact_pcust_impactid_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "pcust_impact_pcust_impactid_seq",
			sequenceName = "pcust_impact_pcust_impactid_seq",
			allocationSize=1
			)
	private Long pcust_impactid;
	

	public String getPcust_impacttype() {
		return pcust_impacttype;
	}

	public void setPcust_impacttype(String pcust_impacttype) {
		this.pcust_impacttype = pcust_impacttype;
	}

	@Column(name="pcust_impacttype")
	private String pcust_impacttype;

	public Pcust_impact(String pcust_impacttype) {
		super();
		this.pcust_impacttype = pcust_impacttype;
	}

	public Pcust_impact() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
