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
<jsp:useBean id="dane" class="com.example.servletjspdemo.domain.Dane" scope="session" />

<form action="dodajform.jsp">

  First name :<input type="text" name="imie" value="${dane.imie}" /><br />
  Last name :<input type="text"  name="nazwisko" value="${dane.nazwisko}" /><br />
  <input type="submit" value=" OK ">
  
</form>

</body>
</html>