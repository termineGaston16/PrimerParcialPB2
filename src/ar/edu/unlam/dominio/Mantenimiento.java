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
	

	public void agregarUnLobby(Lobby lobby, SoftwarePrincipal sf) {
		sf.agregarUnPuestoDeTrabajo(lobby);
	}


	public void agregarUnaCaja(Caja caja, SoftwarePrincipal sf) {
		sf.agregarUnPuestoDeTrabajo(caja);
	}


	public void agregarCamaraACaja(int idDePuestoDeTrabajo, SoftwarePrincipal sf, CamaraDeSeguridad camara) {
		Caja buscarCaja=sf.buscarPuestoDeTrabajoCajaEnElSistema(idDePuestoDeTrabajo);
		buscarCaja.agregarUnaCamara(camara);
	}


	public void activarODesactivarLaCamaraEnCaja(int idDePuestoDeTrabajo, int idDeCamaraDeSeguridad, SoftwarePrincipal sf) {
		Caja buscarCaja=sf.buscarPuestoDeTrabajoCajaEnElSistema(idDePuestoDeTrabajo);
		buscarCaja.activarODesactivarCamaraEnCaja(idDeCamaraDeSeguridad);
		
	}

	

}
