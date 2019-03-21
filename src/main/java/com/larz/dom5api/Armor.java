package com.larz.dom5api;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * The persistent class for the armor database table.
 * 
 */
@Entity
@JsonInclude(Include.NON_NULL)
public class Armor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	@ManyToMany(mappedBy = "armor")
	private List<Monster> monster;

	private Integer def;

	private Integer enc;

	private String name;

	private Integer rcost;

	private Integer type;

	public Armor() {
	}

	public Integer getDef() {
		return this.def;
	}

	public void setDef(Integer def) {
		this.def = def;
	}

	public Integer getEnc() {
		return this.enc;
	}

	public void setEnc(Integer enc) {
		this.enc = enc;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRcost() {
		return this.rcost;
	}

	public void setRcost(Integer rcost) {
		this.rcost = rcost;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}