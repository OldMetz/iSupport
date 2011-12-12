<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import = "java.util.List" %>
<%@ page import = "com.isupport.domain.Estimates" %>
<% List<Estimates> estimates = (List<Estimates>)request.getAttribute("estimates"); %>

<html>
<head>
<title>iSupport - Production Support</title>
</head>
<body>
	<jsp:include page='header.jsp' />
	<link href="styles.css" rel="stylesheet" type="text/css" />
<div id='support'>
<h1><small>iSupport - Estimates</small></h1>

		<ul>
			<li><p>
					<a href='allEstimates.jsp'>View All Estimates</a>
				</p></li>
			<li><p>
					<a href='findEstimates.jsp'>Find Estimates</a>
				</p></li>
			<li><p>
					<a href='newEstimate.jsp'>New Estimates</a>
				</p></li>
		</ul>
		
	<table border='0.5'>
		<tr>
			<th>Request Type</th>
			<th>Request Number</th>
			<th>Request Description</th>
			<th>Estimate (ManDays)</th>
			</tr>
		<tr>
<%
	for (Estimates nextEstimate : estimates) {
%>
		
			<tr>
			<td><h2> <%= nextEstimate.getRequestType() %></td>
			<td><h2> <%= nextEstimate.getRequestNumber() %></td>
			<td><h2> <%= nextEstimate.getName() %></h2></td>
			<td><h2> <%= nextEstimate.getEstimatedManDays() %></h2</td>
			</tr>
		
		<%
			}
		%>
	</table>	


</div>
</body>
</html>