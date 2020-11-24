package com.vuelos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.model.Pasajero;
import com.vuelos.repo.IPasajeroRepo;
import com.vuelos.service.PasajeroService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class PasajeroController {
	
	
	@Autowired
	private PasajeroService pasajeroService;
	
	@GetMapping("/consultar")
	public List<Pasajero> listarPasajeros(){
		return pasajeroService.listar();
	}
	
	
	//private IPasajeroRepo repo;
	
	
	
	/*
	 * @PostMapping("/crear") public void crearPasajero(@RequestBody Pasajero
	 * pasajero) { repo.save(pasajero); }
	 * 
	 * @GetMapping("/consultar") public List<Pasajero> consultarTodos() { return
	 * repo.findAll(); }
	 * 
	 * @GetMapping("/consultar/{id}") public Object
	 * consultarPasajeroPorId(@PathVariable("id") Integer id) { return
	 * repo.findById(id); }
	 * 
	 * @DeleteMapping("/eliminar/{id}") public void
	 * eliminarPasajero(@PathVariable("id") Integer id) { repo.deleteById(id); }
	 * 
	 */
	
}
