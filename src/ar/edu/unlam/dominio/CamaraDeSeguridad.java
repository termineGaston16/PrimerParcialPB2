package ar.edu.unlam.dominio;

public class CamaraDeSeguridad {
	
	 private Integer idDeCamara;
	 private Boolean estaPrendida;
	 
	public CamaraDeSeguridad(Integer idDeCamara, Boolean estaPrendida) {
		this.idDeCamara = idDeCamara;
		this.estaPrendida = estaPrendida;
	}
	
	public Integer getIdDeCamara() {
		return idDeCamara;
	}
	public void setIdDeCamara(Integer idDeCamara) {
		this.idDeCamara = idDeCamara;
	}
	public Boolean getEstaPrendida() {
		return estaPrendida;
	}
	public void setEstaPrendida(Boolean estaPrendida) {
		this.estaPrendida = estaPrendida;
	}
	 
	 
	
	
	 
	 
}
