package com.ms.legajos.services.impl;


import com.ms.legajos.model.ConsultaLegajos;
import com.ms.legajos.model.Legajos;
import com.ms.legajos.repositorio.LegajosRepository;
import com.ms.legajos.services.LegajosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegajosServiceImpl implements LegajosService {
    @Autowired
    private LegajosRepository legajosRepository;

    public LegajosServiceImpl(LegajosRepository legajosRepository) {
        this.legajosRepository = legajosRepository;
    }

    @Override
    public ResponseEntity<ConsultaLegajos> getConsultaLegajos() {

        return new ResponseEntity<ConsultaLegajos>(HttpStatus.OK);
    }
    @Override
    public List<Legajos> getLegajos() {
        return legajosRepository.findAll();
    }
}
