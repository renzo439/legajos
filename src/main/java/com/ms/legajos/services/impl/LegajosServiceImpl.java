package com.ms.legajos.services.impl;


import com.ms.legajos.model.ConsultaLegajos;
import com.ms.legajos.services.LegajosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LegajosServiceImpl implements LegajosService {

    @Override
    public ResponseEntity<ConsultaLegajos> getConsultaLegajos() {

        return new ResponseEntity<ConsultaLegajos>(HttpStatus.OK);
    }
}
