<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<title>iSupport - Production Support</title>
</head>
<body>
	<jsp:include page='header.jsp' />
	<link href="styles.css" rel="stylesheet" type="text/css" />
	<div id='support'>
		<h1>
			<small>iSupport - Estimates</small>
		</h1>
		<p>Welcome to the Estimates page.</p>
		<p>From the options listed - Please select an Option</p>
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
	</div>
</body>
</html>