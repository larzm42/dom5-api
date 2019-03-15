package com.larz.dom5api;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonsterSummaryRepository extends JpaRepository<MonsterSummary, Long> {
	public List<MonsterSummary> findByName(String name);
	public Page<MonsterSummary> findByName(String name, Pageable page);
	public List<MonsterSummary> findByName(String name, Sort sort);
	public List<MonsterSummary> findByAp(Integer ap);
	public Page<MonsterSummary> findByAp(Integer ap, Pageable page);
	public List<MonsterSummary> findByAp(Integer ap, Sort sort);
	public List<MonsterSummary> findByApLessThan(Integer ap);
	public Page<MonsterSummary> findByApLessThan(Integer ap, Pageable page);
	public List<MonsterSummary> findByApLessThan(Integer ap, Sort sort);
	public List<MonsterSummary> findByApGreaterThan(Integer ap);
	public Page<MonsterSummary> findByApGreaterThan(Integer ap, Pageable page);
	public List<MonsterSummary> findByApGreaterThan(Integer ap, Sort sort);
}
