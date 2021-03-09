package IserviceDAO;


import Entities.*;

public interface IDAOGérerNouveauEmp {
	void ajouter(Emprunt emprunt);
	void modifier(Emprunt emprunt);
	void supprimer(Emprunt emprunt);
}
