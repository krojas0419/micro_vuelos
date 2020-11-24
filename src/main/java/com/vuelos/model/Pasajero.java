package com.vuelos.model;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pasajero {

	@Id
	private int identificacion;

	@Column(name = "nombre", length = 45, nullable = false)
	private String nombre;

	@Column(name = "apellidos", length = 45, nullable = false)
	private String apellidos;

	@Column(name = "direccion", length = 45, nullable = false)
	private String direccion;

	@Column(name = "telefono", length = 45, nullable = false)
	private String telefono;

	@JsonIgnore
	@ManyToMany(mappedBy = "pasajeros")
	private Set<Vuelo> vuelos;

	public Pasajero() {
		super();
	}

	public Pasajero(int identificacion, String nombre, String apellidos, String direccion, String telefono,
			Set<Vuelo> vuelos) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.vuelos = vuelos;
	}

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

	public Set<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(Set<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public String toString() {
		return "Pasajero [identificacion=" + identificacion + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", vuelos=" + vuelos + "]";
	}

}
