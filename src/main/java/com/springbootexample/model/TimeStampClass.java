package com.springbootexample.model;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 * Created by Rehman
 */
public class TimeStampClass {

    private Date created;
	
    private Date updated;

    public Date getCreated() {
        return created;
    }

    public Date getUpdated() {
        return updated;
    }

    @PreUpdate
    @PrePersist
    public void updateTimeStamps() {
        updated = new Date();
        if (created==null) {
            created = new Date();
        }
    }
}
