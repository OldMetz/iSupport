<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="todaysDate" value="<%= new java.util.Date() %>"/>

<h1><input type='image' src='prod_support_logo_v2.png'/></h1>

<div id="links">
	<ul>
		<li><a href='index.jsp'>Home</a></li>
		<li><a href='prodsupport.jsp'>Production Support</a></li>
		<li><a href='development.jsp'>Development</a></li>
	</ul>
</div>