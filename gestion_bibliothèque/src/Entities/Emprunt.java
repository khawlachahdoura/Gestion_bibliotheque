package Entities;

import java.sql.Date;

public class Emprunt {

	
	public int nbr_livre_disponible;
	private int idEmprunt;
	private int idExemplaire;
	private int  idEtudiant;
	private Date date_E;
	private Date date_RE;
	public Emprunt(int idExemplaire, int idEtudiant, Date date_E, Date date_RE) {
		super();
		this.idExemplaire = idExemplaire;
		this.idEtudiant = idEtudiant;
		this.date_E = date_E;
		this.date_RE = date_RE;
	}
	public int getIdEmprunt() {
		return idEmprunt;
	}
	public void setIdEmprunt(int idEmprunt) {
		this.idEmprunt = idEmprunt;
	}
	 
	 
	public int getIdExemplaire() {
		return idExemplaire;
	}
	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
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
		return "Emprunt [idExemplaire=" + idExemplaire + ", idEtudiant=" + idEtudiant
				+ ", date_E=" + date_E + ", date_RE=" + date_RE + "]";
	}
	
}
