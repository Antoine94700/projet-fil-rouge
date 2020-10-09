package org.eclipse.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
	public Utilisateur findById(int id) {
		return utilisateurs.stream().filter(elt -> elt.getId() == id).collect(Collectors.toList()).get(0);
	}
	public Utilisateur findByLoginAndPassword(String login, String password) {
		return utilisateurs.stream()
				.filter(elt -> elt.getLogin().equals(login) && elt.getPassword().equals(password))
				.collect(Collectors.toList()).get(0);
	}
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	


}
