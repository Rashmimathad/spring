<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>HOME</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <style>
        body {
 background-image: url('<%= request.getContextPath() %>/resources/images/bgImage.jpg');
 background-repeat: no-repeat;
 background-size: cover;
 background-position: center;
 backdrop-filter: blur(5px);
}
    </style>
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
<div class="position-fixed top-0 start-0 w-100 h-100">
    <img src="images/backgroundImage.jpeg"
         class="bg-image img-fluid opacity-25 w-100 h-100" style="object-fit: cover;" alt="background">
    <div class="position-absolute top-0 start-0 w-100 h-100"></div>
</div>

<div class="d-flex justify-content-center align-items-center" style="height:100vh;">
    <div class="card p-2 bg-body-secondary bg-opacity-75 border border-dark border-2 rounded" style="width: 35rem; height: 10rem;">
        <h5 class="card-title text-center fs-3"  style="color:red;">${errorMessage}</h5>
        <h5 class="card-title text-center fs-3"  style="color:green;">${successMessage}</h5>

        <a href="index" class="btn btn-primary fs-5 d-grid gap-2 col-4 mx-auto">Go to Home</a>
    </div>
</div>
</body>
</html>