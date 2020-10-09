package org.eclipse.service;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.model.Utilisateur;

public class UtilisateurService {
	private List<Utilisateur> utilisateurs;

	public UtilisateurService() {
		utilisateurs = new ArrayList<>();
	}

	public void save(Utilisateur utilisateur) {
		utilisateurs.add(utilisateur);
	}

	public void remove(Utilisateur utilisateur) {
		utilisateurs.remove(utilisateur);
	}
	
	public Utilisateur findById(int idUtilisateur) {
		for (Utilisateur utilisateur : utilisateurs) {
			if (utilisateur.getIdUtilisateur() == idUtilisateur) {
			return utilisateur;
			}
		}
		return null;
	}
	
	public Utilisateur findByUserNameAndPassword(String identifiant, String motDePasse) {
		for (Utilisateur utilisateur : utilisateurs) {
			if (utilisateur.getIdentifiant() .equals identifiant && utilisateur.getMotDePasse() .equals motDePasse) {
				return utilisateur;
			}
		}
		
	}
	
	
	
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	


}
