package IserviceDAO;

import Entities.*;

public interface IDAOGererLivre {
	boolean ajouter(Livre livre);
	boolean updateISBN(int isbn, int aISBN);
	boolean updateTitre(String titre, int aISBN);
	boolean updateTheme(String theme, int aISBN);
	boolean updateAuteur(String auteur, int aISBN);
	boolean supprimer(int isbn );
}
