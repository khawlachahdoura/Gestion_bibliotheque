package Entities;

import java.sql.Date;

public class Emprunt {

	public int codeExemplaire;
	public int nbr_livre_disponible;
	public Date date_E;
	public Date date_RE;
	public Emprunt(int codeExemplaire, int nbr_livre_disponible, Date date_E, Date date_RE) {
		super();
		this.codeExemplaire = codeExemplaire;
		this.nbr_livre_disponible = nbr_livre_disponible;
		this.date_E = date_E;
		this.date_RE = date_RE;
	}
	public int getCodeExemplaire() {
		return codeExemplaire;
	}
	public void setCodeExemplaire(int codeExemplaire) {
		this.codeExemplaire = codeExemplaire;
	}
	public int getNbr_livre_disponible() {
		return nbr_livre_disponible;
	}
	public void setNbr_livre_disponible(int nbr_livre_disponible) {
		this.nbr_livre_disponible = nbr_livre_disponible;
	}
	public Date getDate_E() {
		return date_E;
	}
	public void setDate_E(Date date_E) {
		this.date_E = date_E;
	}
	public Date getDate_RE() {
		return date_RE;
	}
	public void setDate_RE(Date date_RE) {
		this.date_RE = date_RE;
	}
	@Override
	public String toString() {
		return "Emprunt [codeExemplaire=" + codeExemplaire + ", nbr_livre_disponible=" + nbr_livre_disponible
				+ ", date_E=" + date_E + ", date_RE=" + date_RE + "]";
	}
}
