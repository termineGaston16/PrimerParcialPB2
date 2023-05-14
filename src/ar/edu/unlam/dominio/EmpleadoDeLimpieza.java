package ar.edu.unlam.dominio;

public class EmpleadoDeLimpieza extends Empleado{
		
	public EmpleadoDeLimpieza(Integer id, String nombre, String apellido, Integer dni, Double sueldo, EstadoDelEmpleado estadoDelEmpleado) {
		super(id, nombre, apellido, dni, sueldo, estadoDelEmpleado);

	}
		
	public void limpiar(Lobby lobby) {
		Boolean estadoDeLimpieza = lobby.getEsteLobbyEstaLimpio();
		if(!estadoDeLimpieza) {
			lobby.setEsteLobbyEstaLimpio(true);
		}
	};

}
