package ar.edu.unlam.dominio;

public class Mantenimiento extends Empleado{
		
	public Mantenimiento(Integer id, String nombre, String apellido, Integer dni, Double sueldo) {
		super(id, nombre, apellido, dni, sueldo);
	
	}
	
	
	public void prenderCamaras() {
		
		
	};
	public void apagarCamaras() {
		
		
	};
	

	public Boolean agregarUnLobby(Lobby lobby, SoftwarePrincipal sf) {
		return(sf.agregarUnPuestoDeTrabajo(lobby))?true:false;
	}


	public Boolean agregarUnaCaja(Caja caja, SoftwarePrincipal sf) {
		return(sf.agregarUnPuestoDeTrabajo(caja))?true:false;
	}


	public Boolean agregarCamaraACaja(int idDePuestoDeTrabajo, SoftwarePrincipal sf, CamaraDeSeguridad camara) {
		Caja buscarCaja=sf.buscarPuestoDeTrabajoCajaEnElSistema(idDePuestoDeTrabajo);
		if (buscarCaja==null) {
			return false;
		}
		
		Boolean evaluarAgregarCamara=buscarCaja.agregarUnaCamara(camara);
		if (evaluarAgregarCamara) {
			return true;
		}
		
		return false;
	}


	public void activarODesactivarLaCamaraEnCaja(int idDePuestoDeTrabajo, int idDeCamaraDeSeguridad, SoftwarePrincipal sf) {
		Caja buscarCaja=sf.buscarPuestoDeTrabajoCajaEnElSistema(idDePuestoDeTrabajo);
		buscarCaja.activarODesactivarCamaraEnCaja(idDeCamaraDeSeguridad);
		
	}


	public Boolean agregarUnaCocina(Cocina cocina, SoftwarePrincipal sf) {
		return(sf.agregarUnPuestoDeTrabajo(cocina))?true:false;
		
	}

	public void arreglarPuestoDeTrabajo (PuestoDeTrabajo puestoDeTrabajo) {
		puestoDeTrabajo.setEstadoDelPuesto(EstadoDelPuesto.SEGURO);
	}

	public void cuidarJardin(Jardin jardin) {
	    jardin.cortarCesped();
	    jardin.podarArboles();
	    jardin.regarPlantas();
	}
	
	
	
}
