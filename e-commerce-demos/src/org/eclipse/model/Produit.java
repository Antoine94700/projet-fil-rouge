package org.eclipse.model;

public class Produit {
	private int id;
	private String nom;
	private String description;
	private String imageUrl;
	private float prixUnitaire;
	private int quantiteEnStock;

	public Produit() {
	}

	public Produit(int id, String nom, String description, String imageUrl, float prixUnitaire, int quantiteEnStock) {
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.imageUrl = imageUrl;
		this.prixUnitaire = prixUnitaire;
		this.quantiteEnStock = quantiteEnStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public int getQuantiteEnStock() {
		return quantiteEnStock;
	}

	public void setQuantiteEnStock(int quantiteEnStock) {
		this.quantiteEnStock = quantiteEnStock;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", description=" + description + ", imageUrl=" + imageUrl
				+ ", prixUnitaire=" + prixUnitaire + ", quantiteEnStock=" + quantiteEnStock + "]";
	}

}
