<%@page import="com.example.servletjspdemo.domain.Dane"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="data" class="com.example.servletjspdemo.service.Data" scope="application" />
<%
  for (Dane dane : data.getAllDane()) {
	  out.println("<p>First name: " + dane.getImie() + "; Last name: " + dane.getNazwisko() + "</p>");
  }
%>
<p>
  <a href="wypform.jsp">Wypelnij formularz</a>
</p>

</body>
</html>