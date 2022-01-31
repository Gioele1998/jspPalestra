package it.contrader.dto;

public class IscrizioneDTO {

	private int id_iscrizione;
	private int user_id;
	private String nome;
	private String cognome;
	private String indirizzo_residenza;
	private String mail;
	private String codice_fiscale;
	private String num_c_identita;
	private String abbonamento;
	private String cellulare;


	public IscrizioneDTO() {

	}

	public IscrizioneDTO (int user_id, String nome, String cognome, String indirizzo_residenza, String mail, String codice_fiscale, String num_c_identita, String abbonamento, String cellulare) {
		this.user_id = user_id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo_residenza = indirizzo_residenza;
		this.mail = mail;
		this.codice_fiscale = codice_fiscale;
		this.num_c_identita = num_c_identita;
		this.abbonamento = abbonamento;
		this.cellulare = cellulare;
	}
	public IscrizioneDTO (int id_iscrizione, int user_id, String nome, String cognome, String indirizzo_residenza, String mail, String codice_fiscale, String num_c_identita, String abbonamento, String cellulare) {
		this.id_iscrizione = id_iscrizione;
		this.user_id = user_id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo_residenza = indirizzo_residenza;
		this.mail = mail;
		this.codice_fiscale = codice_fiscale;
		this.num_c_identita = num_c_identita;
		this.abbonamento = abbonamento;
		this.cellulare = cellulare;
	}

	public int getId_iscrizione() {
		return id_iscrizione;
	}

	public void setId_iscrizione(int id_iscrizione) {
		this.id_iscrizione = id_iscrizione;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo_residenza() {
		return indirizzo_residenza;
	}

	public void setIndirizzo_residenza(String indirizzo_residenza) {
		this.indirizzo_residenza = indirizzo_residenza;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCodice_fiscale() {
		return codice_fiscale;
	}

	public void setCodice_fiscale(String codice_fiscale) {
		this.codice_fiscale = codice_fiscale;
	}

	public String getNum_c_identita() {
		return num_c_identita;
	}

	public void setNum_c_identita(String num_c_identita) {
		this.num_c_identita = num_c_identita;
	}

	public String getAbbonamento() {
		return abbonamento;
	}

	public void setAbbonamento(String abbonamento) {
		this.abbonamento = abbonamento;
	}

	public String getCellulare() {
		return cellulare;
	}

	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return   id_iscrizione + "\t"  + user_id +"\t\t" +   nome + "\t\t" +cognome +  indirizzo_residenza + "\t\t"  + mail + "\t\t" +   codice_fiscale + "\t\t" + num_c_identita + "\t\t" + abbonamento + "\t\t" + cellulare;
	}

}	
