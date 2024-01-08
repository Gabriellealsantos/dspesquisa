package com.devjunior.dspesquisa.repositories;

import com.devjunior.dspesquisa.entities.Game;
import com.devjunior.dspesquisa.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {


}
