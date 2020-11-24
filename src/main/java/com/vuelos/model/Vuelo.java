package com.vuelos.model;

import java.sql.Date;
import java.sql.Time;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Vuelo {

	@Id
	private int idVuelo;

	@Column(name = "fecha", nullable = false)
	private Date fecha;

	@Column(name = "horaSalida", nullable = false)
	private Time horaSalida;

	@Column(name = "horaLlegada", nullable = false)
	private Time horaLlegada;

	@Column(name = "precio", nullable = false)
	private double precio;

	@Column(name = "origen", nullable = false)
	private String origen;

	@Column(name = "destino", nullable = false)
	private String destino;

	@ManyToMany
	@JoinTable(name = "vuelo_pasajero", joinColumns = { @JoinColumn(name = "FK_idvuelo") }, inverseJoinColumns = {
			@JoinColumn(name = "FK_idPasajero") })

	private Set<Pasajero> pasajeros;

	public Vuelo() {
		super();
	}

	public Vuelo(int idVuelo, Date fecha, Time horaSalida, Time horaLlegada, double precio, String origen,
			String destino, Set<Pasajero> pasajeros) {
		super();
		this.idVuelo = idVuelo;
		this.fecha = fecha;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.precio = precio;
		this.origen = origen;
		this.destino = destino;
		this.pasajeros = pasajeros;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Time horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Time getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(Time horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Set<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Set<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

}
