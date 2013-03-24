package com.supinfo.notetonsta.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.supinfo.notetonsta.dao.MarkDao;
import com.supinfo.notetonsta.entity.Mark;

public class JpaMarkDao implements MarkDao {

	private EntityManagerFactory emf;


	public JpaMarkDao(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@Override
	public Mark addMark(Mark Mark) {
		Mark result = null;
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(Mark);
			em.getTransaction().commit();
			result = Mark;
		} finally {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			em.close();
		}
		return result;
	}

	@Override
	public Mark getMarkById(Long MarkId) {
		EntityManager em = emf.createEntityManager();
		try {
			return em.find(Mark.class, MarkId);
		} finally {
			em.close();
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Mark> getAllMarks() {
		EntityManager em = emf.createEntityManager();
		try {
			Query query = em.createQuery("SELECT c FROM Mark c");
			return query.getResultList();
		} finally {
			em.close();
		}
	}

}
