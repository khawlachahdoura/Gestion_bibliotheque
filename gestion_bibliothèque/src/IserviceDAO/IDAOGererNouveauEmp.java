package IserviceDAO;


import Entities.*;

public interface IDAOGererNouveauEmp {
	boolean ajouter(Emprunt emprunt);
	boolean modifier(Emprunt emprunt);
	boolean supprimer(Emprunt emprunt);
}
