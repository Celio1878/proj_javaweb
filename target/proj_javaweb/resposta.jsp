<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>Recebe</title>
	</head>
	<body>
		<table border="1">
			<thead>
				<tr>
					<th>Name</th>
					<th>CPF</th>
					<th>Limit</th>
					<th>Date</th>
					<th>Product</th>
					<th>Impost</th>
					<th>Purchase price</th>
					<th>Discount Amount</th>
					<th>Total of Payment</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><%=request.getAttribute("Name") %></td>
					<td><%=request.getAttribute("CPF") %></td>
					<td><%=request.getAttribute("Limit") %></td>
					<td><%=request.getAttribute("Date") %></td>
					<td><%=request.getAttribute("Product") %></td>
					<td><%=request.getAttribute("Impost") %></td>
					<td><%=request.getAttribute("Discount Amount") %></td>
					<td><%=request.getAttribute("Total of Payment") %></td>
					<td><a href="index.html"> Editar </a></td>
				</tr>
			</tbody>
		</table>
	</body>
</html>
