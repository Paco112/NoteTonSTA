package com.supinfo.notetonsta.dao;

import java.util.List;

import com.supinfo.notetonsta.entity.Speaker;

public interface SpeakerDao {
	
	Speaker addSpeaker(Speaker speaker);
	Speaker getSpeakerById(Long speakerId);
	List<Speaker> getAllSpeakers();


}
