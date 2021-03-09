package IserviceDAO;

import Entities.*;

public interface IDAOGérerLivre {
	void ajouter(Livre livre);
	void modifier(Livre livre);
	void supprimer(Livre livre);
}
