package org.hibernate.tutorial.tests;

import java.util.Date;

import org.hibernate.Session;

import org.hibernate.tutorial.domain.Event;
import org.hibernate.tutorial.util.HibernateUtil;

import org.junit.Test;

public class EventManager {

	@Test
	public void test() {

		Session session = HibernateUtil.getSessionfactory().getCurrentSession();
		session.beginTransaction();

		Event theEvent = new Event();
		theEvent.setTitle("My Event");
		theEvent.setDate(new Date());
		session.save(theEvent);

		session.getTransaction().commit();

		HibernateUtil.getSessionfactory().close();
	}

}
