package com.vuelos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Avion {

	@Id
	private String matricula;
	
	@Column(name = "modelo", length = 45, nullable = false)
	private String modelo;

	@Column(name = "capacidad", nullable = false)
	private int capacidad;

	@Column(name = "fabricante", length = 45, nullable = false)
	private String fabricante;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
