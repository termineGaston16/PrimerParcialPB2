package ar.edu.unlam.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.dominio.Empleado;
import ar.edu.unlam.dominio.Gerente;
import ar.edu.unlam.dominio.SoftwarePrincipal;

public class TestSoftwareMc {

	////////////////////////////////////
	@Test
	public void queElGerentePuedaContratarAUnEmpleadoEnElSistema() {
		
		//INICIALIZACI�N
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente=new Gerente(001,"MILAGROS","FERRAZA",44715022,1500.0,true,10);
		Empleado empleado=new Empleado(002,"TOM�S","GONZALES",44121456,700.0);
		
		//EJECUCI�N
		gerente.contratarEmpleado(empleado,sf);
		
		
		
		//EVALUACI�N
		assertEquals(1, sf.cantidadDeEmpleadosRegistrados());
		
		
	}

}
