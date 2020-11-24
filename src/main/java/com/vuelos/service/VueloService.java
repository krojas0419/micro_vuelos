package com.vuelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vuelos.interfaces.IVuelo;
import com.vuelos.model.Vuelo;
import com.vuelos.repo.IVueloRepo;

@Service
public class VueloService implements IVuelo {

	@Autowired
	private IVueloRepo repo;

	@Override
	public List<Vuelo> consultarVuelos() {

		return repo.findAll();
	}

}
