package com.vuelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vuelos.interfaces.IPasajero;
import com.vuelos.model.Pasajero;
import com.vuelos.repo.IPasajeroRepo;

@Service
public class PasajeroService implements IPasajero{
	
	@Autowired
	private IPasajeroRepo repo;

	@Override
	public List<Pasajero> listar() {
		return repo.findAll();
	}
	
}
