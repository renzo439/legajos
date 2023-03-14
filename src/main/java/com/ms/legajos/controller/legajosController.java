package com.ms.legajos.controller;

import com.ms.legajos.LegajosApi;
import com.ms.legajos.model.ConsultaLegajos;
import com.ms.legajos.model.Legajos;
import com.ms.legajos.repositorio.LegajosRepository;
import com.ms.legajos.services.LegajosService;
import com.ms.legajos.services.impl.LegajosServiceImpl;
import io.swagger.annotations.Api;

import org.apache.catalina.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;
import java.util.List;

@RestController
@Path("/Legajos")
@Api(value = "User Management System", description = "Operations pertaining to user in User Management System")
public class legajosController implements LegajosApi {
    @Autowired
    private final LegajosServiceImpl service;


    public legajosController(LegajosServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/legajos")
    public List<Legajos> getLegajos() {

        return service.getLegajos();
    }

    @Override
    public ResponseEntity<ConsultaLegajos> getConsultaLegajos(String idLegajos) {

        return service.getConsultaLegajos();
    }

}
