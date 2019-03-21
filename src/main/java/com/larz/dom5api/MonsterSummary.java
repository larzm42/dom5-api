package com.larz.dom5api;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@Entity
@Table(name="monster")
@JsonInclude(Include.NON_NULL)
public class MonsterSummary {
	
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
	private Integer basecost;
	private Integer rcost;
	private Integer rpcost;
	
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
}
