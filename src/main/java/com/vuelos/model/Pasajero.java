package com.vuelos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pasajero {
	
	@Id
	private int identificacion;
	
	@Column(name="nombre", length = 45, nullable = false)
	private String nombre;
	
	@Column(name="apellidos", length = 45, nullable = false)
	private String apellidos;
	
	@Column(name="direccion", length = 45, nullable = false)
	private String direccion;
	
	@Column(name="telefono", length = 45, nullable = false)
	private String telefono;

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
