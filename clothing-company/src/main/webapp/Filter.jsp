<!doctype html>
<html lang="en">
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
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-info" href="filter">Filter</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="position-relative container text-center mt-5 mx-auto p-2">
    <h1 class="mb-4 text-dark text-uppercase">Filter By : </h1>
<!--    <p class="lead text-danger fw-bold">Choose a form below to continue:</p>-->

        <div class="row justify-content-center mt-4">
    <div class="col-md-5">
        <a href="filterByBrandPage" class="btn btn-outline-primary w-100 mb-3 fw-semibold fs-4">Brand</a>
        <a href="filterByCategoryPage" class="btn btn-outline-primary w-100 mb-3 fw-semibold fs-4">Category</a>
    </div>

</div>
</div>
</body>
</html>