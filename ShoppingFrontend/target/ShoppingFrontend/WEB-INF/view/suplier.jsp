<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:form action="${pageContext.request.contextPath}/addSuplier" method="post"  modelAttribute ="supplier">
<br>

<c:if test="${not empty supplier.suplierName}">
suplierId <spring:input path="suplierId" readonly="true" disabled="true"/>
 <spring:hidden path="suplierId"/>
 </c:if>
suplierName <spring:input path="suplierName"/>
<br>

 Suplocation <spring:input path="supLocation"/>
<br>
<c:if test="${empty suplier.suplierName}">
<spring:button>add</spring:button>
</c:if>
<c:if test="${not empty suplier.suplierName}">
<spring:button>update</spring:button>
</c:if>
</spring:form>

<c:if test="${not empty supplierList }">
<table>
     <tr>
     <th>suplierId</th>
     <th>suplierName</th>
      <th>Suplocation</th>
      </tr>
 
  <c:forEach items="${supplierList}" var="sup">
      
      <tr>
    <td>${sup.suplierId}</td>
    <td>${sup.suplierName}</td>
   
    <td><a href="<c:out value="updateSuplier/${sup.suplierId}"></c:out>">update</a>
    <td><a href="<c:out value="deleteSuplier/${sup.suplierId }"></c:out>">delete</a>
     </tr>
     </c:forEach>
</table>
</c:if>
</body>
</html>