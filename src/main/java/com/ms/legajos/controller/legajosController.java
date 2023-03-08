package com.ms.legajos.controller;

import com.ms.legajos.LegajosApi;
import com.ms.legajos.model.ConsultaLegajos;
import com.ms.legajos.services.LegajosService;
import io.swagger.annotations.Api;

import org.apache.catalina.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;
import java.util.List;


//@Controller
//@RequiredArgsConstructor
//@Path("/Legajos")

@RestController
@Path("/Legajos")
@Api(value = "User Management System", description = "Operations pertaining to user in User Management System")
public class legajosController implements LegajosApi {

    private final LegajosService service;

    public legajosController(LegajosService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return null;
    }

    @Override
    public ResponseEntity<ConsultaLegajos> getConsultaLegajos(String idLegajos) {
        return service.getConsultaLegajos();
    }

}
