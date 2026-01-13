<!doctype html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">

<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>HOME</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-secondary border-bottom border-body" style="height: 60px;">
    <div class="container-fluid">
        <img src="<%= request.getContextPath() %>/resources/images/logo.jpg" alt="logo" style="height:55px;width:110px;">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav nav-pills ms-auto">
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-info" href="index">Home</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-info" href="signUpPage">Register</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-info" href="searchPage">Search</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-info" href="filter">Filter</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center" style="height:120vh;">
    <div class="card p-2 bg-body-secondary bg-opacity-75 border border-dark border-2 rounded" style="width: 45rem;">
        <div class="card-body">
            <h3 class="card-title fs-1 text-center fw-semibold text-dark text-uppercase"><b>Cloth Search</b></h3>
            <br>
            <form action="<%= request.getContextPath() %>/searchByClothName">

                <div class="mb-3">
                    <label for="clothName" class="form-label fs-5 fw-bold">Cloth Name <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="clothName" name="clothName" placeholder="Enter cloth name">
                </div>

                <br>
                <div class="text-center d-flex justify-content-center gap-3 mt-3">
                <input type="submit" class="btn btn-primary fs-5 px-4" name="submitType" value="Search">
                    <br>
                    <input type="submit" class="btn btn-secondary fs-5 px-4" name="submitType" value="Clear">
                </div>
            </form>
            <br>
            <br>
            <c:if test="${not empty clothInfo}">
                <div class="card p-3 ms-5 bg-body-secondary bg-opacity-50 border border-dark border-2 rounded" style="width: 35rem;">
                    <div class="card-body">
                        <p class="fs-4 text-primary text-uppercase text-center"><strong>Cloth Details : </strong></p>
                            <p class="fs-5"><strong>Cloth Name : </strong> ${clothInfo.clothName}</p>
                            <p class="fs-5"><strong>Brand Name : </strong> ${clothInfo.brandName}</p>
                            <p class="fs-5"><strong>Category Name : </strong> ${clothInfo.categoryName}</p>
                            <p class="fs-5"><strong>Size : </strong> ${clothInfo.size}</p>
                            <p class="fs-5"><strong>Color : </strong> ${clothInfo.color}</p>
                            <p class="fs-5"><strong>Price : </strong> ${clothInfo.price}</p>
                            <p class="fs-5"><strong>Stock Quantity : </strong> ${clothInfo.stockQuantity}</p>
                            <p class="fs-5"><strong>Availability Status : </strong> ${clothInfo.availabilityStatus}</p>
                        </b>

                        <div class="text-center d-flex justify-content-center gap-3 mt-3">
                            <a type="submit" href="edit/${clothInfo.clothId}" class="btn  btn-warning fs-5 px-5 ">Edit</a>
                            <br>
                            <a type="submit" href="<%= request.getContextPath() %>/delete/${clothInfo.clothId}" class="btn btn-danger fs-5 px-4">Delete</a>
                        </div>
                    </div>
                </div>
            </c:if>
            <c:if test="${not empty errorMessage}">
                <h5 class="card-title text-center fs-3"  style="color:red;">${errorMessage}</h5>
            </c:if>
        </div>
    </div>
</div>
</body>
</html>