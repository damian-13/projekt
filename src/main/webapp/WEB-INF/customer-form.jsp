<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>System nauczania zdalnego</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Uczen</h3>
	
		<form:form action="saveUczen" modelAttribute="uczen" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />
					
			<table>
				<tbody>
					<tr>
						<td><label>Imie:</label></td>
						<td><form:input path="Imie" /></td>
					</tr>
				
					<tr>
						<td><label>Nazwisko:</label></td>
						<td><form:input path="Nazwisko" /></td>
						
						
					</tr>
					
					

					

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/uczen/list">Back to List</a>
		</p>
	
	</div>

</body>

</html>










