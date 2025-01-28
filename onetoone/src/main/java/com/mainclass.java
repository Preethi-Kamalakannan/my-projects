package com;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class mainclass {
  
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
}
