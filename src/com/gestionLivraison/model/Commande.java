package com.gestionLivraison.model;
import java.util.Date;
import java.util.List;


enum Statut {
	  inTransit,
	  Delivred,
	  Conceled,
	}

public class Commande {
	String codeProduit;
	Client client;
	public String getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Statut getStatus() {
		return status;
	}
	public void setStatus(Statut status) {
		this.status = status;
	}
	public List<Article> getListArtcile() {
		return listArtcile;
	}
	public void setListArtcile(List<Article> listArtcile) {
		this.listArtcile = listArtcile;
	}
	public int getQuantite() {
		return Quantite;
	}
	public void setQuantite(int quantite) {
		Quantite = quantite;
	}
	public Date getDateDeCreation() {
		return dateDeCreation;
	}
	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
	public Date getDateDeLivraison() {
		return dateDeLivraison;
	}
	public void setDateDeLivraison(Date dateDeLivraison) {
		this.dateDeLivraison = dateDeLivraison;
	}
	Statut status;
	List<Article> listArtcile;
	int Quantite;
	Date dateDeCreation;
	Date dateDeLivraison;	
}
