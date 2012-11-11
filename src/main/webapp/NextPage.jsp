<jsp:useBean id="user" class="com.example.servletjspdemo.web.users" scope="page"/> 
<jsp:setProperty name="user" property="username" param="username" />
<jsp:setProperty name="user" property="email" param="email"/>
<jsp:setProperty name="user" property="choice" param="choice"/>
<jsp:setProperty name="user" property="hobby" param="hobby" />
<jsp:useBean id="userapp" class="com.example.servletjspdemo.web.users" scope="application"/> 
<jsp:setProperty name="userapp" property="age" param="age"/>
<jsp:setProperty name="userapp" property="car" param="car"/>
<BODY>
You entered<BR>
Name: <%= user.getUsername() %><BR>
Email: <%= user.getEmail() %><BR>
Age: <%= user.getAge() %><BR>
Choice: <%= user.getchoice() %><BR>
Hobby: <%= userapp.gethobby() %><BR>
Car: <%= userapp.getcar() %><BR>
</BODY>
</HTML>