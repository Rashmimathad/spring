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
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-info" href="<%= request.getContextPath() %>/index">Home</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-info" href="signUpPage">Register</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-info" href="searchPage">Search</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-info" href="<%= request.getContextPath() %>/filter">Filter</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center" style="height:120vh;">
    <div class="card p-2 bg-body-secondary bg-opacity-75 border border-dark border-2 rounded" style="width: 65rem;">
        <div class="card-body">
            <h3 class="card-title fs-1 text-center fw-semibold text-dark text-uppercase"><b>Cloth Search</b></h3>
            <br>
            <form action="<%= request.getContextPath() %>/filterByBrandName">

                <div class="mt-2">
                    <label for="brandName" class="form-label fs-5 fw-bold">Brand Name <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="brandName" name="brandName" placeholder="Enter brand name">
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
            <c:if test="${not empty errorMessage}">
                <h5 class="card-title text-center fs-3"  style="color:red;">${errorMessage}</h5>
            </c:if>
            <c:if test="${not empty clothsListByBrand}">
                <table class="table">
                    <thead class="table-info text-center">
                            <th scope="col">ID</th>
                            <th scope="col">Cloth Name</th>
                            <th scope="col">Brand Name</th>
                            <th scope="col">Category Name</th>
                            <th scope="col">Size</th>
                            <th scope="col">Color</th>
                            <th scope="col">Price</th>
                            <th scope="col">Stock Quantity</th>
                            <th scope="col">Availability</th>
                            <th scope="col">Edit</th>
                            <th scope="col">Delete</th>
                    </thead>
                    <tbody>
                    <c:forEach var="clothInfo" items="${clothsListByBrand}">
                       <tr>
                           <th scope="row">${clothInfo.clothId}</th>
                           <td>${clothInfo.clothName}</td>
                           <td>${clothInfo.brandName}</td>
                           <td>${clothInfo.categoryName}</td>
                           <td>${clothInfo.size}</td>
                           <td>${clothInfo.color}</td>
                           <td>${clothInfo.price}</td>
                           <td>${clothInfo.stockQuantity}</td>
                           <td>${clothInfo.availabilityStatus}</td>
                           <td>
                               <a type="submit" href="edit/${clothInfo.clothId}" class="btn  btn-warning fs-5 px-3 ">Edit</a>
                           </td>
                           <td>
                               <a type="submit" href="<%= request.getContextPath() %>/delete/${clothInfo.clothId}" class="btn btn-danger fs-5 px-3">Delete</a>
                           </td>
                       </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
</div>
</body>
</html>