package ar.edu.unlam.dominio;

public class Cajero extends Empleado{
	
	private Double saldoInicialDeCaja;
		
	public Cajero(Integer id, String nombre, String apellido, Integer dni, Double sueldo, Double saldoInicialDeCaja) {
		super(id, nombre, apellido, dni, sueldo);
		this.saldoInicialDeCaja = saldoInicialDeCaja;
	}




	public void cobrarAlCliente() {
		
	};

}
