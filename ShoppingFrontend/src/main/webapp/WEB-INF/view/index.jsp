<!DOCTYPE html>
<%@page isELIgnored="false" %>

<html>
<head>
	<title>Front end</title>
	<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	</head>
<body>
	<jsp:include page="navbar.jsp"></jsp:include>
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="resources/images/ct2.jpg" alt="First slide" height="350px;">
    </div>
    <div class="carousel-item">
      <img class="d-block w-95" src="resources/images/ring.jpg" alt="Second slide" height="350px;" wide="450px;">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="resources/images/ct4.jpg" alt="Third slide" height="350px;">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<p></p>
<div class="container">
	<div class="row">
		<div class="col-md-4">
			<div class="card" style="width: 10rem;">
			  <img class="card-img-top" src="resources/images/ct2.jpg" alt="Card image cap">
			  <div class="card-body">
			    <h5 class="card-title">Card title</h5>
			    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
			    <a href="#" class="btn btn-primary">Go somewhere</a>
			  </div>
			</div><p></p>
		</div>
		<div class="col-md-4">
			<div class="card" style="width: 09rem;">
			  <img class="card-img-top" src="img/ct3.jpg" alt="Card image cap">
			  <div class="card-body">
			    <h5 class="card-title">Card title</h5>
			    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
			    <a href="#" class="btn btn-primary">Go somewhere</a>
			  </div>
			</div><p></p>
		</div>
		<div class="col-md-4">
			<div class="card" style="width: 10rem;">
			  <img class="card-img-top" src="img/ct4.jpg" alt="Card image cap">
			  <div class="card-body">
			    <h5 class="card-title">Card title</h5>
			    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
			    <a href="#" class="btn btn-primary">Go somewhere</a>
			  </div>
			</div><p>
		</p>
		</div>
	</div>
</div>

<div class="foots">
	This is the footer section...
</div>
</body>
</html>