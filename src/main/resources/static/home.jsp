<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">

<head>

<link
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css"
	rel="stylesheet" />
<!-- Include roboto.css to use the Roboto web font, material.css to include the theme and ripples.css to style the ripple effect -->
<link href="dist/css/roboto.min.css" rel="stylesheet" />
<link href="dist/css/material.min.css" rel="stylesheet" />
<link href="dist/css/ripples.min.css" rel="stylesheet" />

</head>

<body>
<header>
	<div>
		<nav class="navbar navbar-default">
 	 <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Brand</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Link</a></li>
      
      </ul>
    
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Welcome to  ${msg}</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

	</div>

</header>

<div class="container">
	<div class="row">
		<div class="col-sm-9 col-xs-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">About us</h3>
				</div>
				<div class="panel-body">
				



					</div>
				</div>		


			</div>

			<div class="col-sm-3 col-xs-12">

				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Login Here</h3>
					</div>
					<div class="panel-body">
						<form th:action="@{/login}" method="post">
						<div>
							<label> User Name : <input type="text" name="username" />
							</label>
						</div>
						<div>
							<label> Password: <input type="password" name="password" />
							</label>
						</div>
						<div>
							<input type="submit" class="btn btn-primary" value="Login" />
							<a href="javascript:void(0)" class="btn btn-success">Sing In</a>
						</div>
					</form>
				</div>
			</div>		
		</div>
	</div>
</div>
<footer>
	
	@ 123
</footer>


  	

	

	
	<!-- Your site ends -->

	<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

	<script src="dist/js/ripples.min.js"></script>
	<script src="dist/js/material.min.js"></script>
	<script>
		$(document).ready(function() {
			// This command is used to initialize some elements and make them work properly
			$.material.init();
		});
	</script>

</body>

</html>
