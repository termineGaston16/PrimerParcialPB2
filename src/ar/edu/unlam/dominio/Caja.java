package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Caja extends PuestoDeTrabajo{

	private Integer idDeCaja;
	private Double montoActualDeLaCama;
	private Integer cantidadDePedidosRealizados;
	
	
	public Caja(EstadoDelPuesto estadoDelPuesto, Integer cantidadMaximaDeEmpleadosParaEstePuesto, Integer idDelPuesto,
			Integer idDeCaja, Double montoActualDeLaCama, Integer cantidadDePedidosRealizados) {
		super(estadoDelPuesto, cantidadMaximaDeEmpleadosParaEstePuesto, idDelPuesto);
		this.idDeCaja = idDeCaja;
		this.montoActualDeLaCama = montoActualDeLaCama;
		this.cantidadDePedidosRealizados = cantidadDePedidosRealizados;
	}

	public Integer getIdDeCaja() {
		return idDeCaja;
	}

	public void setIdDeCaja(Integer idDeCaja) {
		this.idDeCaja = idDeCaja;
	}

	public Double getMontoActualDeLaCama() {
		return montoActualDeLaCama;
	}

	public void setMontoActualDeLaCama(Double montoActualDeLaCama) {
		this.montoActualDeLaCama = montoActualDeLaCama;
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
	
	
	
	
	
	
}
