package IserviceDAO;


import Entities.*;

public interface IDAOGérerNouveauEmp {
	boolean ajouter(Emprunt emprunt);
	boolean modifier(Emprunt emprunt);
	boolean supprimer(Emprunt emprunt);
}
