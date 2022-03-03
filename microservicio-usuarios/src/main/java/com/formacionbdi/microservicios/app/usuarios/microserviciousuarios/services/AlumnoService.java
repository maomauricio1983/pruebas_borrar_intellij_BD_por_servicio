package com.formacionbdi.microservicios.app.usuarios.microserviciousuarios.services;


import com.formaciobdi.microservicios.app.commons.alumnos.models.entity.Alumno;
import com.formacionbdi.microservicios.app.commons.service.CommonService;

import java.util.List;

public interface AlumnoService extends CommonService<Alumno> {

    public List<Alumno> findByNombreOrApellido(String term);


}
