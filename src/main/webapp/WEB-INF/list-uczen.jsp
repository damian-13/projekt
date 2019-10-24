<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@  taglib prefix="security" uri="http://www.springframework.org/security/tags"%> 
<!DOCTYPE html>

<html>

<head>
	<title>Lista uczniow</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<p>
				User: <security:authentication property="principal.username" />
				<br><br>
				Role(s): <security:authentication property="principal.authorities" />
			</p>
			
			<!-- put new button: Add Customer -->
			<input type="button" value="Add Uczen"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add a search box -->
			<form:form action="search" method="GET">
				Search Uczen: <input type="text" name="theSearchName" />
				
				<input type="submit" value="Search" class="add-button" />
			</form:form>
			
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Id</th>
					<th>Imie</th>
					<th>Nazwisko</th>
					
					<th>Action</th>
					
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempUczen" items="${uczens}">
				
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/uczen/showFormForUpdate">
						<c:param name="uczenId" value="${tempUczen.id}" />
					</c:url>					

					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/uczen/delete">
						<c:param name="uczenId" value="${tempUczen.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempUczen.id} </td>
						<td> ${tempUczen.imie} </td>
						<td> ${tempUczen.nazwisko} </td>
						
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this Uczen?'))) return false">Delete</a>
						</td>
						
					</tr>
				
				</c:forEach>
				
				<form:form action="${pageContext.request.contextPath}/logout" method="POST">
				
				<input type=submit value="Logout "/>
				
				</form:form>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









