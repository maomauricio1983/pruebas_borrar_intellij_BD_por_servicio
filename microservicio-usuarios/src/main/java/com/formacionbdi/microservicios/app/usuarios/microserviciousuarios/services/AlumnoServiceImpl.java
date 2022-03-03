package com.formacionbdi.microservicios.app.usuarios.microserviciousuarios.services;

import com.formaciobdi.microservicios.app.commons.alumnos.models.entity.Alumno;
import com.formacionbdi.microservicios.app.commons.service.CommonServiceImpl;
import com.formacionbdi.microservicios.app.usuarios.microserviciousuarios.models.repository.AlumnoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {


    @Override
    @Transactional(readOnly = true)
    public List<Alumno> findByNombreOrApellido(String term) {
        return repository.findByNombreOrApellido(term);
    }
}
