package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		   EntityManager em=emf.createEntityManager();
		   EntityTransaction et=em.getTransaction();
		    int id=2;
		   Movie m=em.find(Movie.class,id );
		    if(m!=null) {
		    	et.begin();
		    	em.remove(m);
		    	et.commit();
		    }

	}

}
