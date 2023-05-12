package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.HashSet;

public class Lobby extends PuestoDeTrabajo{

	private Integer cantidadDeMesas;
	private Boolean esteLobbyEstaLimpio;

	
	
	public Lobby(EstadoDelPuesto estadoDelPuesto, Integer cantidadMaximaDeEmpleadosParaEstePuesto, Integer idDelPuesto,
			Integer cantidadDeMesas, Boolean esteLobbyEstaLimpio) {
		super(estadoDelPuesto, cantidadMaximaDeEmpleadosParaEstePuesto, idDelPuesto);
		this.cantidadDeMesas = cantidadDeMesas;
		this.esteLobbyEstaLimpio = esteLobbyEstaLimpio;
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

	
	
	public boolean brindarEstadoDeLimpieza() {
		return false;
	}

	public void agregarUnEmpleadoAEstePuestoDeTrabajo(Empleado empleadoAsignado) {
		if (this.listaDeEmpleadosAsignadosAEstePuestoDeTrabajo.size()<this.getCantidadMaximaDeEmpleadosParaEstePuesto()) {
			this.listaDeEmpleadosAsignadosAEstePuestoDeTrabajo.add(empleadoAsignado);
		}
	}
	
	
	
	
	
	
}
