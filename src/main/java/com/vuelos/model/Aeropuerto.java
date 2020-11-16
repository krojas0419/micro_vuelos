package com.vuelos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aeropuerto {

	@Id
	private String idAeropuerto;

	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;

	@Column(name = "pais", length = 45, nullable = false)
	private String pais;

	@Column(name = "ciudad", length = 45, nullable = false)
	private String ciudad;

	public String getIdAeropuerto() {
		return idAeropuerto;
	}

	public void setIdAeropuerto(String idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

}
