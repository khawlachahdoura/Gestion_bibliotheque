package ImpDAO;

import java.sql.*;

import Business.mySingleton;
import Entities.Livre;
import IserviceDAO.IDAOGererLivre;

public class ImpDAOGererLivre implements IDAOGererLivre {
	private PreparedStatement inserLivre = null;
	private static Statement ps = null;

	private static ResultSet rs = null;
	private mySingleton mySing = mySingleton.getInstance();

	private Connection conn = mySing.getConnection();

	@Override
	public boolean ajouter(Livre livre) {

		try {

			inserLivre = conn.prepareStatement("INSERT INTO `livre`  VALUES ( ?, ?, ?, ?)");

			inserLivre.setInt(1, livre.getISBN());

			inserLivre.setString(2, livre.getTitre());
			inserLivre.setString(3, livre.getTheme());

			inserLivre.setString(4, livre.getAuteur());

			inserLivre.executeUpdate();
			return true;
		}

		catch (SQLException e) {

			System.out.println("add livre :" + e.getMessage());

		}

		return false;

	}

	@Override
	public boolean supprimer(int isbn) {
		try {

			inserLivre = conn.prepareStatement("DELETE FROM `livre` WHERE `livre`.`ISBN` = ?");

			inserLivre.setInt(1, isbn);

			inserLivre.executeUpdate();
			return true;
		}

		catch (SQLException e) {

			System.out.println("Delete :" + e.getMessage());

		}

		return false;
	}

	@Override
	public boolean updateISBN(int nisbn, int aISBN) {
		try {

			inserLivre = conn.prepareStatement("UPDATE `livre` SET `isbn` = ? WHERE `livre`.`ISBN` = ?");

			inserLivre.setInt(1, nisbn);
			inserLivre.setInt(2, aISBN);

			inserLivre.executeUpdate();
			return true;
		}

		catch (SQLException e) {

			System.out.println("update :" + e.getMessage());

		}

		return false;
	}

	@Override
	public boolean updateTitre(String titre, int aISBN) {
		try {

			inserLivre = conn.prepareStatement("UPDATE `livre` SET `titre` = ? WHERE `livre`.`ISBN` = ?");

			inserLivre.setString(1, titre);
			inserLivre.setInt(2, aISBN);

			inserLivre.executeUpdate();
			return true;
		}

		catch (SQLException e) {

			System.out.println("update :" + e.getMessage());

		}

		return false;
	}

	@Override
	public boolean updateTheme(String theme, int aISBN) {
		try {

			inserLivre = conn.prepareStatement("UPDATE `livre` SET `theme` = ? WHERE `livre`.`ISBN` = ?");

			inserLivre.setString(1, theme);
			inserLivre.setInt(2, aISBN);

			inserLivre.executeUpdate();
			return true;
		}

		catch (SQLException e) {

			System.out.println("update :" + e.getMessage());

		}

		return false;
	}

	@Override
	public boolean updateAuteur(String auteur, int aISBN) {
		try {

			inserLivre = conn.prepareStatement("UPDATE `livre` SET `auteur` = ? WHERE `livre`.`ISBN` = ?");

			inserLivre.setString(1, auteur);
			inserLivre.setInt(2, aISBN);

			inserLivre.executeUpdate();
			return true;
		}

		catch (SQLException e) {

			System.out.println("update :" + e.getMessage());

		}

		return false;
	}

}
