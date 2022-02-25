<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Trainee</title>
<script src="validate.js"></script>
</head>
<body>

	<form action="TraineeController.do" method="post">

		<table>

			<tr>

				<td>Enter Trainee Name:</td>
				<td><input type="text" name="trainee_name" id="nameId" /></td>
				<td><label id="nameMsg"></label></td>


			</tr>

			<tr>
				<td>Enter Branch:</td>
				
				<td><select name="branch" id="branchId">
						<option value="java">JAVA</option>
						<option value="oracle">ORACLE</option>
						<option value="php">PHP</option>
						<option value="dotnet">DOTNET</option>
				</select></td>
				<td><label id="branchMsg"></label></td>
			</tr>


			<tr>
				<td>Enter Percentage:</td>
				<td><input type="text" name="percentage" id="percentageId" /></td>
				<td><label id="percentageMsg"></label></td>
			</tr>

			<tr>
				<td><input type="submit" onclick="return validate();" /></td>
			</tr>


		</table>


	</form>


</body>
</html>