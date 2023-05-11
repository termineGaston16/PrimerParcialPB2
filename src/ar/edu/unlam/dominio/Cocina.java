package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Cocina extends PuestoDeTrabajo{

	
	private Boolean laCocinaEstaEstable;
	private ArrayList<CamaraDeSeguridad> listaDeCamarasSeguridadEnEstePuesto;
	
	public Cocina(EstadoDelPuesto estadoDelPuesto, Integer cantidadMaximaDeEmpleadosParaEstePuesto, Integer idDelPuesto,
			Boolean laCocinaEstaEstable, ArrayList<CamaraDeSeguridad> listaDeCamarasSeguridadEnEstePuesto) {
		super(estadoDelPuesto, cantidadMaximaDeEmpleadosParaEstePuesto, idDelPuesto);
		this.laCocinaEstaEstable = laCocinaEstaEstable;
		this.listaDeCamarasSeguridadEnEstePuesto = listaDeCamarasSeguridadEnEstePuesto;
	}

	public Boolean getLaCocinaEstaEstable() {
		return laCocinaEstaEstable;
	}

	public void setLaCocinaEstaEstable(Boolean laCocinaEstaEstable) {
		this.laCocinaEstaEstable = laCocinaEstaEstable;
	}

	public ArrayList<CamaraDeSeguridad> getListaDeCamarasSeguridadEnEstePuesto() {
		return listaDeCamarasSeguridadEnEstePuesto;
	}

	public void setListaDeCamarasSeguridadEnEstePuesto(ArrayList<CamaraDeSeguridad> listaDeCamarasSeguridadEnEstePuesto) {
		this.listaDeCamarasSeguridadEnEstePuesto = listaDeCamarasSeguridadEnEstePuesto;
	}
	
	
	
	
	
	
}
