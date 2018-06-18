package com.springbootexample.model;

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
@Table(name = "loyalty_points")
public class LoyaltyPoints {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="myapp.loyalty_points_loyalty_id_seq")
    @SequenceGenerator(name="myapp.loyalty_points_loyalty_id_seq", sequenceName="myapp.loyalty_points_loyalty_id_seq", allocationSize=1)
	@Column(name="loyalty_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="membership_id")
	private Membership membership;
	
	@Column(name="loyalty_points")
	private double points;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Membership getMembership() {
		return membership;
	}

	public void setMembership(Membership membership) {
		this.membership = membership;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}
}
