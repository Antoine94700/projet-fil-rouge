package org.eclipse.model;

public class Vendeur extends Utilisateur {
	private Produit[] produits;

	public Vendeur() {
	}

	public Vendeur(int id, String login, String password, String nom, String prenom, Produit[] produits) {
		super(id, login, password, nom, prenom);
		this.produits = produits;
	}

	public Produit[] getProduits() {
		return produits;
	}

	public void setProduits(Produit[] produits) {
		this.produits = produits;
	}

}
