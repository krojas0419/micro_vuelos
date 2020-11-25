package com.vuelos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.model.Vuelo;
import com.vuelos.service.VueloService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class VueloController {

	@Autowired
	private VueloService vueloService;
	
	@GetMapping("/consultarVuelos")
	public List<Vuelo> consultarTodosLosVuelos() {
		return vueloService.consultarVuelos();
		
	}
}
