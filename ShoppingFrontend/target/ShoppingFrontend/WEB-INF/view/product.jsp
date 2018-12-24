<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<spring:form action="${pageContext.request.contextPath}/addproduct" method="post" modelAttribute="product" enctype = "multipart/form-data">
	


		<br>
		<c:if test="${not empty product.productName }">      
	
          <spring:hidden path="productId"/>
	</c:if>
           product Name <spring:input path="productName"/>
       <br>
           product Description <spring:input path="productDescp"/>
       <br>
           product quantity <spring:input path="quantity"/>
        <br>
           product price <spring:input path="price"/>
        <br>
         upload<input type="file"  name="file"/>
		<!--  <input  type ="submit" value "upload"/> -->
        <spring:select path="cat_id">
        <spring:option value="">Select category</spring:option>
          <c:forEach items="${categoryList}" var="cat">
                  <spring:option value="${cat.cat_id }">${cat.categoryName}</spring:option>
 </c:forEach>
 </spring:select>

                <c:if test="${ empty product.productName }">
                 <spring:button>add</spring:button>
</c:if>
             <c:if test="${ empty product.productName }">
             <spring:button>update</spring:button>
</c:if>
</spring:form>
<c:if test="${not empty productList }">
<table>
<tr>
<th>productId</th>
<th>productName</th>
<th>productDescp</th> 
<th>product quantity</th>
<th>product price</th>
<th>product file</tr>
  <c:forEach items="${productList}" var="pro">  
      <tr>
    <td>${pro.productId}</td>
    <td>${pro.productName}</td>
    <td>${pro.productDescp}</td>
     <td>${pro.quantity}</td>
      <td>${pro.price}</td>
      <td>${pro.file}</td>
    <td><a href="<c:out value="updateProduct/${pro.productId}"></c:out>">update</a>
    <td><a href="<c:out value="deleteSuplier/${pro.productId }"></c:out>">delete</a>
     </tr>
     </c:forEach>
     
</table>
</c:if>
</body>
</html>