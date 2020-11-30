package org.eclipse.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.model.Adresse;

public class AdresseService {

	private List<Adresse> adresses;
	
	public AdresseService() {
		adresses = new ArrayList<>();
	}
	
	public void save(Adresse adresse) {
		adresses.add(adresse);
	}
	
	public void remove(Adresse adresse) {
		adresses.remove(adresse);
	}
	
	public Adresse findById(int id) {
		return adresses.stream().filter(elt -> elt.getIdAdresse() == id) .collect(Collectors.toList()) .get(0);
	}
	
	public List<Adresse> getAdresse(){
		return adresses;
	}
	
	public void setAdresse(List<Adresse> adresse) {
		this.adresses = adresse;
	}
	
	
}
