package com.supinfo.notetonsta.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Speaker")
public class Speaker implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id	@GeneratedValue(strategy=GenerationType.AUTO)
	private long speaker_id;
	@Column(nullable=false)
	private String speaker_lastname;
	@Column(nullable=false)
	private String speaker_firstname;
	@Column(unique=true, nullable=false)
	private String speaker_email;
	@Column(nullable=false)
	private String speaker_password;
	
	public long getSpeaker_id() {
		return speaker_id;
	}
	public String getSpeaker_lastname() {
		return speaker_lastname;
	}
	public void setSpeaker_lastname(String speaker_lastname) {
		this.speaker_lastname = speaker_lastname;
	}
	public String getSpeaker_firstname() {
		return speaker_firstname;
	}
	public void setSpeaker_firstname(String speaker_firstname) {
		this.speaker_firstname = speaker_firstname;
	}
	public String getSpeaker_email() {
		return speaker_email;
	}
	public void setSpeaker_email(String speaker_email) {
		this.speaker_email = speaker_email;
	}
	public String getSpeaker_password() {
		return speaker_password;
	}
	public void setSpeaker_password(String speaker_password) {
		this.speaker_password = speaker_password;
	}
	
	
	
}
