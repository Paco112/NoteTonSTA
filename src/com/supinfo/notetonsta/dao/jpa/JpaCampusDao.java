package com.supinfo.notetonsta.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.supinfo.notetonsta.dao.CampusDao;
import com.supinfo.notetonsta.entity.Campus;

public class JpaCampusDao implements CampusDao {

	private EntityManagerFactory emf;


	public JpaCampusDao(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@Override
	public Campus addCampus(Campus Campus) {
		Campus result = null;
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(Campus);
			em.getTransaction().commit();
			result = Campus;
		} finally {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			em.close();
		}
		return result;
	}

	@Override
	public Campus getCampusById(Long CampusId) {
		EntityManager em = emf.createEntityManager();
		try {
			return em.find(Campus.class, CampusId);
		} finally {
			em.close();
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Campus> getAllCampus() {
		EntityManager em = emf.createEntityManager();
		try {
			Query query = em.createQuery("SELECT c FROM Campus c");
			return query.getResultList();
		} finally {
			em.close();
		}
	}

}
