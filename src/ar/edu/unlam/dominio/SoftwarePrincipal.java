package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class SoftwarePrincipal {
	
	private String nombreDelSoftware;
	private HashSet<Empleado> listaDeEmpleados;
	private LinkedList<PuestoDeTrabajo> listaDeZonasDeTrabajo;
	/*private HashSet<TrabajoRegistrado> trabajosRegistrados;*/
	private HashSet<Menu> listaDeMenues;
	private Double recaudacion;

	

	public SoftwarePrincipal(String nombreDelSoftware) {
		this.nombreDelSoftware = nombreDelSoftware;
		this.listaDeEmpleados = new HashSet<>();
		this.listaDeZonasDeTrabajo = new LinkedList<>();
		this.listaDeMenues = new HashSet<>();
		/*this.trabajosRegistrados=new HashSet<>();*/
		this.recaudacion=0.0;
	}




	public String getNombreDelSoftware() {
		return nombreDelSoftware;
	}

	public void setNombreDelSoftware(String nombreDelSoftware) {
		this.nombreDelSoftware = nombreDelSoftware;
	}

	public HashSet<Empleado> getListaDeEmpleados() {
		return listaDeEmpleados;
	}

	public void setListaDeEmpleados(HashSet<Empleado> listaDeEmpleados) {
		this.listaDeEmpleados = listaDeEmpleados;
	}
	public LinkedList<PuestoDeTrabajo> getListaDeZonasDeTrabajo() {
		return listaDeZonasDeTrabajo;
	}
	public void setListaDeZonasDeTrabajo(LinkedList<PuestoDeTrabajo> listaDeZonasDeTrabajo) {
		this.listaDeZonasDeTrabajo = listaDeZonasDeTrabajo;
	}
	public HashSet<Menu> getListaDeMenues() {
		return listaDeMenues;
	}
	public void setListaDeMenues(HashSet<Menu> listaDeMenues) {
		this.listaDeMenues = listaDeMenues;
	}
	public Double getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(Double recaudacion) {
		this.recaudacion = recaudacion;
	}




	public void agregarUnEmpleadoAlSistema(Empleado empleado) {
		this.listaDeEmpleados.add(empleado);
	}

	public int cantidadDeEmpleadosRegistrados() {
		return this.listaDeEmpleados.size();
	}

	public void agregarUnPuestoDeTrabajo(PuestoDeTrabajo puesto) {
		this.listaDeZonasDeTrabajo.add(puesto);
	}


	public int cantidadDePuestosDeTrabajosAgregados() {
		return this.listaDeZonasDeTrabajo.size();
	}


	public Empleado buscarEmpleadoEnElSistema(int idDelEmpelado) {
		for (Empleado empleado : listaDeEmpleados) {
			if (empleado.getId().equals(idDelEmpelado)) {
				return empleado;
			}
		}
		return null;
	}

	public Lobby buscarPuestoDeTrabajoLobbyEnElSistema(int idDelPuestoDeTrabajo) {
		for (PuestoDeTrabajo puestoDeTrabajo : listaDeZonasDeTrabajo) {
			if (puestoDeTrabajo.getClass().equals(Lobby.class)&&puestoDeTrabajo.getIdDelPuesto().equals(idDelPuestoDeTrabajo)) {
				return (Lobby) puestoDeTrabajo;
			}
		}
		return null;
	}

	public int cantidadDeEmpleadosAsignadosEnElLobby(int idDelPuestoDeTrabajo) {
		for (PuestoDeTrabajo puestoDeTrabajo : listaDeZonasDeTrabajo) {
			if (puestoDeTrabajo.getClass().equals(Lobby.class)&&puestoDeTrabajo.getIdDelPuesto().equals(idDelPuestoDeTrabajo)) {
				return puestoDeTrabajo.getListaDeEmpleadosAsignadosAEstePuestoDeTrabajo().size();
			}
		}
		return 0;
	}




	
	public Caja buscarPuestoDeTrabajoCajaEnElSistema(int idDePuestoDeTrabajo) {
		for (PuestoDeTrabajo puestoDeTrabajo : listaDeZonasDeTrabajo) {
			if (puestoDeTrabajo.getClass().equals(Caja.class)&&puestoDeTrabajo.getIdDelPuesto().equals(idDePuestoDeTrabajo)) {
				return (Caja) puestoDeTrabajo;
			}
		}
		return null;
	}




	public Object cantidadDeEmpleadosAsignadosEnCaja(int idDelPuestoDeTrabajo) {
		for (PuestoDeTrabajo puestoDeTrabajo : listaDeZonasDeTrabajo) {
			if (puestoDeTrabajo.getClass().equals(Caja.class)&&puestoDeTrabajo.getIdDelPuesto().equals(idDelPuestoDeTrabajo)) {
				return puestoDeTrabajo.getListaDeEmpleadosAsignadosAEstePuestoDeTrabajo().size();
			}
		}
		return 0;
	}









	

	
	
	
	
	
	

}
