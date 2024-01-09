package com.devjunior.dspesquisa.resources;

import com.devjunior.dspesquisa.dto.RecordDTO;
import com.devjunior.dspesquisa.dto.RecordInsertDTO;
import com.devjunior.dspesquisa.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/records")
public class RecordResource {
    @Autowired
    private RecordService service;

    @PostMapping
    public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){
        RecordDTO newDTO = service.insert(dto);
        return ResponseEntity.ok().body(newDTO);
    }


}
