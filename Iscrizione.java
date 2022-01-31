package it.contrader.model;

public class Iscrizione {

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


	public Iscrizione() {

	}

	public Iscrizione (int user_id, String nome, String cognome, String indirizzo_residenza, String mail, String codice_fiscale, String num_c_identita, String abbonamento, String cellulare) {
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
	
	public Iscrizione (int id_iscrizione, int user_id, String nome, String cognome, String indirizzo_residenza, String mail, String codice_fiscale, String num_c_identita, String abbonamento, String cellulare) {
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
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Iscrizione other = (Iscrizione) obj;
		
		if (id_iscrizione != other.id_iscrizione)
			return false;
		
		if (user_id == 0) {
			if (user_id != other.user_id)
				return false;
		}
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (indirizzo_residenza == null) {
			if (other.indirizzo_residenza != null)
				return false;
		} else if (!indirizzo_residenza.equals(other.indirizzo_residenza))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (codice_fiscale == null) {
			if (other.codice_fiscale != null)
				return false;
		} else if (!codice_fiscale.equals(other.codice_fiscale))
			return false;
		if (num_c_identita == null) {
			if (other.num_c_identita != null)
				return false;
		} else if (!num_c_identita.equals(other.num_c_identita))
			return false;
		if (abbonamento == null) {
			if (other.abbonamento != null)
				return false;
		} else if (!abbonamento.equals(other.abbonamento))
			return false;
		if (cellulare == null) {
			if (other.cellulare != null)
				return false;
		} else if (!cellulare.equals(other.cellulare))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Iscrizione [id_iscrizione=" + id_iscrizione + ", user_id=" + user_id + ", nome=" + nome + ", cognome="
				+ cognome + ", indirizzo_residenza=" + indirizzo_residenza + ", mail=" + mail + ", codice_fiscale="
				+ codice_fiscale + ", num_c_identita=" + num_c_identita + ", abbonamento=" + abbonamento
				+ ", cellulare=" + cellulare + "]";
	}
	
}
	
