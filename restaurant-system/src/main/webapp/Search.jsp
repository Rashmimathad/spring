<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body class="bg-body-tertiary">
<nav class="navbar navbar-expand-lg bg-danger border-bottom border-body" style="height: 60px;">
    <div class="container-fluid">
        <img src="<%= request.getContextPath() %>/resources/images/logo.png" alt="logo" style="height:50px;width:50px;">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav nav-pills ms-auto">
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="index">Home</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="registerpage">Register</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="searchPage">Search</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="#">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="position-relative container mt-5 mx-auto p-5 bg-danger rounded-3" style="width:45rem;">

    <form action="searchByRestaurantName">
        <div class="col-md-9">
            <label for="restaurantName" class="text-white form-label fs-5 fw-bold">Restaurant Name <span class="text-danger">*</span></label>
            <input type="text" class="form-control" id="restaurantName" name="restaurantName"  placeholder="Enter restaurant name">

        </div>
        <br><br>
        <button type="submit" class="btn btn-dark rounded mx-auto d-block fs-4 fw-semibold">Search</button>
        <br>
        <c:if test="${not empty restaurant}">
            <p class="text-white fs-4"><b>
            Restaurant Name : ${restaurant.restaurantName}<br>
            Owner Name : ${restaurant.ownerName}<br>
            Contact Number : ${restaurant.contactNumber}<br>
            Email : ${restaurant.emailId}<br>
            Restaurant Type : ${restaurant.restaurantType}<br>
            Address : ${restaurant.address}<br>
            City : ${restaurant.city}<br>
            Restaurant Timings : ${restaurant.restaurantTimings}<br>
            Food Type : ${restaurant.foodType}<br>
            rating : ${restaurant.rating}<br>
                </b>
            </p>
        </c:if>
        <c:if test="${not empty errorMsg}">
            <p class="text-white fs-1 text-center"><b>${errorMsg}</b></p>
        </c:if>
    </form>
</div>


</body>
</html>

