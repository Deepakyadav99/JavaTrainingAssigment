
<html>

<body bgcolor="yellow">
    
	<jsp:useBean id="dateObj" class="com.jspbean.PersonBean" />
	<jsp:setProperty property="date" name="dateObj" value="<%= (new java.util.Date()).toLocaleString()%>"/>
	<h1><jsp:getProperty property="date" name="dateObj"/></h1>





</body>

</html>