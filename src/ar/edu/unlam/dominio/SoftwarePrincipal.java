package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class SoftwarePrincipal {
	
	private String nombreDelSoftware;
	private HashSet<Empleado> listaDeEmpleados;
	private LinkedList<PuestoDeTrabajo> listaDeZonasDeTrabajo;
	/*private ArrayList<TrabajoRegistrado> trabajosRegistrados;*/
	private HashSet<Menu> listaDeMenues;
	private Double recaudacion;


	public SoftwarePrincipal(String nombreDelSoftware) {
		this.nombreDelSoftware=nombreDelSoftware;
	}


	public void agregarUnEmpleadoAlSistema(Empleado empleado) {
		this.listaDeEmpleados.add(empleado);
	}

	public int cantidadDeEmpleadosRegistrados() {
		return this.listaDeEmpleados.size();
	}

	
	
	
	
	
	
	
}
