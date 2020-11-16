package com.vuelos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuelos.model.Vuelo;

public interface IVueloRepo extends JpaRepository<Vuelo, Integer> {

}
