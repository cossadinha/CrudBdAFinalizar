package br.gft.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Conexao {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("crud");

	public EntityManager createEntityManager() {
		return emf.createEntityManager();
	}
	
	public static EntityManager getInstance() {
		return emf.createEntityManager();
	}

}
