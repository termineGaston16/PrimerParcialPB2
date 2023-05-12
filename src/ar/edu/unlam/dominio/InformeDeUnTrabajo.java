package ar.edu.unlam.dominio;

import java.util.HashSet;

public class InformeDeUnTrabajo {
	private Integer idDeInforme;
	private PuestoDeTrabajo puestoDeTrabajoEnDondeSeRealizoElInforme;
	private Integer laCantidadDeEmpleadosAsignadosEnEsePuesto;
	private HashSet<Empleado> listaDeEmpleadosQueTrabajaronDuranteEseTurno;
	private String fechaEnLaQueSeRealizoElRegistro;
	
	public InformeDeUnTrabajo(Integer idDeInforme, PuestoDeTrabajo puestoDeTrabajoEnDondeSeRealizoElInforme,
			Integer laCantidadDeEmpleadosAsignadosEnEsePuesto, String fechaEnLaQueSeRealizoElRegistro) {
		this.idDeInforme = idDeInforme;
		this.puestoDeTrabajoEnDondeSeRealizoElInforme = puestoDeTrabajoEnDondeSeRealizoElInforme;
		this.laCantidadDeEmpleadosAsignadosEnEsePuesto = laCantidadDeEmpleadosAsignadosEnEsePuesto;
		this.listaDeEmpleadosQueTrabajaronDuranteEseTurno = listaDeEmpleadosQueTrabajaronDuranteEseTurno;
		this.fechaEnLaQueSeRealizoElRegistro = fechaEnLaQueSeRealizoElRegistro;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
