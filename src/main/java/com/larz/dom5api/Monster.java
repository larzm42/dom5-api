package com.larz.dom5api;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@Entity
@Table(name="monster")
@JsonInclude(Include.NON_NULL)
public class Monster {
	
	@Id
	private Long id;
	
	private String name;
	private Integer ap;
	private Integer mapmove;
	private Integer size;
	private Integer ressize;
	private Integer hp;
	private Integer prot;
	private Integer str;
	private Integer enc;
	private Integer prec;
	private Integer att; 
	private Integer def; 
	private Integer mr;
	private Integer mor; 
	private Integer wpn1;
	private Integer wpn2;
	private Integer wpn3;
	private Integer wpn4;
	private Integer wpn5;
	private Integer wpn6;
	private Integer wpn7;
	private Integer armor1;
	private Integer armor2;
	private Integer armor3;
	private Integer basecost;
	private Integer rcost;
	private Integer rpcost;
	
	@OneToMany(mappedBy = "monster", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Attribute> attributes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAp() {
		return ap;
	}
	public void setAp(Integer ap) {
		this.ap = ap;
	}
	public Integer getMapmove() {
		return mapmove;
	}
	public void setMapmove(Integer mapmove) {
		this.mapmove = mapmove;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getRessize() {
		return ressize;
	}
	public void setRessize(Integer ressize) {
		this.ressize = ressize;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getProt() {
		return prot;
	}
	public void setProt(Integer prot) {
		this.prot = prot;
	}
	public Integer getStr() {
		return str;
	}
	public void setStr(Integer str) {
		this.str = str;
	}
	public Integer getEnc() {
		return enc;
	}
	public void setEnc(Integer enc) {
		this.enc = enc;
	}
	public Integer getPrec() {
		return prec;
	}
	public void setPrec(Integer prec) {
		this.prec = prec;
	}
	public Integer getAtt() {
		return att;
	}
	public void setAtt(Integer att) {
		this.att = att;
	}
	public Integer getDef() {
		return def;
	}
	public void setDef(Integer def) {
		this.def = def;
	}
	public Integer getMr() {
		return mr;
	}
	public void setMr(Integer mr) {
		this.mr = mr;
	}
	public Integer getMor() {
		return mor;
	}
	public void setMor(Integer mor) {
		this.mor = mor;
	}
	public Integer getWpn1() {
		return wpn1;
	}
	public void setWpn1(Integer wpn1) {
		this.wpn1 = wpn1;
	}
	public Integer getWpn2() {
		return wpn2;
	}
	public void setWpn2(Integer wpn2) {
		this.wpn2 = wpn2;
	}
	public Integer getWpn3() {
		return wpn3;
	}
	public void setWpn3(Integer wpn3) {
		this.wpn3 = wpn3;
	}
	public Integer getWpn4() {
		return wpn4;
	}
	public void setWpn4(Integer wpn4) {
		this.wpn4 = wpn4;
	}
	public Integer getWpn5() {
		return wpn5;
	}
	public void setWpn5(Integer wpn5) {
		this.wpn5 = wpn5;
	}
	public Integer getWpn6() {
		return wpn6;
	}
	public void setWpn6(Integer wpn6) {
		this.wpn6 = wpn6;
	}
	public Integer getWpn7() {
		return wpn7;
	}
	public void setWpn7(Integer wpn7) {
		this.wpn7 = wpn7;
	}
	public Integer getArmor1() {
		return armor1;
	}
	public void setArmor1(Integer armor1) {
		this.armor1 = armor1;
	}
	public Integer getArmor2() {
		return armor2;
	}
	public void setArmor2(Integer armor2) {
		this.armor2 = armor2;
	}
	public Integer getArmor3() {
		return armor3;
	}
	public void setArmor3(Integer armor3) {
		this.armor3 = armor3;
	}
	public Integer getBasecost() {
		return basecost;
	}
	public void setBasecost(Integer basecost) {
		this.basecost = basecost;
	}
	public Integer getRcost() {
		return rcost;
	}
	public void setRcost(Integer rcost) {
		this.rcost = rcost;
	}
	public Integer getRpcost() {
		return rpcost;
	}
	public void setRpcost(Integer rpcost) {
		this.rpcost = rpcost;
	}
	public List<Attribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}
}
