/*
 * takes care of startup and makes accessing the org.hibernate.SessionFactory more convenient.
 */
package org.hibernate.tutorial.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			// Create session factory from hibernate.cfg.xml
			return new Configuration().configure().buildSessionFactory();	
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	
	
}
