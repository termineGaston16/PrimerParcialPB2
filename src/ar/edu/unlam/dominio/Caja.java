package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Caja extends PuestoDeTrabajo{

	private Integer idDeCaja;
	private Double montoActualDeLaCaja;
	private Integer cantidadDePedidosRealizados;
	
	
	public Caja(EstadoDelPuesto estadoDelPuesto, Integer cantidadMaximaDeEmpleadosParaEstePuesto, Integer idDelPuesto,
			Integer idDeCaja, Double montoActualDeLaCaja, Integer cantidadDePedidosRealizados) {
		super(estadoDelPuesto, cantidadMaximaDeEmpleadosParaEstePuesto, idDelPuesto);
		this.idDeCaja = idDeCaja;
		this.montoActualDeLaCaja = montoActualDeLaCaja;
		this.cantidadDePedidosRealizados = cantidadDePedidosRealizados;
	}

	public Integer getIdDeCaja() {
		return idDeCaja;
	}

	public void setIdDeCaja(Integer idDeCaja) {
		this.idDeCaja = idDeCaja;
	}

	public Double getMontoActualDeLaCaja() {
		return montoActualDeLaCaja;
	}

	public void setMontoActualDeLaCaja(Double montoActualDeLaCaja) {
		this.montoActualDeLaCaja = montoActualDeLaCaja;
	}

	public Integer getCantidadDePedidosRealizados() {
		return cantidadDePedidosRealizados;
	}

	public void setCantidadDePedidosRealizados(Integer cantidadDePedidosRealizados) {
		this.cantidadDePedidosRealizados = cantidadDePedidosRealizados;
	}


	
	public void asignarCajero() {
		
	}
	
	public void ingresarAlSistemaElDineroRecaudado() {
		
	}

	public Boolean agregarUnaCamara(CamaraDeSeguridad camara) {
		return this.listaDeCamarasAsignadasAEstePuestoDeTrabajo.add(camara);
		
	}

	public void activarODesactivarCamaraEnCaja(int idDeCamaraDeSeguridad) {
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

	public void agregarUnEmpleadoAEstePuestoDeTrabajo(Empleado empleadoAsignado) {
		Integer cantidadDeCamarasEnTotal=this.listaDeCamarasAsignadasAEstePuestoDeTrabajo.size();
		Integer cantidadTotalDeCamarasPrendidas=0;
		
		for (CamaraDeSeguridad camaraDeSeguridad : listaDeCamarasAsignadasAEstePuestoDeTrabajo) {
			if (camaraDeSeguridad.getEstaPrendida()) {
				cantidadTotalDeCamarasPrendidas++;
			}
		}
		
		if (cantidadTotalDeCamarasPrendidas.equals(cantidadDeCamarasEnTotal)&&this.listaDeEmpleadosAsignadosAEstePuestoDeTrabajo.size()<this.cantidadMaximaDeEmpleadosParaEstePuesto&&this.estadoDelPuesto.equals(EstadoDelPuesto.SEGURO)||this.estadoDelPuesto.equals(EstadoDelPuesto.EN_REPARACION)) {
			this.listaDeEmpleadosAsignadosAEstePuestoDeTrabajo.add(empleadoAsignado);
		}
		
	}
	
	
	
	
	
	
}
