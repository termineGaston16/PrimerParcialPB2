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

	public Boolean agregarUnEmpleadoAEstePuestoDeTrabajo(Empleado empleadoAsignado) {
		if (this.laCocinaEstaEstable&&this.estadoDelPuesto.equals(EstadoDelPuesto.SEGURO)||this.estadoDelPuesto.equals(EstadoDelPuesto.EN_REPARACION)&&this.listaDeEmpleadosAsignadosAEstePuestoDeTrabajo.size()<this.cantidadMaximaDeEmpleadosParaEstePuesto) {
		this.listaDeEmpleadosAsignadosAEstePuestoDeTrabajo.add(empleadoAsignado);
		return true;
		}
		return false;
		
	}


	public Boolean agregarUnaCamara(CamaraDeSeguridad camara) {
		return this.listaDeCamarasAsignadasAEstePuestoDeTrabajo.add(camara);

	}


	public void activarODesactivarCamaraEnCocina(int idDeCamaraDeSeguridad) {
		for (CamaraDeSeguridad camaraDeSeguridad : listaDeCamarasAsignadasAEstePuestoDeTrabajo) {
			if (camaraDeSeguridad.getIdDeCamara().equals(idDeCamaraDeSeguridad)) {
			if (!camaraDeSeguridad.getEstaPrendida()) {
			camaraDeSeguridad.setEstaPrendida(true);
			}else {
			camaraDeSeguridad.setEstaPrendida(false);
			}
		}
	}
		
	}
	
}
