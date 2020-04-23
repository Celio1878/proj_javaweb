<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>Aula_8</title>
	</head>

	<!--
		<body>
			<h1>Hello World!</h1>
			<c:if test="${not empty param.name}">
			<p>Name: ${param.name}</p>
			</c:if>
		</body>
	-->

	<body>
		<fieldset>
			<legend>Form of buy</legend>
			<form method="post" action="calc">
				<label> Name: </label>  <br/>
				<input type="text" name="name" /> <br/> <br/>

				<label> CPF: </label> <br/>
				<input type="text" name="cpf" /> <br/> <br/>

				<label> Credit Limit: </label> <br/>
				<input type="text" name="credit" /> <br/> <br/>

				<label> Select the Product </label> <br/>
				<select name="product" default-value="">
					<option value="hd"> HARD DISK </option>
					<option value="memory"> MEMORY </option>
					<option value="mouse"> MOUSE </option>
					<option value="keyboard"> KEYBOARD </option>
				</select> <br/> <br/>

				<label> Quantity of Products: </label> <br/>
				<input type="text" name="products" /> <br/> <br/>

				<label> Date of Buy: </label> <br/>
				<input type="text" name="date" /> <br/> <br/>

				<label> Form of Payment </label> <br/>
				<select name="payment" default-value="">
					<option value="card"> Card </option>
					<option value="billet"> Billet </option>
				</select> <br/> <br/>

				<label>Submit</label> <input type="submit" value="submit" />
			</form>
		</fieldset>
	</body>
</html>
