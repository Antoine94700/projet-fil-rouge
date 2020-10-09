package org.eclipse.model;

public class LigneCommande {
	private int id;
	private int quantiteCommandee;
	private Produit produit;
	private Commande commande;

	public LigneCommande() {
	}

	public LigneCommande(int id, int quantiteCommandee, Produit produit, Commande commande) {
		this.id = id;
		this.quantiteCommandee = quantiteCommandee;
		this.produit = produit;
		this.commande = commande;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantiteCommandee() {
		return quantiteCommandee;
	}

	public void setQuantiteCommandee(int quantiteCommandee) {
		this.quantiteCommandee = quantiteCommandee;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Override
	public String toString() {
		return "LigneCommande [id=" + id + ", quantiteCommandee=" + quantiteCommandee + ", produit=" + produit
				+ ", commande=" + commande + "]";
	}

}
