package com.vuelos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.model.Pasajero;
import com.vuelos.repo.IPasajeroRepo;

@RestController
public class PasajeroController {

	@Autowired
	private IPasajeroRepo repo;
	
	@GetMapping("/consultar")
	public List<Pasajero> consultarTodos() {
		return repo.findAll();
	}
	
	@PostMapping("/crear")
	public void crearPasajero(@RequestBody Pasajero pasajero) {
		repo.save(pasajero);
	}
}
