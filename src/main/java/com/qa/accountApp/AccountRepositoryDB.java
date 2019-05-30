package com.qa.accountApp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.h2.mvstore.db.TransactionStore.Transaction;

public class AccountRepositoryDB implements AccountRepository {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void add(Account account) {
		et.begin();
		em.persist(account);
		et.commit();
		
	}
	public Account retrieve(int id) {
		return em.find(Account.class, id);
	}
	public Account updateFirstName(int id, String firstName) {
		et.begin();
		Account account = retrieve(id);
		account.setFirstName(firstName);
		et.commit();
		return account;
	}
	public void remove(int id) {
		et.begin();
		Account account = retrieve(id);
		int id = account.getId();
		
		et.commit();
		
	}
	
	
}
