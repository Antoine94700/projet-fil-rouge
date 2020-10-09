package org.eclipse.model;

public class LignePanier {
	private int id;
	private int qteCommandee;
	private Produit produit;
	private Panier panier;

	public LignePanier() {
	}

	public LignePanier(int id, int qteCommandee, Produit produit, Panier panier) {
		this.id = id;
		this.qteCommandee = qteCommandee;
		this.produit = produit;
		this.panier = panier;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public int getQteCommandee() {
		return qteCommandee;
	}

	public void setQteCommandee(int qteCommandee) {
		this.qteCommandee = qteCommandee;
	}

	@Override
	public String toString() {
		return "LignePanier [id=" + id + ", qteCommandee=" + qteCommandee + ", produit=" + produit + ", panier="
				+ panier + "]";
	}

}
