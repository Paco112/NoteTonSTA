package com.supinfo.notetonsta.dao;

import com.supinfo.notetonsta.dao.jpa.JpaCampusDao;
import com.supinfo.notetonsta.dao.jpa.JpaSpeakerDao;
import com.supinfo.notetonsta.util.PersistenceManager;

public final class DaoFactory {
	
	private static DaoFactory instance;
	
	private CampusDao campusDao;
	private InterventionDao interventionDao;
	private MarkDao markDao;
	private SpeakerDao speakerDao;
	
	public static DaoFactory getInstance() {
		if(instance == null) {
			instance = new DaoFactory();
		}
		return instance;
	}
	
	public CampusDao getCampusDao() {
		if(campusDao == null) {
			campusDao = new JpaCampusDao(PersistenceManager.getEntityManagerFactory());
		}
		return campusDao;
	}
	
	public SpeakerDao getSpeakerDao() {
		if(speakerDao == null) {
			speakerDao = new JpaSpeakerDao(PersistenceManager.getEntityManagerFactory());
		}
		return speakerDao;
	}
}
