package org.eclipse.model;

public class Panier {
	private int idPanier;
	private Client client;

	public Panier() {
	}

	public Panier(int idPanier, Client client) {
		this.idPanier = idPanier;
		this.client = client;
	}

	public int getIdPanier() {
		return idPanier;
	}

	public void setIdPanier(int id) {
		this.idPanier = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Panier [idPanier=" + idPanier + ", client=" + client + "]";
	}

}
