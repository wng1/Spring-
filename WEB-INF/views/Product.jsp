<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
//include the css stylesheet

<title>Product page</title>

<body>
<div class="products">
<h2>${product.productName}</h2>
<p>${product.productDesc}</p>
<p>${product.productCost}</p> //verify this matches the variable in the java class
</div>

//Loop all available products from db to the jsp page
<c:forEach var="product" items="${productList}">
<tr>
<td>${product.PID}</td>
<td>${product.productName}</td>
<td>${product.productCost}</td>
</tr>
</c:forEach>
			
			
</body>
</html>
