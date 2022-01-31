package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.IscrizioneDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.Iscrizione;
import it.contrader.model.User;

public class IscrizioneConverter  implements Converter<Iscrizione, IscrizioneDTO> {

	public IscrizioneDTO toDTO(Iscrizione iscrizione) {
		IscrizioneDTO iscrizioneDTO = new IscrizioneDTO(iscrizione.getId_iscrizione(), iscrizione.getUser_id(), iscrizione.getNome(), iscrizione.getCognome(), iscrizione.getIndirizzo_residenza(), iscrizione.getMail(), iscrizione.getCodice_fiscale(), iscrizione.getNum_c_identita(), iscrizione.getAbbonamento(), iscrizione.getCellulare());
		return iscrizioneDTO;

	}

	@Override
	public Iscrizione toEntity(IscrizioneDTO iscrizioneDTO) {
		Iscrizione iscrizione = new Iscrizione(iscrizioneDTO.getId_iscrizione(), iscrizioneDTO.getUser_id(), iscrizioneDTO.getNome(), iscrizioneDTO.getCognome(), iscrizioneDTO.getIndirizzo_residenza(), iscrizioneDTO.getMail(), iscrizioneDTO.getCodice_fiscale(), iscrizioneDTO.getNum_c_identita(), iscrizioneDTO.getAbbonamento(), iscrizioneDTO.getCellulare());
		return iscrizione;
	}

	@Override
	public List<IscrizioneDTO> toDTOList(List<Iscrizione> iscrizioneList) {
		List<IscrizioneDTO> iscrizioneDTOList = new ArrayList<IscrizioneDTO>();
		for(Iscrizione iscrizione : iscrizioneList) {
			iscrizioneDTOList.add(toDTO(iscrizione));
		}

		return iscrizioneDTOList;
	}
}
