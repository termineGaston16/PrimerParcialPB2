package ar.edu.unlam.test;

import static org.junit.Assert.*;


import javax.swing.UIManager;

import org.junit.Test;

import ar.edu.unlam.dominio.Caja;
import ar.edu.unlam.dominio.CamaraDeSeguridad;
import ar.edu.unlam.dominio.Cocina;
import ar.edu.unlam.dominio.Empleado;
import ar.edu.unlam.dominio.EmpleadoDeLimpieza;
import ar.edu.unlam.dominio.EstadoDelEmpleado;
import ar.edu.unlam.dominio.EstadoDelPuesto;
import ar.edu.unlam.dominio.Gerente;
import ar.edu.unlam.dominio.Cajero;
import ar.edu.unlam.dominio.InformeDeUnTrabajo;
import ar.edu.unlam.dominio.Lobby;
import ar.edu.unlam.dominio.Mantenimiento;
import ar.edu.unlam.dominio.PuestoDeTrabajo;
import ar.edu.unlam.dominio.SoftwarePrincipal;
import ar.edu.unlam.dominio.Menu;

public class TestSoftwareMc {

	////////////////////////////////////
	@Test
	public void queElGerentePuedaContratarAUnEmpleadoEnElSistema() {
		
		//INICIALIZACI�N
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente=new Gerente(001,"MILAGROS","FERRAZA",44715022,1500.0,true,10,EstadoDelEmpleado.LIBRE);
		Empleado empleado=new Empleado(001,"TOM�S","GONZALES",44121456,700.0, EstadoDelEmpleado.LIBRE);
		
		//EJECUCI�N
		Boolean contratarEmpelado=gerente.contratarEmpleado(empleado,sf);
		
		
		//EVALUACI�N
		assertEquals(1, sf.cantidadDeEmpleadosRegistrados());
		assertTrue(contratarEmpelado);
		

	}
	
	////////////////////////////////////
	@Test
	public void queElGerentePuedaAsignarUnPuestoDeLobbyAUnEmpleado() {
		
		//INICIALIZACI�N
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente=new Gerente(001,"MILAGROS","FERRAZA",44715022,1500.0,true,10,EstadoDelEmpleado.LIBRE);
		Empleado empleado=new Empleado(002,"TOM�S","GONZALES",44121456,700.0, EstadoDelEmpleado.LIBRE);
		Mantenimiento empleadoDeMantenimiento=new Mantenimiento(003,"LEO","SANCHEZ",14784225,1200.0,EstadoDelEmpleado.LIBRE);
		Lobby lobby=new Lobby(EstadoDelPuesto.SEGURO,3,01,10,true);
		
		
		//EJECUCI�N
		Boolean contratarEmpelado=gerente.contratarEmpleado(empleado,sf);
		Boolean evaluarAgregarPuestoDeTrabajo=empleadoDeMantenimiento.agregarUnLobby(lobby,sf);
		
		Boolean evaluarAsignarLabor=gerente.asignarElLaborDeLobbyAUnEmpleado(002,01,sf);
		
		//EVALUACI�N
		assertEquals(1, sf.cantidadDeEmpleadosRegistrados());
		assertEquals(1, sf.cantidadDePuestosDeTrabajosAgregados());
		assertEquals(1, sf.cantidadDeEmpleadosAsignadosEnElLobby(01));
	
	}

	///////////////////////////////////
	@Test
	public void queNoSePuedaAsignarUnEmpleadoEnLaCajaSiNoEstanTodasLasCamarasDeSeguridadPrendidas() {
		
		//INICIALIZACI�N
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente=new Gerente(001,"MILAGROS","FERRAZA",44715022,1500.0,true,10,EstadoDelEmpleado.LIBRE);
		Empleado empleado=new Empleado(002,"TOM�S","GONZALES",44121456,700.0,EstadoDelEmpleado.LIBRE);
		Mantenimiento empleadoDeMantenimiento=new Mantenimiento(003,"LEO","SANCHEZ",14784225,1200.0,EstadoDelEmpleado.LIBRE);
		Caja caja=new Caja(EstadoDelPuesto.SEGURO,2,01,1,100.0,0);
		CamaraDeSeguridad camara=new CamaraDeSeguridad(1,false);
		CamaraDeSeguridad camara2=new CamaraDeSeguridad(2,false);
				
				
		//EJECUCI�N
		Boolean contratarEmpelado=gerente.contratarEmpleado(empleado,sf);
		Boolean evaluarAgregarPuestoDeTrabajo=empleadoDeMantenimiento.agregarUnaCaja(caja,sf);
		Boolean evaluarAgregarUnaCamara=empleadoDeMantenimiento.agregarCamaraACaja(01,sf,camara);
		evaluarAgregarUnaCamara=empleadoDeMantenimiento.agregarCamaraACaja(01,sf,camara2);
		
		empleadoDeMantenimiento.activarODesactivarLaCamaraEnCaja(01,1,sf);	
		
	
		gerente.asignarElLaborDeCajaAUnEmpleado(002, 01, sf);
		
				
		//EVALUACI�N
		assertEquals(0, sf.cantidadDeEmpleadosAsignadosEnCaja(01));
	
		
	}
	
	///////////////////////////////////
	@Test
	public void queSePuedaRegistrarElInformeDeUnTrabajo() {
		
		//INICIALIZACI�N
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente=new Gerente(001,"MILAGROS","FERRAZA",44715022,1500.0,true,10,EstadoDelEmpleado.LIBRE);
		Cocina cocina=new Cocina(EstadoDelPuesto.EN_REPARACION,4,1,true);
		Mantenimiento empleadoDeMantenimiento=new Mantenimiento(003,"LEO","SANCHEZ",14784225,1200.0,EstadoDelEmpleado.LIBRE);
		Empleado empleado=null;
		InformeDeUnTrabajo informe=null;
		Caja caja=null;
		
		
		//EJECUCI�N
		Boolean evaluarAgregarPuestoDeTrabajo=empleadoDeMantenimiento.agregarUnaCocina(cocina, sf);
		
		empleado=new Empleado(002,"TOM�S","GONZALES",44121456,700.0,EstadoDelEmpleado.LIBRE);
		Boolean evaluarContratarEmpleado=gerente.contratarEmpleado(empleado,sf);
		
		empleado=new Empleado(003,"JAZ","KILOS",12547896,700.0,EstadoDelEmpleado.LIBRE);
		evaluarContratarEmpleado=gerente.contratarEmpleado(empleado,sf);
		
		empleado=new Empleado(004,"TOMAS","BOTACHI",223147852,700.0,EstadoDelEmpleado.LIBRE);
		evaluarContratarEmpleado=gerente.contratarEmpleado(empleado,sf);
		
		
		Boolean evaluarAsignarPuesto=gerente.asignarElLaborDeCocinaAUnEmpleado(002, 1, sf);
		evaluarAsignarPuesto=gerente.asignarElLaborDeCocinaAUnEmpleado(003, 1, sf);
		
		informe=new InformeDeUnTrabajo(0001,cocina,cocina.getListaDeEmpleadosAsignadosAEstePuestoDeTrabajo().size(),"12/05/2023");
		Boolean evaluarRegistrarInforme=sf.registrarInformeDeTrabajo(informe);

		
		//EVALUACI�N
		assertEquals(3, sf.cantidadDeEmpleadosRegistrados());
		assertEquals(2, sf.cantidadDeEmpleadosAsignadosEnCocina(1));
		assertEquals(1, sf.cantidadDeInformesRealizados());
		
		
		
	}
	
	///////////////////////////////////
	@Test
	public void queNoSePuedaRegistrarUnTrabajoEnUnaZonaInsegura() {
		
		//INICIALIZACI�N
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente=new Gerente(001,"MILAGROS","FERRAZA",44715022,1500.0,true,10,EstadoDelEmpleado.LIBRE);
		Lobby lobby=new Lobby(EstadoDelPuesto.SEGURO,3,1,10,false);
		Caja caja=new Caja(EstadoDelPuesto.INSEGURO,2,01,1,100.0,0);
		Mantenimiento empleadoDeMantenimiento=new Mantenimiento(003,"LEO","SANCHEZ",14784225,1200.0,EstadoDelEmpleado.LIBRE);
		InformeDeUnTrabajo informe=null;
				
				
		//EJECUCI�N
		empleadoDeMantenimiento.agregarUnaCaja(caja, sf);
		empleadoDeMantenimiento.agregarUnLobby(lobby, sf);
				

		informe=new InformeDeUnTrabajo(0001,caja,caja.getListaDeEmpleadosAsignadosAEstePuestoDeTrabajo().size(),"25/09/2023");
		Boolean evaluarRegistrarInforme=sf.registrarInformeDeTrabajo(informe);
		informe=new InformeDeUnTrabajo(0002,lobby,lobby.getListaDeEmpleadosAsignadosAEstePuestoDeTrabajo().size(),"30/09/2023");
		evaluarRegistrarInforme=sf.registrarInformeDeTrabajo(informe);

	
		//EVALUACI�N
		assertEquals(1, sf.cantidadDeInformesRealizados());
	}
		
	///////////////////////////////////
	@Test
	public void queUnPuestoDeTrabajoSeaSeguroSiTienePorLoMenosUnaCamaraColocada() {
	
		//INICIALIZACI�N
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		
		//EJECUCI�N
		
		
		//EVALUACI�N
					
					
		
		}
	
	///////////////////////////////////
	@Test
		public void siUnCajeroLograVenderCincoHamburguesasOMasCobreUnPlus() {
		
		//INICIALIZACI�N
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente = new Gerente(1234, "Pablo", "Perez", 33123456, 200000.0, true, 5, EstadoDelEmpleado.LIBRE);
		Cajero cajero1 = new Cajero(5678, "Ana", "Lopez", 22456654, 30000.0, 100.0, EstadoDelEmpleado.LIBRE);
		Caja caja1=new Caja(EstadoDelPuesto.SEGURO,4,1234,1,1000.0,5);
		
		
		//EJECUCI�N
		Double esperado = 32000.0;
		Double obtenido = gerente.pagarSueldoAlEmpleado(cajero1, caja1);
		
		
		//EVALUACI�N
		assertEquals(esperado, obtenido);
		
		
		}
	
	
	///////////////////////////////////
	@Test
		public void queUnEmpleadoPuedaLimpiarElLobbySiEstaSucio() {
		
		//INICIALIZACI�N
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		EmpleadoDeLimpieza empleado1 = new EmpleadoDeLimpieza(123, "Ricardo", "Arjona", 12345678, 20000.0, EstadoDelEmpleado.LIBRE);
		Lobby lobby1 = new Lobby(EstadoDelPuesto.SEGURO,10,123,15,false);
		
		//EJECUCI�N
		empleado1.limpiar(lobby1);
		Boolean ahoraEstaLimpio = lobby1.getEsteLobbyEstaLimpio();		
		//EVALUACI�N
		assertTrue(ahoraEstaLimpio);
		
		
		}
	
	///////////////////////////////////
	@Test
	public void siLaCocinaEstaInestableNoSePuedeTomarPedidos() {
		
		//INICIALIZACI�N
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		//Cocina cocina = new Cocina(EstadoDelPuesto.INSEGURO, 5, 1234, false);
		Cocina cocina2 = new Cocina(EstadoDelPuesto.SEGURO, 5, 1234, true);
		CamaraDeSeguridad camara1 = new CamaraDeSeguridad(123, true);
		Mantenimiento mantenimiento = new Mantenimiento(123, "Gonzalez", "Pepito", 335566789, 2000.0, EstadoDelEmpleado.LIBRE);
		Menu cuartoDeLibra = new Menu("Cuarto de libra", 200.0);
		Cajero cajero1 = new Cajero(5678, "Ana", "Lopez", 22456654, 30000.0, 100.0, EstadoDelEmpleado.LIBRE);
		
		//EJECUCI�N
		sf.agregarUnaHamburguesaAlMenu(cuartoDeLibra);
		mantenimiento.agregarCamaraACocina(1234, sf, camara1);
		Integer esperado = 1;
		Integer obtenido = cajero1.tomarPedido(cuartoDeLibra, cocina2).size();
		
		//EVALUACI�N
		assertEquals(esperado, obtenido);
	
	
	}
	//////////////////////////////////
	@Test
	public void queNoSePuedaAgregarUnEmpleadoDuplicadoEnUnPuesto() {
		//INICIALIZACION
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente=new Gerente(001,"ISABELLA","PEREZ",40650392,1500.0,true,10,EstadoDelEmpleado.LIBRE);
		Empleado empleado=new Empleado(002,"MAURO","GOMEZ",39403182,700.0,EstadoDelEmpleado.LIBRE);
		Empleado empleado2=new Empleado(003,"RICARDO","CASANOVA",30403152,700.0,EstadoDelEmpleado.LIBRE);
		Mantenimiento empleadoDeMantenimiento=new Mantenimiento(003,"JORGE","LOPEZ",15890240,1200.0,EstadoDelEmpleado.LIBRE);
		Caja caja=new Caja(EstadoDelPuesto.SEGURO,3,01,1,500.0,0);
		
		//EJECUCION
		Boolean contratarEmpleado = gerente.contratarEmpleado(empleado, sf);
		Boolean evaluarAAgregarPuestoDeTrabajo = empleadoDeMantenimiento.agregarUnaCaja(caja , sf);
		gerente.asignarElLaborDeCajaAUnEmpleado(002, 01, sf);
		Boolean contratarEmpleado2 = gerente.contratarEmpleado(empleado2, sf);
		gerente.asignarElLaborDeCajaAUnEmpleado(003, 01, sf);
		gerente.asignarElLaborDeCajaAUnEmpleado(002, 01, sf);
		//EVALUACION
		assertEquals(2, sf.cantidadDeEmpleadosAsignadosEnCaja(01));
		
	}
	//////////////////////////////////
	
	@Test
	public void queElDeMantenimientoPuedaArreglarUnPuestoDeTrabajo() {
		//INICIALIZACION
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Mantenimiento empleadoDeMantenimiento=new Mantenimiento(003,"JORGE","LOPEZ",15890240,1200.0,EstadoDelEmpleado.LIBRE);
		Cocina cocina=new Cocina(EstadoDelPuesto.EN_REPARACION,4,1,false);
		CamaraDeSeguridad camara=new CamaraDeSeguridad(1,false);
		
		//EJECUCION
		Boolean evaluarAAgregarPuestoDeTrabajo = empleadoDeMantenimiento.agregarUnaCocina(cocina, sf);
		empleadoDeMantenimiento.agregarCamaraACocina (1,sf, camara);
		empleadoDeMantenimiento.activarODesactivarLaCamaraEnCocina(1, 1, sf);
		empleadoDeMantenimiento.arreglarPuestoDeTrabajo(cocina);
		
		//EVALUACION
		assertEquals(EstadoDelPuesto.SEGURO, cocina.getEstadoDelPuesto());
		
	}
	/////////////////////////////////
	
	@Test
	public void queElGerenteNoPuedaPagarAUnEmpleadoSuspendido() {
		//INICIALIZACION	
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente=new Gerente(001,"ISABELLA","PEREZ",40650392,1500.0,true,10,EstadoDelEmpleado.LIBRE);
		Empleado empleado=new Empleado(002,"MAURO","GOMEZ",39403182,700.0,EstadoDelEmpleado.LIBRE);
		
		//EJECUCION
		gerente.contratarEmpleado(empleado, sf);
		gerente.suspenderEmpleado(empleado);
		gerente.pagarEmpleado(empleado);
		
		//EVALUACION
		assertEquals(0.0, empleado.getSueldo(), 0.1);
		
	}
	
	@Test
	public void queUnGerentePuedaDespedirAUnEmpleadoSinImportarSuEstado() {		
		//INICIALIZACION
		SoftwarePrincipal sf=new SoftwarePrincipal("SISTEMA DE MACDONALS 2023");
		Gerente gerente=new Gerente(001,"ISABELLA","PEREZ",40650392,1500.0,true,10);
		Empleado empleado3=new Empleado(004,"Chayanne","Duki",36403182,700.0,EstadoDelEmpleado.LIBRE);
		Empleado empleado4=new Empleado(005,"Lucas","Pordiosero",32805099,900.0,EstadoDelEmpleado.LIBRE);
		//EJECUCION
		Boolean contratarEmpleado3 = gerente.contratarEmpleado(empleado3, sf);
		Boolean contratarEmpleado4 = gerente.contratarEmpleado(empleado4, sf);
		gerente.suspenderEmpleado(empleado3);
		gerente.despedirEmpleado(empleado3,sf);
		gerente.despedirEmpleado(empleado4,sf);
		//EVALUACION
		assertEquals(0, sf.cantidadDeEmpleadosRegistrados());
	}
	
	
}
