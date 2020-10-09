package org.eclipse.model;

public class Utilisateur {
	private int idUtilisateur;
	private String identifiant;
	private String motDePasse;
	private String nom;
	private String prenom;
	
	public Utilisateur() {
	}
	public Utilisateur(int idUtilisateur, String identifiant, String motDePasse, String nom, String prenom) {
		this.idUtilisateur = idUtilisateur;
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
	}
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisatuer(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", login=" + identifiant + ", identifiant=" + motDePasse + ", nom=" + nom + ", prenom="
				+ prenom + "]";
	}
	
	
}
