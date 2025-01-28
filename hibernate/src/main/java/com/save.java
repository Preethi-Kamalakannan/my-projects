package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class save {
   public static void main(String[]args) {
	   EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	   EntityManager em=emf.createEntityManager();
	   EntityTransaction et=em.getTransaction();
	   
	   Movie m=new Movie();
	   m.setMid(2);
	   m.setMname("sad");
	   m.setHero("asdfghj");
	   m.setHeroine("fghjk");
	   m.setDirector("ertyui");
	   m.setCollection(10);
	   m.setRating(1);
	   
	   et.begin();
	   em.persist(m);
	   et.commit();
	   
	   
   }

}
