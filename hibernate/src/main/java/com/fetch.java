package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class fetch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		   EntityManager em1=emf.createEntityManager();
		   EntityManager em2=emf.createEntityManager();
		   em1.find(Movie.class, 1);
//		   EntityTransaction et=em.getTransaction();
//		    int id=1;
//		   Movie m=em.find(Movie.class,id );
//		    if(m!=null) {
//		    	System.out.println(m);
//		    }

}
	}
