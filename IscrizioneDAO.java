package it.contrader.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.contrader.model.Iscrizione;
import it.contrader.model.User;
import it.contrader.utils.ConnectionSingleton;

public class IscrizioneDAO implements DAO<Iscrizione> {

	private final String QUERY_ALL = "SELECT * FROM iscrizione";
	private final String QUERY_CREATE = "INSERT INTO iscrizione (user_id, nome, cognome, indirizzo_residenza, mail, codice_fiscale, num_c_identita, abbonamento, cellulare) VALUES (?,?,?,?,?,?,?,?,?)";
	private final String QUERY_READ = "SELECT * FROM iscrizione WHERE id_iscrizione=?";
	private final String QUERY_UPDATE = "UPDATE iscrizione SET user_id=?, nome=?, cognome=?, indirizzo_residenza=?, mail=?, codice_fiscale=?, num_c_identita=?, abbonamento=?, CELLULARE=? WHERE id_iscrizione=?";
	private final String QUERY_DELETE = "DELETE FROM iscrizione WHERE id_iscrizione=?";

	public IscrizioneDAO() {

	}

	@Override
	public List<Iscrizione> getAll() {
		List<Iscrizione> iscrizioneList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL);
			Iscrizione iscrizione;
			while (resultSet.next()) {
				int id_iscrizione = resultSet.getInt("id_iscrizione");
				int user_id = resultSet.getInt("user_id");
				String nome = resultSet.getString("nome");
				String cognome = resultSet.getString("cognome");
				String indirizzo_residenza = resultSet.getString("indirizzo_residenza");
				String mail = resultSet.getString("mail");
				String codice_fiscale = resultSet.getString("codice_fiscale");
				String num_c_identita = resultSet.getString("num_c_identita");
				String abbonamento = resultSet.getString("abbonamento");
				String cellulare = resultSet.getString("cellulare");
				iscrizione= new Iscrizione(user_id, nome, cognome, indirizzo_residenza, mail, codice_fiscale,num_c_identita,abbonamento, cellulare); 
				iscrizione.setId_iscrizione(id_iscrizione);
				iscrizioneList.add(iscrizione);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return iscrizioneList;
	}

	public boolean insert(Iscrizione iscrizioneToInsert) {
		Connection connection = ConnectionSingleton.getInstance();
		try {	
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_CREATE);
			preparedStatement.setInt(1, iscrizioneToInsert.getUser_id());
			preparedStatement.setString(2, iscrizioneToInsert.getNome());
			preparedStatement.setString(3, iscrizioneToInsert.getCognome());
			preparedStatement.setString(4, iscrizioneToInsert.getIndirizzo_residenza());
			preparedStatement.setString(5, iscrizioneToInsert.getMail());
			preparedStatement.setString(6, iscrizioneToInsert.getCodice_fiscale());
			preparedStatement.setString(7, iscrizioneToInsert.getNum_c_identita());
			preparedStatement.setString(8, iscrizioneToInsert.getAbbonamento());
			preparedStatement.setString(9, iscrizioneToInsert.getCellulare()); 
			System.out.println(preparedStatement.toString());
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			return false;
		}

	}	


	@Override
	public Iscrizione read(int id_iscrizione) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
			preparedStatement.setInt(1, id_iscrizione);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			int user_id;
			String nome, cognome, indirizzo_residenza, mail, codice_fiscale, num_c_identita, abbonamento, cellulare;

			user_id = resultSet.getInt("user_id");
			nome = resultSet.getString("nome");
			cognome = resultSet.getString("cognome");
			indirizzo_residenza = resultSet.getString("indirizzo_residenza");
			mail = resultSet.getString("mail");
			codice_fiscale = resultSet.getString("codice_fiscale");
			num_c_identita = resultSet.getString("num_c_identita");
			abbonamento = resultSet.getString("abbonamento");
			cellulare = resultSet.getString("cellulare");
			Iscrizione iscrizione = new Iscrizione(user_id, nome, cognome, indirizzo_residenza, mail, codice_fiscale, num_c_identita, abbonamento, cellulare);
			iscrizione.setId_iscrizione(resultSet.getInt("id_iscrizione"));

			return iscrizione;
		} catch (SQLException e) {
			return null;
		}
		}
	

	@Override
	public boolean update(Iscrizione iscrizioneToUpdate) {
		Connection connection = ConnectionSingleton.getInstance();

		// Check if id is present
		if (iscrizioneToUpdate.getId_iscrizione() == 0)
			return false;

		Iscrizione iscrizioneRead = read(iscrizioneToUpdate.getId_iscrizione());
		if (!iscrizioneRead.equals(iscrizioneToUpdate)) {
			try {

				if (iscrizioneToUpdate.getUser_id() == 0 ) {
					return false;
				}
				if (iscrizioneToUpdate.getNome() == null || iscrizioneToUpdate.getNome().equals("")) {
					iscrizioneToUpdate.setNome(iscrizioneRead.getNome());
				}

				if (iscrizioneToUpdate.getCognome() == null || iscrizioneToUpdate.getCognome().equals("")) {
					iscrizioneToUpdate.setCognome(iscrizioneRead.getCognome());
				}
				if (iscrizioneToUpdate.getIndirizzo_residenza() == null || iscrizioneToUpdate.getIndirizzo_residenza().equals("")) {
					iscrizioneToUpdate.setIndirizzo_residenza(iscrizioneRead.getIndirizzo_residenza());
				}
				if (iscrizioneToUpdate.getMail() == null || iscrizioneToUpdate.getMail().equals("")) {
					iscrizioneToUpdate.setMail(iscrizioneRead.getMail());
				}
				if (iscrizioneToUpdate.getCodice_fiscale() == null || iscrizioneToUpdate.getCodice_fiscale().equals("")) {
					iscrizioneToUpdate.setCodice_fiscale(iscrizioneRead.getCodice_fiscale());
				}
				if (iscrizioneToUpdate.getNum_c_identita() == null || iscrizioneToUpdate.getNum_c_identita().equals("")) {
					iscrizioneToUpdate.setNum_c_identita(iscrizioneRead.getNum_c_identita());
				}
				if (iscrizioneToUpdate.getAbbonamento() == null || iscrizioneToUpdate.getAbbonamento().equals("")) {
					iscrizioneToUpdate.setAbbonamento(iscrizioneRead.getAbbonamento());
				}
				if (iscrizioneToUpdate.getCellulare() == null || iscrizioneToUpdate.getCellulare().equals("")) {
					iscrizioneToUpdate.setCellulare(iscrizioneRead.getCellulare());
				}

			
				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);
				preparedStatement.setInt(1, iscrizioneToUpdate.getUser_id());
				preparedStatement.setString(2, iscrizioneToUpdate.getNome());
				preparedStatement.setString(3, iscrizioneToUpdate.getCognome());
				preparedStatement.setString(4, iscrizioneToUpdate.getIndirizzo_residenza());
				preparedStatement.setString(5, iscrizioneToUpdate.getMail());
				preparedStatement.setString(6, iscrizioneToUpdate.getCodice_fiscale());
				preparedStatement.setString(7, iscrizioneToUpdate.getNum_c_identita());
				preparedStatement.setString(8, iscrizioneToUpdate.getAbbonamento());
				preparedStatement.setString(9, iscrizioneToUpdate.getCellulare());
				preparedStatement.setInt(10, iscrizioneToUpdate.getId_iscrizione());

				int a = preparedStatement.executeUpdate();
				if (a > 0)
					return true;
				else
					return false;

			} catch (SQLException e) {
				return false;
			}
		}

		return false;

	}

	public boolean delete(int id_iscrizione) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
			preparedStatement.setInt(1, id_iscrizione);
			int n = preparedStatement.executeUpdate();
			if (n != 0)
				return true;

		} catch (SQLException e) {
		}
		return false;
	}

	
}
