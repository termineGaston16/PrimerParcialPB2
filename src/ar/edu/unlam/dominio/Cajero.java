package ar.edu.unlam.dominio;

public class Cajero extends Empleado{
	
	private Double saldoInicialDeCaja;
		
	public Cajero(Integer id, String nombre, String apellido, Integer dni, Double sueldo, Double saldoInicialDeCaja, EstadoDelEmpleado estadoDelEmpleado) {
		super(id, nombre, apellido, dni, sueldo, estadoDelEmpleado);
		this.saldoInicialDeCaja = saldoInicialDeCaja;
	}




	public void cobrarAlCliente() {
		
	};

}
