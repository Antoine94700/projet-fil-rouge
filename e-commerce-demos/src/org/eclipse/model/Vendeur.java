package org.eclipse.model;

public class Vendeur extends Utilisateur {
	private Produit[] produits;

	public Vendeur() {
	}

	public Vendeur(int idUtilisateur, String identifiant, String motDePasse, String nom, String prenom, Produit[] produits) {
		super(idUtilisateur, identifiant, motDePasse, nom, prenom);
		this.produits = produits;
	}

	public Produit[] getProduits() {
		return produits;
	}

	public void setProduits(Produit[] produits) {
		this.produits = produits;
	}

}
