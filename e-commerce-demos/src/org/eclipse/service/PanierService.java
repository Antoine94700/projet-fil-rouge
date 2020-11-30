package org.eclipse.service;


import java.util.ArrayList;
import java.util.List;

public class PanierService {

	private List<Panier> paniers;

	public PanierService() {
		paniers = new ArrayList<>();
	}

	public void save(Panier panier) {
		paniers.add(panier);
	}

	public void remove(Panier panier) {
		paniers.remove(panier);
	}
	
	public List<Panier> getPaniers() {
		return paniers;
	}

	public void setProduits(List<Panier> paniers) {
		this.paniers = panier;
	}
	
	
}