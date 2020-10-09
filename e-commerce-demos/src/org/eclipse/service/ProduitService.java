package org.eclipse.service;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.model.Produit;

public class ProduitService {
	private List<Produit> produits;

	public ProduitService() {
		produits = new ArrayList<>();
	}

	public void save(Produit produit) {
		produits.add(produit);
	}

	public void remove(Produit produit) {
		produits.remove(produit);
	}
	
	public void update(Produit produit) {
		for (Produit prod: produits) {
			if (prod.getId() == produit.getId()) {
				prod = produit;
			}
		}
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
}
