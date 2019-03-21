package com.larz.dom5api;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * The persistent class for the weapon database table.
 * 
 */
@Entity
@JsonInclude(Include.NON_NULL)
public class Weapon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer ammo;

	private Integer att;

	private Integer def;

	@Column(name="effect_record_id")
	private Integer effectRecordId;

	private Integer len;

	private String name;

	private Integer nratt;

	private Integer rcost;

	private Integer secondaryeffect;

	private Integer secondaryeffectalways;

	public Weapon() {
	}

	public Integer getAmmo() {
		return this.ammo;
	}

	public void setAmmo(Integer ammo) {
		this.ammo = ammo;
	}

	public Integer getAtt() {
		return this.att;
	}

	public void setAtt(Integer att) {
		this.att = att;
	}

	public Integer getDef() {
		return this.def;
	}

	public void setDef(Integer def) {
		this.def = def;
	}

	public Integer getEffectRecordId() {
		return this.effectRecordId;
	}

	public void setEffectRecordId(Integer effectRecordId) {
		this.effectRecordId = effectRecordId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLen() {
		return this.len;
	}

	public void setLen(Integer len) {
		this.len = len;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNratt() {
		return this.nratt;
	}

	public void setNratt(Integer nratt) {
		this.nratt = nratt;
	}

	public Integer getRcost() {
		return this.rcost;
	}

	public void setRcost(Integer rcost) {
		this.rcost = rcost;
	}

	public Integer getSecondaryeffect() {
		return this.secondaryeffect;
	}

	public void setSecondaryeffect(Integer secondaryeffect) {
		this.secondaryeffect = secondaryeffect;
	}

	public Integer getSecondaryeffectalways() {
		return this.secondaryeffectalways;
	}

	public void setSecondaryeffectalways(Integer secondaryeffectalways) {
		this.secondaryeffectalways = secondaryeffectalways;
	}

}