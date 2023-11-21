package org.formation.hibernate.client;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.formation.hibernate.entity.person;

public class TestClientDelete {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			
			txn.begin();
			
			//remove
			person prsn = em.find(person.class, 1L);
			System.out.println(prsn);
			
			em.remove(prsn);
			

			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}

	}


