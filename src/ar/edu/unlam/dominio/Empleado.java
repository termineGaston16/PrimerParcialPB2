package ar.edu.unlam.dominio;

import java.util.Objects;

public class Empleado {

	protected Integer id;
	protected String nombre; 
	protected String apellido;
	protected Integer dni;
	protected Double sueldo;
	protected EstadoDelEmpleado estadoDelEmpleado;
	
	public Empleado(Integer id, String nombre, String apellido, Integer dni, Double sueldo, EstadoDelEmpleado estadoDelEmpleado) {
		this.estadoDelEmpleado = estadoDelEmpleado;
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldo = sueldo;
	}

	public EstadoDelEmpleado getEstadoDelEmpleado() {
		return estadoDelEmpleado;
	}

	public void setEstadoDelEmpleado(EstadoDelEmpleado estadoDelEmpleado) {
		this.estadoDelEmpleado = estadoDelEmpleado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(dni, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(id, other.id);
	}

	public Double adicionarPlus(Integer cantidadVendida) {
		Double plus = 2000.0;
		Double total;
		if(cantidadVendida >= 5) {
			total = sueldo + plus;
			return total;
		}else {
			total= sueldo;
			return total;
		}
		
	}
}
