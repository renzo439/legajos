package com.ms.legajos.services;


import com.ms.legajos.model.ConsultaLegajos;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface LegajosService {
    ResponseEntity<ConsultaLegajos> getConsultaLegajos();
}
