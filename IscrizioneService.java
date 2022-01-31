package it.contrader.service;

import it.contrader.converter.IscrizioneConverter;
import it.contrader.dao.IscrizioneDAO;
import it.contrader.dto.IscrizioneDTO;
import it.contrader.model.Iscrizione;

public class IscrizioneService extends AbstractService<Iscrizione, IscrizioneDTO> {
	public IscrizioneService(){
		this.dao = new IscrizioneDAO();
		this.converter = new IscrizioneConverter();
	} 

}
