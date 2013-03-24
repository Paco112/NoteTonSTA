package com.supinfo.notetonsta.dao;

import java.util.List;

import com.supinfo.notetonsta.entity.Campus;

public interface CampusDao {
	
	Campus addCampus(Campus campus);
	Campus getCampusById(Long campusId);
	List<Campus> getAllCampus();


}
