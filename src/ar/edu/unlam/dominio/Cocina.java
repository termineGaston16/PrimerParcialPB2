package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Cocina extends PuestoDeTrabajo{

	
	private Boolean laCocinaEstaEstable;
	
	public Cocina(EstadoDelPuesto estadoDelPuesto, Integer cantidadMaximaDeEmpleadosParaEstePuesto, Integer idDelPuesto,
			Boolean laCocinaEstaEstable) {
		super(estadoDelPuesto, cantidadMaximaDeEmpleadosParaEstePuesto, idDelPuesto);
		this.laCocinaEstaEstable = laCocinaEstaEstable;
	}

	public Boolean getLaCocinaEstaEstable() {
		return laCocinaEstaEstable;
	}

	public void setLaCocinaEstaEstable(Boolean laCocinaEstaEstable) {
		this.laCocinaEstaEstable = laCocinaEstaEstable;
	}

	
	
	
	
	
	
}
