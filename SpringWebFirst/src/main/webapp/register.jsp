<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<title>Registration</title>

<body>
	<h2>Registration page</h2>
	<form:form id="registerForm" modelAttribute="registerObject"
		action="register-process" method="post">

		<table align="center">
			<tr>
				<td><form:label path="first_name">First Name : </form:label></td>
				<td><form:input path="first_name" name="first_name"
						id="first_name" /></td>
			</tr>

			<tr>
				<td><form:label path="last_name">Last name : </form:label></td>
				<td><form:input path="last_name" name="last_name"
						id="last_name" /></td>
			</tr>

			<tr>
				<td><form:label path="email">Email : </form:label></td>
				<td><form:input path="email" name="email"
						id="email" /></td>
			</tr>
			<tr>
				<td><form:label path="contact_No">Contact_No : </form:label></td>
				<td><form:input path="contact_No" name="contact_No"
						id="contact_No" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address : </form:label></td>
				<td><form:input path="address" name="address"
						id="address" /></td>
			</tr>


			<td align="left"><form:button id="register" name="register">Submit</form:button>
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