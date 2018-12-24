<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body { 
/* background-image: url("resources/image/f8.gif"); */
background-size:cover;
 background-position: 50% 50%;
 max-width: 100%;
    height: auto;
}
table, th, td {
    border: 3px solid black;
     border-collapse: collapse;
    
}
th, td {
    padding: 15px;
}
table {
    border-spacing: 15px;
}
th,td {
    text-align: center;
}
caption{
text-align:center;
h1{
text-aign:center;
}
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