<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="it.contrader.dto.IscrizioneDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/vittoriostyle.css" rel="stylesheet">
<title>Edit Iscrizione</title>
</head>
<body>
	<%@ include file="../css/header.jsp"%>
	<div class="navbar">
		<a href="homeadmin.jsp">Home</a> <a href="UserServlet?mode=userlist">Users</a>
		<a class="active" href="IscrizioneServlet?mode=iscrizionelist">Iscrizioni</a>
		<a href="LogoutServlet" id="logout">Logout</a>
</div>
	<br>
	<div class="main">

		<%IscrizioneDTO i = (IscrizioneDTO) request.getAttribute("dto");%>


		<form id="floatleft" action="IscrizioneServlet?mode=update&id=<%=i.getId_iscrizione()%>"method="post">
			<div class="row">
				<div class="col-25">
					<label for="id_iscrizione">Id iscrizione</label>
				</div>
				<div class="col-75">
					<input readonly="readonly" type="text" id ="id_iscrizione" name="id_iscrizione" placeholder="Id iscrizione" value="<%=i.getId_iscrizione()%>">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="user_id">User id</label>
				</div>
				<div class="col-75">
					<input type="text" id ="user_id" name="user_id" placeholder="User id" value="<%=i.getUser_id()%>">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="nome">Nome</label>
				</div>
				<div class="col-75">
					<input type="text" id ="nome" name="nome" placeholder="nome" value="<%=i.getNome()%>">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="cognome">Cognome</label>
				</div>
				<div class="col-75">
					<input type="text" id ="cognome" name="cognome" placeholder="cognome" value="<%=i.getCognome()%>">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="indirizzo_residenza">Indirizzo residenza</label>
				</div>
				<div class="col-75">
					<input type="text" id ="id_iscrizione" name="id_iscrizione" placeholder="id iscrizione" value="<%=i.getIndirizzo_residenza()%>">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="mail">Mail</label>
				</div>
				<div class="col-75">
					<input type="email" id ="mail" name="mail" placeholder="mail" value="<%=i.getMail()%>">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="codice_fiscale">Codice fiscale</label>
				</div>
				<div class="col-75">
					<input type="text" id ="codice_fiscale" name="codice_fiscale" placeholder="codice fiscale" value="<%=i.getCodice_fiscale()%>">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="num_c_identita">Num carta identita</label>
				</div>
				<div class="col-75">
					<input type="text" id ="num_c_identita" name="num_c_identita" placeholder="num carta identita" value="<%=i.getNum_c_identita()%>">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="abbonamento">Abbonamento</label>
				</div>
				<div class="col-75">
					<input type="text" id ="abbonamento" name="abbonamento" placeholder="abbonamento" value="<%=i.getAbbonamento()%>">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="cellulare">Cellulare</label>
				</div>
				<div class="col-75">
					<input type="text" id ="cellulare" name="cellulare"	placeholder="cellulare" value="<%=i.getCellulare()%>">  
				</div>
			</div>
			<button type="submit">Salva</button>
		</form>


	</div>
	<br>
	<%@ include file="../css/footer.jsp"%>
</body>
</html>