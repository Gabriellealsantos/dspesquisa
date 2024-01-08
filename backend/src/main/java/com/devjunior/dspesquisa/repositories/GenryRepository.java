package com.devjunior.dspesquisa.repositories;

import com.devjunior.dspesquisa.entities.Game;
import com.devjunior.dspesquisa.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenryRepository extends JpaRepository<Genre, Long> {


}
