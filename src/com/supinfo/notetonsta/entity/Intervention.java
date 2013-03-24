package com.supinfo.notetonsta.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Intervention")
public class Intervention implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id	@GeneratedValue(strategy=GenerationType.AUTO)
	private long intervention_id;
	private String intervention_subject;
	private long intervention_begin;
	private long intervention_end;
	private int intervention_status;
	private long campus_id;
	private long speaker_id;
	private String intervention_description;
	
	public long getIntervention_id() {
		return intervention_id;
	}
	public String getIntervention_subject() {
		return intervention_subject;
	}
	public void setIntervention_subject(String intervention_subject) {
		this.intervention_subject = intervention_subject;
	}
	public long getIntervention_begin() {
		return intervention_begin;
	}
	public void setIntervention_begin(long intervention_begin) {
		this.intervention_begin = intervention_begin;
	}
	public long getIntervention_end() {
		return intervention_end;
	}
	public void setIntervention_end(long intervention_end) {
		this.intervention_end = intervention_end;
	}
	public int getIntervention_status() {
		return intervention_status;
	}
	public void setIntervention_status(int intervention_status) {
		this.intervention_status = intervention_status;
	}
	public long getCampus_id() {
		return campus_id;
	}
	public void setCampus_id(long campus_id) {
		this.campus_id = campus_id;
	}
	public long getSpeaker_id() {
		return speaker_id;
	}
	public void setSpeaker_id(long speaker_id) {
		this.speaker_id = speaker_id;
	}
	public String getIntervention_description() {
		return intervention_description;
	}
	public void setIntervention_description(String intervention_description) {
		this.intervention_description = intervention_description;
	}
	
}
