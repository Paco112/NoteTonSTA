package com.supinfo.notetonsta.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Campus")
public class Campus implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long campus_id;
	
	@Column(nullable=false, unique=true)
	private String campus_name;
	
	public long getCampus_id() {
		return campus_id;
	}
	public String getCampus_name() {
		return campus_name;
	}
	public void setCampus_name(String campus_name) {
		this.campus_name = campus_name;
	}

}
