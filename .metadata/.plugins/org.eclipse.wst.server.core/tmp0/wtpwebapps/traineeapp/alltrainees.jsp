<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Trainees</title>

<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
tr:nth-child(even) {
  background-color: #dddddd;
}
</style>

</head>
<body>
welcome ${user.username}
<table>

	<thead>
		<tr>
			<th>id</th>
			<th>Name</th>
			<th>branch</th>
			<th>percentage</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${trainees}" var="trainee">
			<tr>
				<td>${trainee.trainee_id}</td>
				<td>${trainee.trainee_name}</td>
				<td>${trainee.branch}</td>
				<td>${trainee.percentage}</td>
		
			</tr>
		</c:forEach>
	</tbody>
</table>
<br>
<a href="TraineeController.do?action=addtrainee">add new Trainee</a>

</body>
</html>