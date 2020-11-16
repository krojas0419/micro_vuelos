package com.vuelos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.model.Vuelo;
import com.vuelos.repo.IVueloRepo;


@RestController
public class VueloController {

	@Autowired
	private IVueloRepo repo;
	
	@GetMapping("/consultarVuelos")
	public List<Vuelo> consultarTodosLosVuelos() {
		return repo.findAll();
		
	}
}
