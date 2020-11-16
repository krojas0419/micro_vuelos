package com.vuelos.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Vuelo {

	@Id
	private int idVuelo;

	@Column(name = "precio", nullable = false)
	private double precio;

	@Column(name = "hora_salida", nullable = false)
	private Time hora_salida;

	@Column(name = "hora_llegada", nullable = false)
	private Time hora_llegada;

	@Column(name = "fecha", nullable = false)
	private Date fecha;

	@ManyToOne
	@JoinColumn(name = "avion")
	private Avion avion;

	@ManyToOne
	@JoinColumn(name = "eropuerto_origen")
	private Aeropuerto aeropuerto_origen;

	@ManyToOne
	@JoinColumn(name = "eropuerto_destino")
	private Aeropuerto aeropuerto_destino;

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Time getHora_salida() {
		return hora_salida;
	}

	public void setHora_salida(Time hora_salida) {
		this.hora_salida = hora_salida;
	}

	public Time getHora_llegada() {
		return hora_llegada;
	}

	public void setHora_llegada(Time hora_llegada) {
		this.hora_llegada = hora_llegada;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Aeropuerto getAeropuerto_origen() {
		return aeropuerto_origen;
	}

	public void setAeropuerto_origen(Aeropuerto aeropuerto_origen) {
		this.aeropuerto_origen = aeropuerto_origen;
	}

	public Aeropuerto getAeropuerto_destino() {
		return aeropuerto_destino;
	}

	public void setAeropuerto_destino(Aeropuerto aeropuerto_destino) {
		this.aeropuerto_destino = aeropuerto_destino;
	}

}
