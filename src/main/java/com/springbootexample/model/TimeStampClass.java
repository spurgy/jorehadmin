package com.springbootexample.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * Created by Rehman
 */
public class TimeStampClass {
	@CreationTimestamp
    private Date created;
	@UpdateTimestamp
    private Date updated;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
		this.updated = updated;
	}

	/*@PreUpdate
    @PrePersist
    public void updateTimeStamps() {
        updated = new Date();
        if (created==null) {
            created = new Date();
        }
    }*/
}
