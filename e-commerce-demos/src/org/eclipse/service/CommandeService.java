package org.eclipse.service;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.model.Commande;

public class CommandeService {
private List<Commande> commandes;

public CommandeService() {
	commandes = new ArrayList<>();
}

public void save (Commande commande) {
	commandes.add(commande);
}

public void remove(Commande commande) {
	commandes.remove(commande);
}
	
	public void update (Commande commande) {
		for (Commande prod: commandes) {
			if (prod.getIdCommande() == commande.getIdCommande()) {
				prod = commande;
			}
		
	}
}
	
}
