<!doctype html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Search</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
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
                <li class="nav-item"><a class="nav-link active text-white  fw-bold m-1  bg-danger" href="index">Home</a></li>
                <li class="nav-item"><a class="nav-link active text-white  fw-bold m-1  bg-danger" href="#">Find a Drive</a></li>
                <li class="nav-item"><a class="nav-link active text-white  fw-bold m-1  bg-danger" href="signUp">Register</a></li>
                <li class="nav-item"><a class="nav-link active text-white  fw-bold m-1  bg-danger" href="searchPage">Search</a></li>
                <li class="nav-item"><a class="nav-link active text-white  fw-bold m-1  bg-danger" href="#">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>
    <div class="d-flex justify-content-center align-items-center" style="height:100vh;">
        <div class="card p-2  border border-dark border-2 rounded" style="width: 45rem;">
            <div class="card-body">
                <form action="searchByEmail">
                    <div class="mb-3">
                        <label class="form-label fw-bold fs-5">Email Address <span class="text-danger fw-bolder">*</span></label>
                        <input type="text" id="email" name="email" class="form-control bordered">
                    </div>

                    <br><br>
                    <div class="text-center mt-3">
                        <input type="submit" value="Search" name="submitType" class="btn btn-danger rounded mx-auto d-block fs-4 fw-semibold"><br>
                        <input type="submit" value="Clear" name="submitType" class="btn btn-danger rounded mx-auto d-block fs-4 fw-semibold">
                    </div>
                    <br>

                </form>
                <c:if test="${not empty errorMsg}">
                    <p class="text-danger fs-1 text-center fw-semibold">${ errorMsg }</p>
                </c:if>
                <c:if test="${not empty donorInfo}">
                    <p class="fs-4 text-danger test-uppercase"><strong>Donor Details : </strong></p>
                    <p class="text-white fs-4"><b>
                        <p class="fs-5"><strong>Email :</strong> ${donorInfo.email}</p>
                        <p class="fs-5"><strong>Date Of Birth:</strong> ${donorInfo.dobDay}/${donorInfo.dobMonth}/${donorInfo.dobYear}</p>
                        <p class="fs-5"><strong>First Name :</strong> ${donorInfo.firstName}</p>
                        <p class="fs-5"><strong>Last Name :</strong> ${donorInfo.lastName}</p>
                        <p class="fs-5"><strong>ZIP Code:</strong> ${donorInfo.zip}<br></p>
                        <p class="fs-5"><strong>User Name:</strong> ${donorInfo.userName}</p>
                    </b>
                    <div class="text-center mt-3">
                        <a type="submit" href="edit/${donorInfo.id}" class="btn btn-danger rounded mx-auto d-block fs-4 fw-semibold">Edit</a>
                        <br>
                        <a type="submit" href="delete/${donorInfo.id}" class="btn btn-danger rounded mx-auto d-block fs-4 fw-semibold">Delete</a>
                    </div>
                    </p>
                </c:if>

            </div>
        </div>
    </div>

</body>
</html>