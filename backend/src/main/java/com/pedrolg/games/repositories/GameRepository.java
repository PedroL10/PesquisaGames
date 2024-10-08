package com.pedrolg.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedrolg.games.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
