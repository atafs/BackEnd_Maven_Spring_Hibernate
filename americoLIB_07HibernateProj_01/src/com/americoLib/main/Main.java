package com.americoLib.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.americoLib.dao.UserDetails;

public class Main {

	public static void main(String[] args) {
		//INSTANTIATE 
		UserDetails user = new UserDetails();
		user.setUserId(6);
		user.setUserName("SIX");
		
		user.setAddress("my address");
		user.setJoinedDate(new Date());
		user.setDescription("description");

		//SAVE OBJECT IN DATABASE (hibernate api) 
		//1-SESSION FACTORY(get config file)
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		//2-SESSION FROM THE SESSION FACTORY (multiple) 
		Session session = sessionFactory.openSession();
		//2.1-NEW TRANSACTION
		session.beginTransaction();
		
		//3-SAVE MODEL OBJECTS
		session.save(user);
		session.getTransaction().commit();
	}
}
