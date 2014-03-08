package org.hibernate.tutorial.domain;

import java.util.Date;

public class Event {
	private Long id; // need to distinguish objects by identifier
	
	private String title;
	private Date date;
	
	// no-argument constructor is a requirement for all persistent classes
	public Event() {}
	
	public Long getId() {
		return id;
	}
	// we usually do not manipulate the identity of an object, hence the setter method should be private.
	// Only Hibernate will assign identifiers when an object is saved.
	private void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
}
