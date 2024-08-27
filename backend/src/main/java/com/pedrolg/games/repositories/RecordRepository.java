package com.pedrolg.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedrolg.games.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

}
