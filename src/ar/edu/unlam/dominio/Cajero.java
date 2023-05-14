package ar.edu.unlam.dominio;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Cajero extends Empleado{
	
	private Double saldoInicialDeCaja;
	
	private List<Menu> pedidos;
		
	public Cajero(Integer id, String nombre, String apellido, Integer dni, Double sueldo, Double saldoInicialDeCaja, EstadoDelEmpleado estadoDelEmpleado) {
		super(id, nombre, apellido, dni, sueldo, estadoDelEmpleado);
		this.saldoInicialDeCaja = saldoInicialDeCaja;
	}




	public void cobrarAlCliente() {
		
	};
	
	public List<Menu> tomarPedido(Menu menu, Cocina cocina) {
	//public List<Menu> tomarPedido(SoftwarePrincipal sf, Menu menu, Cocina cocina) {
		pedidos = new ArrayList<Menu>();
		if(cocina.getLaCocinaEstaEstable()) {
			//HashSet<Menu> menues = sf.agregarUnaHamburguesaAlMenu(menu);
			pedidos.add(menu);
		}
		return pedidos;
	}

	//&& cocina.getEstadoDelPuesto().equals(EstadoDelPuesto.SEGURO)
}
