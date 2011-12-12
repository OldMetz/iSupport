<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<title>iSupport - New Estimate</title>
</head>
<body>
	<jsp:include page='header.jsp' />
	<link href="styles.css" rel="stylesheet" type="text/css" />
<div id='support'>
	<h1>New Estimate!</h1>

	<form method='POST' action="newEstimate.jsp">
		<p>
			Request Type : <select name="REQUEST_TYPE">
				<option>BCR</option>
				<option>ECR</option>
				<option>ICR</option>
			</select>
		</p>
		<p>
			Request Number : <input type="TEXT" name="REQUEST_NUMBER" />
		</p>
		<p>
			Request Description : <input type="TEXT" name="REQUEST_DESCRIPTION" />
		</p>
		<p>
			Optimistic ManDays : <input type="TEXT" name="OPTIMISTIC_MANDAYS" />
		</p>
				<p>
			Realistic ManDays : <input type="TEXT" name="REALISTIC_MANDAYS" />
		</p>
				<p>
			Pesimistic ManDays : <input type="TEXT" name="PESIMISTIC_MANDAYS" />
		</p>
		<p>
			<input type="SUBMIT" value="Submit">
		</p>
		<p>
			<input type="RESET">
		</p>
	</form>
</div>
</body>
</html>