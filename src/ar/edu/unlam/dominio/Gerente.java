package ar.edu.unlam.dominio;

import java.util.Date;
import java.util.HashSet;

public class Gerente extends Empleado{
	
	private Boolean tieneConchera;
	private Integer cantidadDeEmpleadosACargo;
		

	public Gerente(Integer id, String nombre, String apellido, Integer dni, Double sueldo, Boolean tieneConchera,
			Integer cantidadDeEmpleadosACargo) {
		super(id, nombre, apellido, dni, sueldo);
		this.tieneConchera = tieneConchera;
		this.cantidadDeEmpleadosACargo = cantidadDeEmpleadosACargo;
	}
	
	

	public void contratarEmpleado(Empleado empleado, SoftwarePrincipal sf) {
		sf.agregarUnEmpleadoAlSistema(empleado);
	};
	
	public void despedirEmpleado() {
		
	};
	public void suspenderEmpleado() {
		
	};
	
	public void asignarElLaborDeLobbyAUnEmpleado(int idDelEmpelado, int idDelPuestoDeTrabajo, SoftwarePrincipal sf) {
		Empleado empleadoAsignado=sf.buscarEmpleadoEnElSistema(idDelEmpelado);
		Lobby puestoAsignado=sf.buscarPuestoDeTrabajoLobbyEnElSistema(idDelPuestoDeTrabajo);
		
		puestoAsignado.agregarUnEmpleadoAEstePuestoDeTrabajo(empleadoAsignado);
		
		
	};
	
	public void regitrarUnTrabajoRealizado(String idRegistro,String puestoDetrabajo,Enum estadoDelPuesto,HashSet<Empleado>listaDeEmpleado,Date fecha) {
		
	};
	public void pagarSueldoAlEmpleadoEmpleado() {
		
	}

	public void asignarElLaborDeCajaAUnEmpleado(int idDelEmpelado, int idDeCaja, SoftwarePrincipal sf) {
		Empleado empleadoAsignado=sf.buscarEmpleadoEnElSistema(idDelEmpelado);
		Caja puestoAsignado=sf.buscarPuestoDeTrabajoCajaEnElSistema(idDeCaja);
		
		puestoAsignado.agregarUnEmpleadoAEstePuestoDeTrabajo(empleadoAsignado);
		
	}



	public void asignarElLaborDeCocinaAUnEmpleado(int idDelEmpelado, int idDeCocina, SoftwarePrincipal sf) {
		Empleado empleadoAsignado=sf.buscarEmpleadoEnElSistema(idDelEmpelado);
		Cocina puestoAsignado=sf.buscarPuestoDeTrabajoCocinaEnElSistema(idDeCocina);
		
		puestoAsignado.agregarUnEmpleadoAEstePuestoDeTrabajo(empleadoAsignado);
		
	}
	

}
