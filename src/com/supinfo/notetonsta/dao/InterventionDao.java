package com.supinfo.notetonsta.dao;

import java.util.List;

import com.supinfo.notetonsta.entity.Intervention;

public interface InterventionDao {
	
	Intervention addIntervention(Intervention intervention);
	Intervention getInterventionById(Long interventionId);
	void delInterventionById(Long interventionId);	
	List<Intervention> getAllInterventions(String orderBy);


}
