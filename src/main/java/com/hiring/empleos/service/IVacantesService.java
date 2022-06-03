package com.hiring.empleos.service;

import java.util.List;
import com.hiring.model.Vacante;

public interface IVacantesService {
	List<Vacante> buscarTodas();
	Vacante buscarPoId(Integer idVacante);
}
