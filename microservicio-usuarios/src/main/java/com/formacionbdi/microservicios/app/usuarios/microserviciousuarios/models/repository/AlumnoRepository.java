package com.formacionbdi.microservicios.app.usuarios.microserviciousuarios.models.repository;

import com.formaciobdi.microservicios.app.commons.alumnos.models.entity.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface AlumnoRepository extends PagingAndSortingRepository<Alumno, Long> {


    @Query("select a from Alumno a where a.nombre like %?1% or a.apellido like %?1%")
    public List<Alumno> findByNombreOrApellido(String term);}
