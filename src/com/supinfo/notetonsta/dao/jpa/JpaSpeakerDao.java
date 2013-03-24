package com.supinfo.notetonsta.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.supinfo.notetonsta.dao.SpeakerDao;
import com.supinfo.notetonsta.entity.Speaker;

public class JpaSpeakerDao implements SpeakerDao {

	private EntityManagerFactory emf;


	public JpaSpeakerDao(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@Override
	public Speaker addSpeaker(Speaker Speaker) {
		Speaker result = null;
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(Speaker);
			em.getTransaction().commit();
			result = Speaker;
		} finally {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			em.close();
		}
		return result;
	}

	@Override
	public Speaker getSpeakerById(Long SpeakerId) {
		EntityManager em = emf.createEntityManager();
		try {
			return em.find(Speaker.class, SpeakerId);
		} finally {
			em.close();
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Speaker> getAllSpeakers() {
		EntityManager em = emf.createEntityManager();
		try {
			Query query = em.createQuery("SELECT c FROM Speaker c");
			return query.getResultList();
		} finally {
			em.close();
		}
	}

}
