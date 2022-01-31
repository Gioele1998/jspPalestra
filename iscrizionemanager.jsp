<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List"
	import="it.contrader.dto.IscrizioneDTO"
	import="it.contrader.dto.UserDTO"  
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Iscrizione manager</title>
</head>
<body>

	<%@ include file="../css/header.jsp"%>

	<div class="navbar">
		<a href="homeadmin.jsp">Home</a> <a href="UserServlet?mode=userlist">Users</a>
		<a class="active" href="IscrizioneServlet?mode=iscrizionelist">Iscrizioni</a>
		<a href="LogoutServlet" id="logout">Logout</a>
	</div>
	
	<div class="main">
		<%
		List<IscrizioneDTO> list = (List<IscrizioneDTO>) request.getAttribute("list");
		//List<UserDTO> userList = (List<UserDTO>) request.getAttribute("userList");
		%>

		<br>

		<table>

			<tr>
				<th>Id iscrizione</th>
				<th>User id</th>
				<th>Nome</th>
				<th>Cognome</th>
				<th>Indirizzo Residenza</th>
				<th>Mail</th>
				<th>Codice Fiscale</th>
				<th>Num. Carta Identità</th>
				<th>Abbonamento</th>
				<th>Cellulare</th>
				<th></th>
				<th></th>

			</tr>
		<%
		for (IscrizioneDTO i : list) {
		%>
		<tr>
		    <td><a href=IscrizioneServlet?mode=read&id=<%=i.getId_iscrizione()%>><%=i.getId_iscrizione()%></a></td>
		    <td><%=i.getUser_id()%></td>
			<td><%=i.getNome()%></td>
			<td><%=i.getCognome()%></td>
			<td><%=i.getIndirizzo_residenza()%></td>
			<td><%=i.getMail()%></td>
			<td><%=i.getCodice_fiscale()%></td>
			<td><%=i.getNum_c_identita()%></td>
			<td><%=i.getAbbonamento()%></td>
			<td><%=i.getCellulare()%></td>
			<td><a href=IscrizioneServlet?mode=read&update=true&id=<%=i.getId_iscrizione()%>>Edit</a></td>
			<td><a href=IscrizioneServlet?mode=delete&id=<%=i.getId_iscrizione()%>>Delete</a></td>

		</tr>
		<%
		}
		%>
		</table>
		
		<form id="floatright" action="IscrizioneServlet?mode=insert" method="post">
			<div class="row">
				<div class="col-25">
					<label for="type">Utente</label>
				</div>
				<div class="col-75">
					<input type="text" id="type" name="user_id" placeholder="nome">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="nome">Nome</label>
				</div>
				<div class="col-75">
					<input type="text" id="nome" name="nome" placeholder="nome">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="cognome">Cognome</label>
				</div>
				<div class="col-75">
					<input type="text" id="cognome" name="cognome" placeholder="cognome">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="indirizzo_residenza">Indirizzo Residenza</label>
				</div>
				<div class="col-75">
					<input type="text" id="indirizzo_residenza" name="indirizzo_residenza" placeholder="indirizzo residenza">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="mail">Mail</label>
				</div>
				<div class="col-75">
					<input type="email" id="mail" name="mail" placeholder="@mail">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="codice_fiscale">Codice Fiscale</label>
				</div>
				<div class="col-75">
					<input type="text" id="codice_fiscale" name="codice_fiscale" placeholder="codice fiscale">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="num_c_identita">Num. Carta Identità</label>
				</div>
				<div class="col-75">
					<input type="text" id="num_c_identita" name="num_c_identita" placeholder="carta identità">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="abbonamento">Abbonamento</label>
				</div>
				<div class="col-75">
					<input type="text" id="abbonamento" name="abbonamento" placeholder="abbonamento">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="cellulare">Cellulare</label>
				</div>
				<div class="col-75">
					<input type="text" id="cellulare" name="cellulare" placeholder="cellulare">
				</div>
			</div>
			<button type="submit">Insert</button>
			<button type="reset">Reset</button>
		</form>

	</div>
	<br>
	<%@ include file="../css/footer.jsp"%>
</body>
</html>