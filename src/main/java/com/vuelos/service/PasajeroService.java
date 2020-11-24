package com.vuelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vuelos.interfaces.IPasajero;
import com.vuelos.model.Pasajero;
import com.vuelos.repo.IPasajeroRepo;

@Service
public class PasajeroService implements IPasajero {

	@Autowired
	private IPasajeroRepo repo;

	@Override
	public List<Pasajero> consultar() {
		return repo.findAll();
	}

	@Override
	public Object consultarPorId(Integer idPasajero) {
		return repo.findById(idPasajero);
	}

	@Override
	public void crear(Pasajero pasajero) {
		repo.save(pasajero);

	}

	@Override
	public Pasajero actualizar(Pasajero pasajero) {
		return repo.save(pasajero);
	}

	@Override
	public void eliminar(Integer idPasajero) {
		repo.deleteById(idPasajero);

	}

}
