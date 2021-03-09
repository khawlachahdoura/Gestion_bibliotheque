package ImpDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

import Business.mySingleton;
import Entities.Emprunt;
import IserviceDAO.IDAOGererNouveauEmp;

public class ImpDAOGererNouveauEmp implements IDAOGererNouveauEmp {

	private PreparedStatement inserEmprunt = null;
	private static Statement ps = null;

	private static ResultSet rs = null;
	private mySingleton mySing = mySingleton.getInstance();

	private Connection conn = mySing.getConnection();

	@Override
	public boolean ajouter(Emprunt emprunt) {
		try {

			inserEmprunt = conn.prepareStatement("INSERT INTO `emprunt` VALUES (NULL, ?, ?, ?, ?)");

			inserEmprunt.setDate(1, emprunt.getDate_E());

			inserEmprunt.setDate(2, emprunt.getDate_RE());
			inserEmprunt.setInt(3, emprunt.getIdExemplaire());

			inserEmprunt.setInt(4, emprunt.getIdEtudiant());

			inserEmprunt.executeUpdate();
			return true;
		}

		catch (SQLException e) {

			System.out.println("add emprunt :" + e.getMessage());

		}

		return false;

	}

	@Override
	public boolean supprimer(int idEmprunt) {
		try {

			inserEmprunt = conn.prepareStatement("DDELETE FROM `emprunt` WHERE `emprunt`.`idEmpt`  = ?");
			 
			inserEmprunt.setInt(1, idEmprunt);

			inserEmprunt.executeUpdate();
			return true;
		}

		catch (SQLException e) {

			System.out.println("Delete :"+ idEmprunt +" " + e.getMessage());

		}

		return false;

	}

	@Override
	public boolean modifierDateEmp(int idEmpt, Date nvDateEmp) {
		try {

			inserEmprunt = conn.prepareStatement(
					"UPDATE `emprunt` SET `DateEmprunt` = ? WHERE `emprunt`.`idEmpt` = ?;");

			inserEmprunt.setDate(1, nvDateEmp);
			inserEmprunt.setInt(2, idEmpt);

			inserEmprunt.executeUpdate();
			return true;
		}

		catch (SQLException e) {

			System.out.println("update :" + e.getMessage());

		}

		return false;
	}

	@Override
	public boolean modifierDateRet(int idEmpt,Date nvDateRet) {
		try {

			inserEmprunt = conn.prepareStatement(
					"UPDATE `emprunt` SET `DateRetour` = ?  WHERE `emprunt`.`idEmpt` = ?;");

			inserEmprunt.setDate(1, nvDateRet);
			inserEmprunt.setInt(2, idEmpt);

			inserEmprunt.executeUpdate();
			return true;
		}

		catch (SQLException e) {

			System.out.println("update DateRet :" + e.getMessage());

		}

		return false;
	}

	@Override
	public boolean modifieridExemplaire(int idEmpt, int nvIDExemplaire) {
		

		try {

			inserEmprunt = conn.prepareStatement(
					"UPDATE `emprunt` SET `idExemplaire` = ? WHERE `emprunt`.`idEmpt` = ?;");

			inserEmprunt.setInt(1, nvIDExemplaire);
			inserEmprunt.setInt(2, idEmpt);

			inserEmprunt.executeUpdate();
			return true;
		}

		catch (SQLException e) {

			System.out.println("update :" + e.getMessage());

		}

		return false;
	}

	@Override
	public boolean modifieridEtudiant(int idEmpt, int nbIDEtudiant) {
		try {

			inserEmprunt = conn.prepareStatement(
					"UPDATE `emprunt` SET `idEtudiant` = ? WHERE `emprunt`.`idEmpt` = ?;");

			inserEmprunt.setInt(1, nbIDEtudiant);
			inserEmprunt.setInt(2, idEmpt);

			inserEmprunt.executeUpdate();
			return true;
		}

		catch (SQLException e) {

			System.out.println("update :" + e.getMessage());

		}

		return false;
	}

	
	

}
