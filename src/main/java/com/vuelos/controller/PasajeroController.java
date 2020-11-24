package com.vuelos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.model.Pasajero;
import com.vuelos.service.PasajeroService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class PasajeroController {

	@Autowired
	private PasajeroService pasajeroService;

	@GetMapping("/consultar")
	public List<Pasajero> consultarPasajeros() {
		return pasajeroService.consultar();
	}

	@GetMapping("/consultar/{id}")
	public Object consultarPasajeroPorId(@PathVariable("id") Integer idPasajero) {
		return pasajeroService.consultarPorId(idPasajero);
	}

	@PostMapping("/crear")
	public void crearPasajero(@RequestBody Pasajero pasajero) {
		pasajeroService.crear(pasajero);
	}

	@PutMapping("/actualizar/{id}")
	public Pasajero actualizarPasajero(@PathVariable("id") Integer idPasajero, @RequestBody Pasajero pasajero) {
		pasajero.setIdentificacion(idPasajero);
		return pasajeroService.actualizar(pasajero);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminarPasajero(@PathVariable("id") Integer idPasajero) {
		pasajeroService.eliminar(idPasajero);
	}

}
