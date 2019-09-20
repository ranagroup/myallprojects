<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<title>Store your Vehicle information</title>

<body>
	<h2>vehicle page</h2>
	<form:form id="vehicleForm" modelAttribute="vehicleObject"
		action="vehicle-process" method="post">

		<table align="center">
			<tr>
				<td><form:label path="make">Make : </form:label></td>
				<td><form:input path="make" name="make" id="make" /></td>
			</tr>

			<tr>
				<td><form:label path="model">Model : </form:label></td>
				<td><form:input path="model" name="model" id="last_name" /></td>
			</tr>

			<tr>
				<td><form:label path="year">Year : </form:label></td>
				<td><form:input path="year" name="year" id="year" /></td>
			</tr>
			<tr>
				<td><form:label path="VIN">VIN : </form:label></td>
				<td><form:input path="VIN" name="VIN" id="VIN" /></td>
			</tr>



			<td align="left"><form:button id="vehicle" name="vehicle">Save</form:button>
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