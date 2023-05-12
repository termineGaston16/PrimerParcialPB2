package ar.edu.unlam.dominio;

public class Mantenimiento extends Empleado{
		
	public Mantenimiento(Integer id, String nombre, String apellido, Integer dni, Double sueldo) {
		super(id, nombre, apellido, dni, sueldo);
	
	}
	
	
	public void rreglarUnPuestoDeTrabajo() {
		
	};
	public void prenderCamaras() {
		
	};
	public void apagarCamaras() {
		
	};
	public void agregarCamaras() {
		
	}


	public void agregarUnaZonaDeTrabajo(Lobby lobby, SoftwarePrincipal sf) {
		sf.agregarUnPuestoDeTrabajo(lobby);
	};

}
