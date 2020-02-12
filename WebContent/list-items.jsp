<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Item Stock Management</h1>
<table>
<tr>
<th>Item Name</th>
<th>Unit</th>
<th>Price</th>
<th>Date of Manufacture</th>
<th>Date of Expiry</th>
<th>Location</th>
</tr>

<c:forEach var="tempItem" items="${item_list}">
<tr>
<td>${tempItem.itemName }</td>
<td>${tempItem.unit }</td>
<td>${tempItem.pricePerUnit }</td>
<td>${tempItem.dateOfManufacture }</td>
<td>${tempItem.dateOfExpiry }</td>
<td>${tempItem.location }</td>
</tr>
</c:forEach>

</table>

</body>
</html>