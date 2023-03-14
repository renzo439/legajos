package com.ms.legajos.services;


import com.ms.legajos.model.ConsultaLegajos;
import com.ms.legajos.model.Legajos;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LegajosService {
    ResponseEntity<ConsultaLegajos> getConsultaLegajos();

    List<Legajos> getLegajos();
}
