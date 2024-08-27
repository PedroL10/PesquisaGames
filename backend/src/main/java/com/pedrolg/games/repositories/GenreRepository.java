package com.pedrolg.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrolg.games.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
