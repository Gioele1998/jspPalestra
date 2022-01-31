<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.IscrizioneDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../css/vittoriostyle.css" rel="stylesheet">
<title>Read Iscrizione</title>
</head>
<body>
<%@ include file="../css/header.jsp" %>

<div class="navbar">
		<a href="homeadmin.jsp">Home</a> <a href="UserServlet?mode=userlist">Users</a>
		<a class="active" href="IscrizioneServlet?mode=iscrizionelist">Iscrizioni</a>
		<a href="LogoutServlet" id="logout">Logout</a>
</div>
	
<br>

<div class="main">
<%IscrizioneDTO i = (IscrizioneDTO) request.getAttribute("dto");%>

<table>
	<tr> 
				<th>id iscrizione</th>
				<th>user id</th>
				<th>nome</th>
				<th>cognome</th>
				<th>indirizzo residenza</th>
				<th>mail</th>
				<th>codice fiscale</th>
				<th>num carta identita</th>
				<th>abbonamento</th>
				<th>cellulare</th>

	</tr>
	<tr>
		<td><%=i.getId_iscrizione()%></td>
		<td><%=i.getUser_id()%></td>
		<td><%=i.getNome()%></td>
		<td><%=i.getCognome()%></td>
		<td><%=i.getIndirizzo_residenza()%></td>
		<td><%=i.getMail()%></td>
		<td><%=i.getCodice_fiscale()%></td>
		<td><%=i.getNum_c_identita()%></td>
		<td><%=i.getAbbonamento()%></td>
		<td><%=i.getCellulare()%></td>
	</tr>	
</table>

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>


</div>

<%@ include file="../css/footer.jsp" %>
</body>
</html>