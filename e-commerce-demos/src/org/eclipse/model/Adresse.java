package org.eclipse.model;

public class Adresse {

	private int idAdresse;
	private String voirie;
	private String codePostal;
	private String ville;
	
	public Adresse(int idAdresse, String voirie, String codePostal, String ville) {
		super();
		this.idAdresse = idAdresse;
		this.voirie = voirie;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public int getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public String getVoirie() {
		return voirie;
	}

	public void setVoirie(String voirie) {
		this.voirie = voirie;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", voirie=" + voirie + ", codePostal=" + codePostal + ", ville="
				+ ville + "]";
	}
	
	
	
	
	
}
