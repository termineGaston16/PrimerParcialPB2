package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Lobby extends PuestoDeTrabajo{

	private Integer cantidadDeMesas;
	private Boolean esteLobbyEstaLimpio;
	private ArrayList<CamaraDeSeguridad> listaDeCamaraDeSeguridadDeEstePuestoDeTrabajo;
	
	public Lobby(EstadoDelPuesto estadoDelPuesto, Integer cantidadMaximaDeEmpleadosParaEstePuesto, Integer idDelPuesto,
			Integer cantidadDeMesas, Boolean esteLobbyEstaLimpio,
			ArrayList<CamaraDeSeguridad> listaDeCamaraDeSeguridadDeEstePuestoDeTrabajo) {
		super(estadoDelPuesto, cantidadMaximaDeEmpleadosParaEstePuesto, idDelPuesto);
		this.cantidadDeMesas = cantidadDeMesas;
		this.esteLobbyEstaLimpio = esteLobbyEstaLimpio;
		this.listaDeCamaraDeSeguridadDeEstePuestoDeTrabajo = listaDeCamaraDeSeguridadDeEstePuestoDeTrabajo;
	}

	public Integer getCantidadDeMesas() {
		return cantidadDeMesas;
	}

	public void setCantidadDeMesas(Integer cantidadDeMesas) {
		this.cantidadDeMesas = cantidadDeMesas;
	}

	public Boolean getEsteLobbyEstaLimpio() {
		return esteLobbyEstaLimpio;
	}

	public void setEsteLobbyEstaLimpio(Boolean esteLobbyEstaLimpio) {
		this.esteLobbyEstaLimpio = esteLobbyEstaLimpio;
	}

	public ArrayList<CamaraDeSeguridad> getListaDeCamaraDeSeguridadDeEstePuestoDeTrabajo() {
		return listaDeCamaraDeSeguridadDeEstePuestoDeTrabajo;
	}

	public void setListaDeCamaraDeSeguridadDeEstePuestoDeTrabajo(
			ArrayList<CamaraDeSeguridad> listaDeCamaraDeSeguridadDeEstePuestoDeTrabajo) {
		this.listaDeCamaraDeSeguridadDeEstePuestoDeTrabajo = listaDeCamaraDeSeguridadDeEstePuestoDeTrabajo;
	}
	
	
	public boolean brindarEstadoDeLimpieza() {
		return false;
	}
	
	
	
	
	
	
}
