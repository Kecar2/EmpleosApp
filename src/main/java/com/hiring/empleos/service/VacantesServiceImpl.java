package com.hiring.empleos.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hiring.model.Vacante;

@Service
public class VacantesServiceImpl implements IVacantesService {

	private List<Vacante> lista = null;

	public VacantesServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		lista = new LinkedList<Vacante>();
		try {
			// Creamos la oferta de Trabajo 1.
			Vacante vacante1 = new Vacante();
			vacante1.setId(1);
			vacante1.setNombre("Backend Engineer - Transactions");
			vacante1.setDescripcion(
					"¡Estamos a cargo del feed que cada usuario mira cada vez que inicia sesión en nuestra aplicación! Estamos buscando un ingeniero de back-end para unirse y ayudarnos a construir una experiencia de usuario simple y relevante al capacitar a nuestros usuarios para que participen en sus transacciones, mientras impulsamos una cultura de tutoría e intercambio de conocimientos.");
			vacante1.setFecha(sdf.parse("05-05-2022"));
			vacante1.setSalario(5500.0);
			vacante1.setDestacado(1);
			vacante1.setImagen("empresa1.png");

			// Creamos la oferta de Trabajo 2.
			Vacante vacante2 = new Vacante();
			vacante2.setId(2);
			vacante2.setNombre("Junior Full Stack Developer");
			vacante2.setDescripcion(
					"Estamos buscando nuevos miembros para unirse a nuestros nuevos equipos, que se centrarán en crear nuevos productos para ofrecer a los fanáticos del deporte una experiencia más estimulante.");
			vacante2.setFecha(sdf.parse("05-05-2022"));
			vacante2.setSalario(2000.0);
			vacante2.setDestacado(0);
			vacante2.setImagen("empresa2.png");

			// Creamos la oferta de Trabajo 3.
			Vacante vacante3 = new Vacante();
			vacante3.setId(3);
			vacante3.setNombre("Software Engineer");
			vacante3.setDescripcion(
					"Como desarrollador en Sagins, diseñarás, desarrollarás y entregarás productos o sistemas de alta calidad que superen las expectativas de nuestros clientes. Te unirás a un equipo de desarrollo motivado, talentoso y colaborativo que trabaja con equipos en todo el mundo compartiendo su conocimiento y experiencia.");
			vacante3.setFecha(sdf.parse("05-05-2022"));
			vacante3.setSalario(7000.0);
			vacante3.setDestacado(0);

			// Creamos la oferta de Trabajo 4.
			Vacante vacante4 = new Vacante();
			vacante4.setId(4);
			vacante4.setNombre("Programador/a Junior JAVA/ABAP");
			vacante4.setDescripcion(
					"En EY tendrás la oportunidad de construir una experiencia única. Dispondrás de la última tecnología, estarás rodeado de equipos de alto rendimiento y contarás con el entorno global y la cultura inclusiva que necesitas para descubrir tu potencial. A través de nuestros cursos de formación y mentoring, podrás desarrollar las habilidades necesarias para crecer, a día de hoy y en el futuro; mientras construyes una red de contactos, mentores y líderes que te acompañaran en esta experiencia en EY.");
			vacante4.setFecha(sdf.parse("05-05-2022"));
			vacante4.setSalario(2500.0);
			vacante4.setDestacado(1);
			vacante4.setImagen("empresa4.png");

			/**
			 * Agregamos los 4 objetos de tipo Vacante a la lista...
			 */

			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);
			lista.add(vacante4);

		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	public List<Vacante> buscarTodas() {
		return lista;
	}

	@Override
	public Vacante buscarPoId(Integer idVacante) {

		for (Vacante v : lista) {
			if (v.getId() == idVacante) {
				return v;
			}
		}
		return null;
	}

}
