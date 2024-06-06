package com.hyber.fourth;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fourth.employee;

public class App 
{
    public static void main( String[] args )
    {
    	 employee emp=new employee(20100,"rakesh","female",1340);
    	Configuration cfg = new Configuration().configure("hybernate.cfg.xml");
 		SessionFactory sessionFactory = cfg.buildSessionFactory();
 		Session session = sessionFactory.openSession();
 		Transaction tx = session.beginTransaction();
 		session.save(emp);
 		tx.commit();

    	
    }
}
