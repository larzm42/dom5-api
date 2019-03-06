package com.example;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MonsterSummaryRepository extends JpaRepository<MonsterSummary, Long> {

}
