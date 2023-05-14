package ar.edu.unlam.dominio;

public class Menu {

	private String nombreDelCombo;
	private Double precioDelCombo;
	
	
	public Menu(String nombreDelCombo, Double precioDelCombo) {
		super();
		this.nombreDelCombo = nombreDelCombo;
		this.precioDelCombo = precioDelCombo;
	}
	
	public String getNombreDelCombo() {
		return nombreDelCombo;
	}
	public void setNombreDelCombo(String nombreDelCombo) {
		this.nombreDelCombo = nombreDelCombo;
	}
	public Double getPrecioDelCombo() {
		return precioDelCombo;
	}
	public void setPrecioDelCombo(Double precioDelCombo) {
		this.precioDelCombo = precioDelCombo;
	}
	
	
	
	
}
