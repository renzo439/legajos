package com.ms.legajos.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "legajos")
public class Legajos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "legaId")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "documento")
    private String documento;
    @Column(name = "cuil")
    private String cuil;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fechaNacimiento")
    private String fechaNacimiento;
    @Column(name = "sexo")
    private String sexo;
    // getters y setters
}
