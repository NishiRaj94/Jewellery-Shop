<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:form action="${pageContext.request.contextPath}/productdetail" method="POST" >
<c:forEach items="${ productList}" var="product">


productName:${product.productName}<br>
 productDescp:${product.productDescp}<br>
 product price:${product.price}<br>
 product quantity:${product.quantity}<br>
 

<a href="" class="btn btn-success btn-product">Add To Cart</a><br>
<a href="" class="btn btn-success btn-product">MoreDetail</a><br>

</c:forEach>
    
   
</spring:form>
</body>
</html>