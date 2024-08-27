package com.pedrolg.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrolg.games.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
