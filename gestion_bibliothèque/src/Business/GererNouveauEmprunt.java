package Business;
import Entities.Emprunt;
import Entities.Livre;
import ImplementDAO.ImpDAOGererLivre;
import ImplementDAO.ImpDAOGererNouveauEmp;
public class GererNouveauEmprunt {

	private ImpDAOGererNouveauEmp iDaoGererNouveauEmp;

	public GererNouveauEmprunt(ImpDAOGererNouveauEmp _iDaoGererNouveauEmp) {

		iDaoGererNouveauEmp = _iDaoGererNouveauEmp;

	}

	private boolean addEmprunt(Emprunt emprunt) {

		if (iDaoGererNouveauEmp.ajouter(emprunt)) {
			return true;
		}
		return false;

	}

	private boolean updateEmprunt(Emprunt emprunt) {

		if (iDaoGererNouveauEmp.modifier(emprunt)) {
			return true;
		}
		return false;

	}

	private boolean deleteEmprunt(Emprunt emprunt) {

		if (iDaoGererNouveauEmp.supprimer(emprunt)) {
			return true;
		}
		return false;

	}

}
