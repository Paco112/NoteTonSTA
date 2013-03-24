package com.supinfo.notetonsta.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.supinfo.notetonsta.dao.InterventionDao;
import com.supinfo.notetonsta.entity.Intervention;;

public class JpaInterventionDao implements InterventionDao {

	private EntityManagerFactory emf;


	public JpaInterventionDao(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@Override
	public Intervention addIntervention(Intervention Intervention) {
		Intervention result = null;
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(Intervention);
			em.getTransaction().commit();
			result = Intervention;
		} finally {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			em.close();
		}
		return result;
	}

	@Override
	public Intervention getInterventionById(Long InterventionId) {
		EntityManager em = emf.createEntityManager();
		try {
			return em.find(Intervention.class, InterventionId);
		} finally {
			em.close();
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Intervention> getAllInterventions(String orderBy) {
		EntityManager em = emf.createEntityManager();
		try {
			Query query;
			if(orderBy != null && orderBy != "") query = em.createQuery("SELECT c FROM Intervention c ORDER BY '"+orderBy+"'");
			else 				query = em.createQuery("SELECT c FROM Intervention c");
			return query.getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public void delInterventionById(Long interventionId) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		try {
			em.remove(em.find(Intervention.class, interventionId));
			return;
		} finally {
			em.close();
		}
		
	}



}
