package com.devjunior.dspesquisa.repositories;

import com.devjunior.dspesquisa.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenryRepository extends JpaRepository<Genre, Long> {


}
