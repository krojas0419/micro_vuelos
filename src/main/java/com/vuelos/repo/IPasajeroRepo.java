package com.vuelos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuelos.model.Pasajero;

public interface IPasajeroRepo extends JpaRepository<Pasajero, Integer>{

	
}
