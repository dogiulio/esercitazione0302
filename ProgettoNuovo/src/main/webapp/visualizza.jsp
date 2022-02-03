<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "java.util.*" %>
<%@page import = "entita.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String cognome = request.getParameter("cognome");
String nome = request.getParameter("nome");
int eta = Integer.parseInt(request.getParameter("eta"));

Studente stud1 = new Studente();

stud1.setCognome(cognome);
stud1.setNome(nome);
stud1.setEta(eta);


ArrayList<Studente> studenti = new ArrayList<Studente>(); 


studenti.add(stud1);

session.setAttribute("studenti", studenti);

ArrayList<Studente> liststudenti=(ArrayList<Studente>)session.getAttribute("studenti");

out.println(liststudenti.get(0).getCognome());


%>


</body>
</html>