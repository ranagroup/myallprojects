<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<title>Driver</title>
<body>
	<h2>This is Driver Information page</h2>

	<form:form id="DriverForm" modelAttribute="driverObject"
		action="driver-process" method="post">
		<table align="center">
			<tr>
				<td><form:label path="Name">Driver Name: </form:label></td>
				<td><form:input path="Name" name="Name" id="Name" /></td>
			</tr>
			<tr>
				<td><form:label path="ID">Driver's ID:</form:label></td>
				<td><form:input path="ID" name="ID" id="ID" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address:</form:label></td>
				<td><form:input path="address" name="address" id="address" /></td>
			</tr>
			<tr>
				<td><form:label path="Phone">Phone No:</form:label></td>
				<td><form:input path="Phone" name="Phone" id="Phone" /></td>
			</tr>
			<tr>
				<td><form:label path="Email">E-mail:</form:label></td>
				<td><form:input path="Email" name="Email" id="Email" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="driver" name="driver">Save</form:button>
				</td>
			</tr>
			<tr></tr>
		</table>

		<table align="center">
			<tr>
				<td style="font-style: italic; color: red;">${message}</td>
			</tr>
		</table>
	</form:form>

</body>
</html>