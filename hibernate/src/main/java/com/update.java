package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.*;
public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		   EntityManager em=emf.createEntityManager();
		   EntityTransaction et=em.getTransaction();
		   
		   Scanner sc=new Scanner(System.in);
		    System.out.println("enter id");
		    int id=sc.nextInt();
		     
		    Movie m=em.find(Movie.class, id);
		     if(m!=null) {
		    	 m.setHero("tabu");
		    	 m.setHeroine("preethi");
		    	 et.begin();
		    	 em.merge(m);
		    	 et.commit();
		     }else {
		    	 System.out.print("not found");
		     }
	}

}
