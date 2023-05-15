package ar.edu.unlam.dominio;

public class Mantenimiento extends Empleado{
		
	public Mantenimiento(Integer id, String nombre, String apellido, Integer dni, Double sueldo, EstadoDelEmpleado estadoDelEmpleado) {
		super(id, nombre, apellido, dni, sueldo, estadoDelEmpleado);
	
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
		if (puestoDeTrabajo.getEstadoDelPuesto().equals(EstadoDelPuesto.EN_REPARACION)||puestoDeTrabajo.getEstadoDelPuesto().equals(EstadoDelPuesto.INSEGURO)) {
			puestoDeTrabajo.setEstadoDelPuesto(EstadoDelPuesto.SEGURO);
			}
	}

	public boolean agregarCamaraACocina(int idDePuestoDeTrabajo, SoftwarePrincipal sf, CamaraDeSeguridad camara) {
		Cocina buscarCocina=sf.buscarPuestoDeTrabajoCocinaEnElSistema(idDePuestoDeTrabajo);
		if (buscarCocina==null) {
		return false;
		}

		Boolean evaluarAgregarCamara=buscarCocina.agregarUnaCamara(camara);
		if (evaluarAgregarCamara) {
		return true;
		}

		return false;
		}


	public void activarODesactivarLaCamaraEnCocina(int idPuestoDeTrabajo, int idDeCamaraDeSeguridad, SoftwarePrincipal sf) {
		Cocina buscarCocina=sf.buscarPuestoDeTrabajoCocinaEnElSistema(idPuestoDeTrabajo);
		 buscarCocina.activarODesactivarCamaraEnCocina(idDeCamaraDeSeguridad);
		}
	
	public EstadoDelPuesto cambiarElEstadoDelPuestoSiNoTieneCamaras(PuestoDeTrabajo puestoDeTrabajo, CamaraDeSeguridad idDeCamaraDeSeguridad, SoftwarePrincipal sf) {
		if(agregarCamaraACocina(puestoDeTrabajo.getIdDelPuesto(), sf, idDeCamaraDeSeguridad)) {
			puestoDeTrabajo.setEstadoDelPuesto(EstadoDelPuesto.INSEGURO);
			return puestoDeTrabajo.getEstadoDelPuesto();
		}else{
			puestoDeTrabajo.setEstadoDelPuesto(EstadoDelPuesto.SEGURO);
			return puestoDeTrabajo.getEstadoDelPuesto();
		}
	}
	
	}
	
	
	

