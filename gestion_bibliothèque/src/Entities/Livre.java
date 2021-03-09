package Entities;

public class Livre {
	public int ISBN;
	public String titre;
	public String auteur;
	
	public Livre(int iSBN, String titre, String auteur) {
		super();
		ISBN = iSBN;
		this.titre = titre;
		this.auteur = auteur;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	@Override
	public String toString() {
		return "Livre [ISBN=" + ISBN + ", titre=" + titre + ", auteur=" + auteur + "]";
	}
	
	

}
