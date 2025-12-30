<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Success</title>
</head>
<body>
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
<h3 style="color:green;">Data Saved Successfully</h3>
</body>
</html>