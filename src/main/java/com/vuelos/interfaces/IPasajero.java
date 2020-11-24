package com.vuelos.interfaces;

import java.util.List;

import com.vuelos.model.Pasajero;

public interface IPasajero {
	
	public List<Pasajero> consultar();
	public Object consultarPorId(Integer idPasajero);
	public void crear(Pasajero pasajero);
	public Pasajero actualizar(Pasajero pasajero);
	public void eliminar(Integer idPasajero);
	
}
