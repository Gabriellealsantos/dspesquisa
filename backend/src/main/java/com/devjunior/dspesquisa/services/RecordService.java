package com.devjunior.dspesquisa.services;

import com.devjunior.dspesquisa.dto.RecordDTO;
import com.devjunior.dspesquisa.dto.RecordInsertDTO;
import com.devjunior.dspesquisa.entities.Game;
import com.devjunior.dspesquisa.entities.Record;
import com.devjunior.dspesquisa.repositories.GameRepository;
import com.devjunior.dspesquisa.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class RecordService {

    @Autowired
    private RecordRepository repository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public RecordDTO insert(RecordInsertDTO dto) {
        Record entity = new Record();

        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setMoment(Instant.now());

        Game game = gameRepository.getOne(dto.getGameId());
        entity.setGame(game);

        entity = repository.save(entity);
        return new RecordDTO(entity);
    }

    @Transactional
    public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
        return repository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
    }
}
