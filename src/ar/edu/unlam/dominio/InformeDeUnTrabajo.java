package ar.edu.unlam.dominio;

import java.util.HashSet;
import java.util.Objects;

public class InformeDeUnTrabajo {
	private Integer idDeInforme;
	private PuestoDeTrabajo puestoDeTrabajoEnDondeSeRealizoElInforme;
	private Integer laCantidadDeEmpleadosAsignadosEnEsePuesto;
	private String fechaEnLaQueSeRealizoElRegistro;
	
	public InformeDeUnTrabajo(Integer idDeInforme, PuestoDeTrabajo puestoDeTrabajoEnDondeSeRealizoElInforme,
			Integer laCantidadDeEmpleadosAsignadosEnEsePuesto, String fechaEnLaQueSeRealizoElRegistro) {
		this.idDeInforme = idDeInforme;
		this.puestoDeTrabajoEnDondeSeRealizoElInforme = puestoDeTrabajoEnDondeSeRealizoElInforme;
		this.laCantidadDeEmpleadosAsignadosEnEsePuesto = laCantidadDeEmpleadosAsignadosEnEsePuesto;
		this.fechaEnLaQueSeRealizoElRegistro = fechaEnLaQueSeRealizoElRegistro;
	}

	public Integer getIdDeInforme() {
		return idDeInforme;
	}

	public void setIdDeInforme(Integer idDeInforme) {
		this.idDeInforme = idDeInforme;
	}

	public PuestoDeTrabajo getPuestoDeTrabajoEnDondeSeRealizoElInforme() {
		return puestoDeTrabajoEnDondeSeRealizoElInforme;
	}

	public void setPuestoDeTrabajoEnDondeSeRealizoElInforme(PuestoDeTrabajo puestoDeTrabajoEnDondeSeRealizoElInforme) {
		this.puestoDeTrabajoEnDondeSeRealizoElInforme = puestoDeTrabajoEnDondeSeRealizoElInforme;
	}

	public Integer getLaCantidadDeEmpleadosAsignadosEnEsePuesto() {
		return laCantidadDeEmpleadosAsignadosEnEsePuesto;
	}

	public void setLaCantidadDeEmpleadosAsignadosEnEsePuesto(Integer laCantidadDeEmpleadosAsignadosEnEsePuesto) {
		this.laCantidadDeEmpleadosAsignadosEnEsePuesto = laCantidadDeEmpleadosAsignadosEnEsePuesto;
	}

	public String getFechaEnLaQueSeRealizoElRegistro() {
		return fechaEnLaQueSeRealizoElRegistro;
	}

	public void setFechaEnLaQueSeRealizoElRegistro(String fechaEnLaQueSeRealizoElRegistro) {
		this.fechaEnLaQueSeRealizoElRegistro = fechaEnLaQueSeRealizoElRegistro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDeInforme);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InformeDeUnTrabajo other = (InformeDeUnTrabajo) obj;
		return Objects.equals(idDeInforme, other.idDeInforme);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
