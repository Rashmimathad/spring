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
    <title>Response</title>
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
<c:if test="${not empty errorMsg}"><h2 class="text-danger">${errorMsg}</h2></c:if>

<c:if test="${not empty successMsg}"><h2 class="text-success">${successMsg}</h2></c:if>
</body>
</html>