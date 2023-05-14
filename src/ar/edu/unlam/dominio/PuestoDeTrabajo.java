package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.HashSet;

public class PuestoDeTrabajo {
	
	protected EstadoDelPuesto estadoDelPuesto;
	protected Integer cantidadMaximaDeEmpleadosParaEstePuesto;
	protected Integer idDelPuesto;
	protected HashSet<Empleado> listaDeEmpleadosAsignadosAEstePuestoDeTrabajo;
	protected HashSet<CamaraDeSeguridad> listaDeCamarasAsignadasAEstePuestoDeTrabajo;
	
	
	public PuestoDeTrabajo(EstadoDelPuesto estadoDelPuesto, Integer cantidadMaximaDeEmpleadosParaEstePuesto,
			Integer idDelPuesto) {
		super();
		this.estadoDelPuesto = estadoDelPuesto;
		this.cantidadMaximaDeEmpleadosParaEstePuesto = cantidadMaximaDeEmpleadosParaEstePuesto;
		this.idDelPuesto = idDelPuesto;
		this.listaDeEmpleadosAsignadosAEstePuestoDeTrabajo=new HashSet<>();
		this.listaDeCamarasAsignadasAEstePuestoDeTrabajo=new HashSet<>();
		
	}

	
	public HashSet<Empleado> getListaDeEmpleadosAsignadosAEstePuestoDeTrabajo() {
		return listaDeEmpleadosAsignadosAEstePuestoDeTrabajo;
	}


	public void setListaDeEmpleadosAsignadosAEstePuestoDeTrabajo(
			HashSet<Empleado> listaDeEmpleadosAsignadosAEstePuestoDeTrabajo) {
		this.listaDeEmpleadosAsignadosAEstePuestoDeTrabajo = listaDeEmpleadosAsignadosAEstePuestoDeTrabajo;
	}


	public HashSet<CamaraDeSeguridad> getListaDeCamarasAsignadasAEstePuestoDeTrabajo() {
		return listaDeCamarasAsignadasAEstePuestoDeTrabajo;
	}


	public void setListaDeCamarasAsignadasAEstePuestoDeTrabajo(
			HashSet<CamaraDeSeguridad> listaDeCamarasAsignadasAEstePuestoDeTrabajo) {
		this.listaDeCamarasAsignadasAEstePuestoDeTrabajo = listaDeCamarasAsignadasAEstePuestoDeTrabajo;
	}


	public EstadoDelPuesto getEstadoDelPuesto() {
		if(listaDeCamarasAsignadasAEstePuestoDeTrabajo.size() == 0) {
			return estadoDelPuesto.INSEGURO;
		}
		return estadoDelPuesto.SEGURO;
	}

	public void setEstadoDelPuesto(EstadoDelPuesto estadoDelPuesto) {
		this.estadoDelPuesto = estadoDelPuesto;
	}

	public Integer getCantidadMaximaDeEmpleadosParaEstePuesto() {
		return cantidadMaximaDeEmpleadosParaEstePuesto;
	}

	public void setCantidadMaximaDeEmpleadosParaEstePuesto(Integer cantidadMaximaDeEmpleadosParaEstePuesto) {
		this.cantidadMaximaDeEmpleadosParaEstePuesto = cantidadMaximaDeEmpleadosParaEstePuesto;
	}

	public Integer getIdDelPuesto() {
		return idDelPuesto;
	}

	public void setIdDelPuesto(Integer idDelPuesto) {
		this.idDelPuesto = idDelPuesto;
	}
	

	
	
	
	
}
