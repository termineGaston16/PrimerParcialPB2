package ar.edu.unlam.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.dominio.Caja;
import ar.edu.unlam.dominio.CamaraDeSeguridad;
import ar.edu.unlam.dominio.Cocina;
import ar.edu.unlam.dominio.Empleado;
import ar.edu.unlam.dominio.EstadoDelPuesto;
import ar.edu.unlam.dominio.Gerente;
import ar.edu.unlam.dominio.InformeDeUnTrabajo;
import ar.edu.unlam.dominio.Lobby;
import ar.edu.unlam.dominio.Mantenimiento;
import ar.edu.unlam.dominio.SoftwarePrincipal;

public class TestSoftwareMc {

	////////////////////////////////////
	@Test
	public void queElGerentePuedaContratarAUnEmpleadoEnElSistema() {
		
		//INICIALIZACIÓN
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente=new Gerente(001,"MILAGROS","FERRAZA",44715022,1500.0,true,10);
		Empleado empleado=new Empleado(001,"TOMÁS","GONZALES",44121456,700.0);
		
		//EJECUCIÓN
		Boolean contratarEmpelado=gerente.contratarEmpleado(empleado,sf);
		
		
		//EVALUACIÓN
		assertEquals(1, sf.cantidadDeEmpleadosRegistrados());
		assertTrue(contratarEmpelado);
		

	}
	
	////////////////////////////////////
	@Test
	public void queElGerentePuedaAsignarUnPuestoDeLobbyAUnEmpleado() {
		
		//INICIALIZACIÓN
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente=new Gerente(001,"MILAGROS","FERRAZA",44715022,1500.0,true,10);
		Empleado empleado=new Empleado(002,"TOMÁS","GONZALES",44121456,700.0);
		Mantenimiento empleadoDeMantenimiento=new Mantenimiento(003,"LEO","SANCHEZ",14784225,1200.0);
		Lobby lobby=new Lobby(EstadoDelPuesto.SEGURO,3,01,10,true);
		
		
		//EJECUCIÓN
		Boolean contratarEmpelado=gerente.contratarEmpleado(empleado,sf);
		Boolean evaluarAgregarPuestoDeTrabajo=empleadoDeMantenimiento.agregarUnLobby(lobby,sf);
		
		Boolean evaluarAsignarLabor=gerente.asignarElLaborDeLobbyAUnEmpleado(002,01,sf);
		
		//EVALUACIÓN
		assertEquals(1, sf.cantidadDeEmpleadosRegistrados());
		assertEquals(1, sf.cantidadDePuestosDeTrabajosAgregados());
		assertEquals(1, sf.cantidadDeEmpleadosAsignadosEnElLobby(01));
	
	}

	///////////////////////////////////
	@Test
	public void queNoSePuedaAsignarUnEmpleadoEnLaCajaSiNoEstanTodasLasCamarasDeSeguridadPrendidas() {
		
		//INICIALIZACIÓN
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente=new Gerente(001,"MILAGROS","FERRAZA",44715022,1500.0,true,10);
		Empleado empleado=new Empleado(002,"TOMÁS","GONZALES",44121456,700.0);
		Mantenimiento empleadoDeMantenimiento=new Mantenimiento(003,"LEO","SANCHEZ",14784225,1200.0);
		Caja caja=new Caja(EstadoDelPuesto.SEGURO,2,01,1,100.0,0);
		CamaraDeSeguridad camara=new CamaraDeSeguridad(1,false);
		CamaraDeSeguridad camara2=new CamaraDeSeguridad(2,false);
				
				
		//EJECUCIÓN
		Boolean contratarEmpelado=gerente.contratarEmpleado(empleado,sf);
		Boolean evaluarAgregarPuestoDeTrabajo=empleadoDeMantenimiento.agregarUnaCaja(caja,sf);
		Boolean evaluarAgregarUnaCamara=empleadoDeMantenimiento.agregarCamaraACaja(01,sf,camara);
		evaluarAgregarUnaCamara=empleadoDeMantenimiento.agregarCamaraACaja(01,sf,camara2);
		
		empleadoDeMantenimiento.activarODesactivarLaCamaraEnCaja(01,1,sf);	
		
	
		gerente.asignarElLaborDeCajaAUnEmpleado(002, 01, sf);
		
				
		//EVALUACIÓN
		assertEquals(0, sf.cantidadDeEmpleadosAsignadosEnCaja(01));
	
		
	}
	
	///////////////////////////////////
	@Test
	public void queSePuedaRegistrarElInformeDeUnTrabajo() {
		
		//INICIALIZACIÓN
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente=new Gerente(001,"MILAGROS","FERRAZA",44715022,1500.0,true,10);
		Cocina cocina=new Cocina(EstadoDelPuesto.EN_REPARACION,4,1,true);
		Mantenimiento empleadoDeMantenimiento=new Mantenimiento(003,"LEO","SANCHEZ",14784225,1200.0);
		Empleado empleado=null;
		InformeDeUnTrabajo informe=null;
		Caja caja=null;
		
		
		//EJECUCIÓN
		Boolean evaluarAgregarPuestoDeTrabajo=empleadoDeMantenimiento.agregarUnaCocina(cocina, sf);
		
		empleado=new Empleado(002,"TOMÁS","GONZALES",44121456,700.0);
		Boolean evaluarContratarEmpleado=gerente.contratarEmpleado(empleado,sf);
		
		empleado=new Empleado(003,"JAZ","KILOS",12547896,700.0);
		evaluarContratarEmpleado=gerente.contratarEmpleado(empleado,sf);
		
		empleado=new Empleado(004,"TOMAS","BOTACHI",223147852,700.0);
		evaluarContratarEmpleado=gerente.contratarEmpleado(empleado,sf);
		
		
		Boolean evaluarAsignarPuesto=gerente.asignarElLaborDeCocinaAUnEmpleado(002, 1, sf);
		evaluarAsignarPuesto=gerente.asignarElLaborDeCocinaAUnEmpleado(003, 1, sf);
		
		informe=new InformeDeUnTrabajo(0001,cocina,cocina.getListaDeEmpleadosAsignadosAEstePuestoDeTrabajo().size(),"12/05/2023");
		Boolean evaluarRegistrarInforme=sf.registrarInformeDeTrabajo(informe);

		
		//EVALUACIÓN
		assertEquals(3, sf.cantidadDeEmpleadosRegistrados());
		assertEquals(2, sf.cantidadDeEmpleadosAsignadosEnCocina(1));
		assertEquals(1, sf.cantidadDeInformesRealizados());
		
		
		
	}
	
	///////////////////////////////////
	@Test
	public void queNoSePuedaRegistrarUnTrabajoEnUnaZonaInsegura() {
		
		//INICIALIZACIÓN
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente=new Gerente(001,"MILAGROS","FERRAZA",44715022,1500.0,true,10);
		Lobby lobby=new Lobby(EstadoDelPuesto.SEGURO,3,1,10,false);
		Caja caja=new Caja(EstadoDelPuesto.INSEGURO,2,01,1,100.0,0);
		Mantenimiento empleadoDeMantenimiento=new Mantenimiento(003,"LEO","SANCHEZ",14784225,1200.0);
		InformeDeUnTrabajo informe=null;
				
				
		//EJECUCIÓN
		empleadoDeMantenimiento.agregarUnaCaja(caja, sf);
		empleadoDeMantenimiento.agregarUnLobby(lobby, sf);
				

		informe=new InformeDeUnTrabajo(0001,caja,caja.getListaDeEmpleadosAsignadosAEstePuestoDeTrabajo().size(),"25/09/2023");
		Boolean evaluarRegistrarInforme=sf.registrarInformeDeTrabajo(informe);
		informe=new InformeDeUnTrabajo(0002,lobby,lobby.getListaDeEmpleadosAsignadosAEstePuestoDeTrabajo().size(),"30/09/2023");
		evaluarRegistrarInforme=sf.registrarInformeDeTrabajo(informe);

	
		//EVALUACIÓN
		assertEquals(1, sf.cantidadDeInformesRealizados());
				
				
	
	}
	
	
	
}
