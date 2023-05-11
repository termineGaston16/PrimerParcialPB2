package ar.edu.unlam.dominio;

public class PuestoDeTrabajo {
	
	private EstadoDelPuesto estadoDelPuesto;
	private Integer cantidadMaximaDeEmpleadosParaEstePuesto;
	private Integer idDelPuesto;
	
	public PuestoDeTrabajo(EstadoDelPuesto estadoDelPuesto, Integer cantidadMaximaDeEmpleadosParaEstePuesto,
			Integer idDelPuesto) {
		super();
		this.estadoDelPuesto = estadoDelPuesto;
		this.cantidadMaximaDeEmpleadosParaEstePuesto = cantidadMaximaDeEmpleadosParaEstePuesto;
		this.idDelPuesto = idDelPuesto;
	}

	public EstadoDelPuesto getEstadoDelPuesto() {
		return estadoDelPuesto;
	}

	public void setEstadoDelPuesto(EstadoDelPuesto estadoDelPuesto) {
		this.estadoDelPuesto = estadoDelPuesto;
	}

	public Integer getCantidadMaximaDeEmpleadosParaEstePuesto() {
		return cantidadMaximaDeEmpleadosParaEstePuesto;
	}

	public void setCantidadMaximaDeEmpleadosParaEstePuesto(Integer cantidadMaximaDeEmpleadosParaEstePuesto) {
		this.cantidadMaximaDeEmpleadosParaEstePuesto = cantidadMaximaDeEmpleadosParaEstePuesto;
	}

	public Integer getIdDelPuesto() {
		return idDelPuesto;
	}

	public void setIdDelPuesto(Integer idDelPuesto) {
		this.idDelPuesto = idDelPuesto;
	}
	
	
	
	
	
}
