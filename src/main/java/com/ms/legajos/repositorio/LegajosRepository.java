package com.ms.legajos.repositorio;

import com.ms.legajos.model.Legajos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LegajosRepository extends JpaRepository<Legajos, Integer> {
    List<Legajos> findAll();
}
