package ar.edu.unlam.dominio;

public class Cliente {

	private Integer idDeCliente;
	private String nombreDelCliente;
	private Integer dniDelCliente;
	public Cliente(Integer idDeCliente, String nombreDelCliente, Integer dniDelCliente) {
		this.idDeCliente = idDeCliente;
		this.nombreDelCliente = nombreDelCliente;
		this.dniDelCliente = dniDelCliente;
	}
	public Integer getIdDeCliente() {
		return idDeCliente;
	}
	public void setIdDeCliente(Integer idDeCliente) {
		this.idDeCliente = idDeCliente;
	}
	public String getNombreDelCliente() {
		return nombreDelCliente;
	}
	public void setNombreDelCliente(String nombreDelCliente) {
		this.nombreDelCliente = nombreDelCliente;
	}
	public Integer getDniDelCliente() {
		return dniDelCliente;
	}
	public void setDniDelCliente(Integer dniDelCliente) {
		this.dniDelCliente = dniDelCliente;
	}
	
	
	public void realizarPedido() {
		
	}
	
	public void pagarPedido() {
		
	}
	
}
