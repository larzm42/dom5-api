package com.larz.dom5api;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MonsterRepository extends JpaRepository<Monster, Long> {
	public List<Monster> findByName(String name);
	public Page<Monster> findByName(String name, Pageable page);
	public List<Monster> findByName(String name, Sort sort);
	public List<Monster> findByAp(Integer ap);
	public Page<Monster> findByAp(Integer ap, Pageable page);
	public List<Monster> findByAp(Integer ap, Sort sort);
	public List<Monster> findByApLessThan(Integer ap);
	public Page<Monster> findByApLessThan(Integer ap, Pageable page);
	public List<Monster> findByApLessThan(Integer ap, Sort sort);
	public List<Monster> findByApGreaterThan(Integer ap);
	public Page<Monster> findByApGreaterThan(Integer ap, Pageable page);
	public List<Monster> findByApGreaterThan(Integer ap, Sort sort);

}
