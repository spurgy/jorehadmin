package com.springbootexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "duration")
public class Duration {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="myapp.duration_duration_id_seq")
    @SequenceGenerator(name="myapp.duration_duration_id_seq", sequenceName="myapp.duration_duration_id_seq", allocationSize=1)
	@Column(name="duration_id")
	private Long id;
	
	@Column(name="duration")
	private int durationPeriod;
	
	@Column(name="duration_type")
	private String durationType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDurationPeriod() {
		return durationPeriod;
	}

	public void setDurationPeriod(int durationPeriod) {
		this.durationPeriod = durationPeriod;
	}

	public String getDurationType() {
		return durationType;
	}

	public void setDurationType(String durationType) {
		this.durationType = durationType;
	}
}
