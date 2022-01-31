package it.contrader.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.contrader.dto.IscrizioneDTO;
import it.contrader.dto.UserDTO;
import it.contrader.service.IscrizioneService;
import it.contrader.service.UserService;
import it.contrader.service.Service;

public class IscrizioneServlet extends HttpServlet  {

	private static final long serialVersionUID = 1L;

	public IscrizioneServlet() {
	}
	
	public void updateList(HttpServletRequest request) {
		Service<IscrizioneDTO> service = new IscrizioneService();
		List<IscrizioneDTO> listDTO = service.getAll();
		request.setAttribute("list", listDTO);
	
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service<IscrizioneDTO> service = new IscrizioneService();
		String mode = request.getParameter("mode");
		IscrizioneDTO dto;
		int id_iscrizione;
		boolean ans;

		switch (mode.toUpperCase()) {

		case "ISCRIZIONELIST":
			updateList(request);
			getServletContext().getRequestDispatcher("/iscrizione/iscrizionemanager.jsp").forward(request, response);
		break;

		case "READ":
			id_iscrizione = Integer.parseInt(request.getParameter("id"));
			dto = service.read(id_iscrizione);
			request.setAttribute("dto", dto);

			if (request.getParameter("update") == null) {
				getServletContext().getRequestDispatcher("/iscrizione/readiscrizione.jsp").forward(request, response);
			}
			else {
				getServletContext().getRequestDispatcher("/iscrizione/updateiscrizione.jsp").forward(request, response);
			}

			break;

		case "INSERT":
			int user_id = Integer.parseInt(request.getParameter("user_id").toString());
			String nome = request.getParameter("nome").toString();
			String cognome = request.getParameter("cognome").toString();
			String indirizzo_residenza = request.getParameter("indirizzo_residenza").toString();
			String mail = request.getParameter("mail").toString();
			String codice_fiscale = request.getParameter("codice_fiscale").toString();
			String num_c_identita = request.getParameter("num_c_identita").toString();
			String abbonamento = request.getParameter("abbonamento").toString();
			String cellulare = request.getParameter("cellulare").toString();
			dto = new IscrizioneDTO (user_id, nome, cognome, indirizzo_residenza, mail, codice_fiscale, num_c_identita, abbonamento, cellulare);
			ans = service.insert(dto);

			request.setAttribute("ans", ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/iscrizione/iscrizionemanager.jsp").forward(request, response);
			break;

		case "UPDATE":
			user_id = Integer.parseInt(request.getParameter("id"));
			nome = request.getParameter("nome");
			cognome = request.getParameter("cognome");
			indirizzo_residenza = request.getParameter("indirizzo_residenza");
			mail = request.getParameter("mail");
			codice_fiscale = request.getParameter("codice_fiscale");
			num_c_identita = request.getParameter("num_c_identita");
			abbonamento = request.getParameter("abbonamento");
			cellulare = request.getParameter("cellulare");
			id_iscrizione = Integer.parseInt(request.getParameter("id"));
			dto = new IscrizioneDTO (id_iscrizione, user_id, nome, cognome, indirizzo_residenza, mail, codice_fiscale, num_c_identita, abbonamento, cellulare);
			System.out.println(dto.toString());
			ans = service.update(dto); 
			System.out.println(ans);
			updateList(request);
			getServletContext().getRequestDispatcher("/iscrizione/iscrizionemanager.jsp").forward(request, response);
			break;

			case "DELETE":
				id_iscrizione = Integer.parseInt(request.getParameter("id"));
				ans = service.delete(id_iscrizione);
				request.setAttribute("ans", ans);
				updateList(request);
				getServletContext().getRequestDispatcher("/iscrizione/iscrizionemanager.jsp").forward(request, response);
				break;
		}
	}
}

