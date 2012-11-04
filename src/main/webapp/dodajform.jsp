<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="dane" class="com.example.servletjspdemo.domain.Dane" scope="session" />

<jsp:setProperty name="dane" property="*" /> 

<jsp:useBean id="data" class="com.example.servletjspdemo.service.Data" scope="application" />

<% 
  data.add(dane);
%>

<p>Following person has been added to storage: </p>
<p>First name: ${dane.imie} </p>
<p>Last Name: <jsp:getProperty name="dane" property="nazwisko"></jsp:getProperty></p>
<p>
  <a href="Form.jsp">Form</a>
</p>

</body>
</html>