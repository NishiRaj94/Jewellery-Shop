<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">jewellery Store</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="admin">Admin</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Pricing</a>
      </li>    
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDrop" data-toggle="dropdown" >
          Dropdown link
        </a>
        
        <div class="dropdown-menu">
         <c:forEach items="${categoryList}" var="cat">
        
         <a class="dropdown-item" href="${pageContext.request.contextPath}/productdetail/${cat.cat_id}">${cat.cat_id}</a>
         </c:forEach>
         </div>
          
      </li>
    </ul>
  </div>
</nav>

