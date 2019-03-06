package com.example;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="monster_attributes")
public class Attribute {
	@Id
	@GeneratedValue
	private Long id;
	
	private String key;
	private String value;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "monster_id")
	private Monster monster;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
