package com.supinfo.notetonsta.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mark")
public class Mark implements Serializable {

	/**
	 * 
	 */
	@Id	@GeneratedValue(strategy=GenerationType.AUTO)
	private long mark_id;
	private long intervention_id;
	private long mark_idBooster;
	private float mark_speaker;
	private float mark_slides;
	private String mark_comments;
		
	public long getMark_id() {
		return mark_id;
	}

	public long getIntervention_id() {
		return intervention_id;
	}

	public void setIntervention_id(long intervention_id) {
		this.intervention_id = intervention_id;
	}

	public long getMark_idBooster() {
		return mark_idBooster;
	}

	public void setMark_idBooster(long mark_idBooster) {
		this.mark_idBooster = mark_idBooster;
	}

	public float getMark_speaker() {
		return mark_speaker;
	}

	public void setMark_speaker(float mark_speaker) {
		this.mark_speaker = mark_speaker;
	}

	public float getMark_slides() {
		return mark_slides;
	}

	public void setMark_slides(float mark_slides) {
		this.mark_slides = mark_slides;
	}

	public String getMark_comments() {
		return mark_comments;
	}

	public void setMark_comments(String mark_comments) {
		this.mark_comments = mark_comments;
	}

	private static final long serialVersionUID = 1L;

}
