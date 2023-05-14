package ar.edu.unlam.dominio;

import java.awt.Adjustable;
import java.util.Date;
import java.util.HashSet;

public class Gerente extends Empleado{
	
	private Boolean tieneCochera;
	private Integer cantidadDeEmpleadosACargo;
		

	public Gerente(Integer id, String nombre, String apellido, Integer dni, Double sueldo, Boolean tieneCochera,
			Integer cantidadDeEmpleadosACargo, EstadoDelEmpleado estadoDelEmpleado) {
		super(id, nombre, apellido, dni, sueldo, estadoDelEmpleado);
		this.tieneCochera = tieneCochera;
		this.cantidadDeEmpleadosACargo = cantidadDeEmpleadosACargo;
	}
	
	

	public Boolean contratarEmpleado(Empleado empleado, SoftwarePrincipal sf) {
		return(sf.agregarUnEmpleadoAlSistema(empleado))?true:false;
		
	};
	
	
	public Boolean asignarElLaborDeLobbyAUnEmpleado(int idDelEmpelado, int idDelPuestoDeTrabajo, SoftwarePrincipal sf) {
		Empleado empleadoAsignado=sf.buscarEmpleadoEnElSistema(idDelEmpelado);
		Lobby puestoAsignado=sf.buscarPuestoDeTrabajoLobbyEnElSistema(idDelPuestoDeTrabajo);
		
		if (empleadoAsignado==null||puestoAsignado==null) {
			return false;
		}
		
		Boolean evaluarAgregarUnEmpleadoAPuestoDeTrabajo=puestoAsignado.agregarUnEmpleadoAEstePuestoDeTrabajo(empleadoAsignado);
		if (evaluarAgregarUnEmpleadoAPuestoDeTrabajo) {
			return true;
		}
		return false;
		
		
	};
	
	public void regitrarUnTrabajoRealizado(String idRegistro,String puestoDetrabajo,Enum estadoDelPuesto,HashSet<Empleado>listaDeEmpleado,Date fecha) {
		
	};
	public Double pagarSueldoAlEmpleado(Empleado empleado, Caja caja) {
		Double total = empleado.adicionarPlus(caja.getCantidadDePedidosRealizados());
		return total;
	}

	public void asignarElLaborDeCajaAUnEmpleado(int idDelEmpelado, int idDeCaja, SoftwarePrincipal sf) {
		Empleado empleadoAsignado=sf.buscarEmpleadoEnElSistema(idDelEmpelado);
		Caja puestoAsignado=sf.buscarPuestoDeTrabajoCajaEnElSistema(idDeCaja);
		
		puestoAsignado.agregarUnEmpleadoAEstePuestoDeTrabajo(empleadoAsignado);
		
	}

	public Boolean asignarElLaborDeCocinaAUnEmpleado(int idDelEmpelado, int idDeCocina, SoftwarePrincipal sf) {
		Empleado empleadoAsignado=sf.buscarEmpleadoEnElSistema(idDelEmpelado);
		Cocina puestoAsignado=sf.buscarPuestoDeTrabajoCocinaEnElSistema(idDeCocina);
		
		if (empleadoAsignado==null||puestoAsignado==null) {
			return false;
		}
		
		Boolean evaluarAsignarPuesto=puestoAsignado.agregarUnEmpleadoAEstePuestoDeTrabajo(empleadoAsignado);
		if (evaluarAsignarPuesto) {
			return true;
		}
		
		return false;
		
	}
	
	public double contabilizarCajas(Caja ... cajas) {
		double montoTotal=0.0;
		for (Caja caja:cajas) {
			montoTotal += caja.getMontoActualDeLaCaja();
		}
		return montoTotal;
		
	}
	
    public void aumentarIngresoEmpleado(Empleado empleado, double aumento) {
        double nuevoSalario = empleado.getSueldo() + aumento;
        empleado.setSueldo(nuevoSalario);
    }
    
	public void suspenderEmpleado(Empleado empleado) {
		if (empleado.getEstadoDelEmpleado().equals(estadoDelEmpleado.LIBRE)) {
			empleado.setEstadoDelEmpleado(estadoDelEmpleado.SUSPENDIDO);
		}
				
		
	};
    
	
	public void despedirEmpleado(Empleado empleado, SoftwarePrincipal softwarePrincipal) {
	      
	      HashSet<Empleado> listaDeEmpleados = softwarePrincipal.getListaDeEmpleados();

	      listaDeEmpleados.remove(empleado);
	   }



	public void pagarEmpleado(Empleado empleado) {
		double sueldoActual=empleado.getSueldo();
		double montoAPagar=800.0;
		if (empleado.getEstadoDelEmpleado().equals(estadoDelEmpleado.LIBRE)){
			empleado.setSueldo(sueldoActual + montoAPagar);
		}
		
	}
    
}
