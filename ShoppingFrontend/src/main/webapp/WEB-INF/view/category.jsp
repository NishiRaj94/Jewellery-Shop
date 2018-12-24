<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
body {
    background-image: url("resources/images/ring.jpg");
    background-size: cover;
}

input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 6px;
    box-sizing: border-box;
    border-color: lightgrey;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    background-color: red;
    padding: 20px;
}
table, td, th {    
    border: 1px solid #ddd;
    text-align: left;
}

table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    padding: 15px;
}
button {
    background-color: white;
    border: none;
    color: black;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}

</style>
<head/>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
 <spring:form action="${pageContext.request.contextPath}/addCategory" method="post" modelAttribute="Category">
 <br/>
 
<c:if test="${ not empty  cat.categoryName}">
category Id:<spring:input path="cat_id" disabled="true" readonly="true" />		
 
 <spring:hidden path="cat_id"/>
 </c:if>
category name:<spring:input path="categoryName" />
 <br />
 category description:<spring:input path="description"/>
 <br/>
  <c:if test="${empty cat.categoryName }">
<spring:button>Add</spring:button>
</c:if>

  <c:if test="${not empty cat.categoryName }">
<spring:button>Update</spring:button>
</c:if>
     </spring:form>
     <table>
     <tr>
     <th> id</th>
     <th>categoryName</th>
      <th>description</th>
      <th> update</th>
      <th>delete</th>
      </tr>
     
--   
     <c:forEach items="${categoryList}" var="cat">
      
      <tr>
    <td>${cat.cat_id}</td>
    <td>${cat.categoryName}</td>
    <td>${cat.description}</td>
    <td><a href="<c:out value="updateCategory/${cat.cat_id}"></c:out>">update</a>
    <td><a href="<c:out value="deleteCategory/${cat.cat_id }"></c:out>">delete</a>
     </tr>
     </c:forEach>
  </table>
</body>
</html>