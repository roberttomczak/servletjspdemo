<jsp:useBean id="form" class="com.example.servletjspdemo.web.Form" scope="page"/>
<jsp:setProperty property="imie" name="form" param="imie"/>
<jsp:setProperty property="nazwisko" name="form" param="nazwisko"/>
<jsp:setProperty property="jedzenie" name="form" param="jedzenie"/>
<jsp:useBean id="formapp" class="com.example.servletjspdemo.web.Form" scope="application"/> 
<jsp:setProperty property="cars" name="form" param="cars"/>
<jsp:setProperty property="hobby" name="form" param="hobby"/>
<body>
Imie: <%= form.getImie() %><BR>
Nazwisko: <%= form.getNazwisko() %><BR>
Jedzenie: <%= form.getJedzenie() %><BR>
Hobby: <%= form.getHobby() %><BR>
Car: <jsp:getProperty name="formapp" property="cars" /><BR>
</body>
</html>