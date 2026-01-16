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
 backdrop-filter: blur(7px);
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
<div class="d-flex justify-content-center align-items-center" style="height:120vh;">
    <div class="card p-2 bg-body-secondary bg-opacity-75 border border-dark border-2 rounded" style="width: 45rem;">
        <div class="card-body">
            <h3 class="card-title fs-1 text-center fw-semibold text-dark text-uppercase"><b>Cloth Register Form</b></h3>
            <br>
            <form action="registerCloth" method="post">

                <div class="mb-3">
                    <label for="clothName" class="form-label fs-5 fw-bold">Cloth Name <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="clothName" name="clothName" onblur="validateClothName();enableSubmit();" placeholder="Enter cloth name">
                    <span id="clothNameError" class="text-danger fw-bold"></span>
                </div>

                <div class="mb-3">
                    <label for="brandName" class="form-label fs-5 fw-bold">Brand Name <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="brandName" name="brandName" onblur="validateBrandName();enableSubmit();" placeholder="Enter brand name">
                    <span id="brandNameError" class="text-danger fw-bold"></span>
                </div>

                <div class="mb-3">
                    <label for="categoryName" class="form-label fs-5 fw-bold">Category Name <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="categoryName" name="categoryName" onblur="validateCategoryName();enableSubmit();" placeholder="Enter category name">
                    <span id="categoryNameError" class="text-danger fw-bold"></span>
                </div>

                <div class="mb-3">
                    <label for="size" class="form-label fs-5 fw-bold">Size <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="size" name="size" onblur="validateSize();enableSubmit();" placeholder="Enter cloth size">
                    <span id="sizeError" class="text-danger fw-bold"></span>
                </div>

                <div class="mb-3">
                    <label for="color" class="form-label fs-5 fw-bold">Color <span class="text-danger">*</span></label>
                    <input type="text" class="form-control" id="color" name="color" onblur="validateColor();enableSubmit();" placeholder="Enter cloth color">
                    <span id="colorError" class="text-danger fw-bold"></span>
                </div>

                <div class="mb-3">
                    <label for="price" class="form-label fs-5 fw-bold">Price <span class="text-danger">*</span></label>
                    <input type="number" class="form-control" id="price" name="price" onblur="validatePrice();enableSubmit();" placeholder="Enter cloth price">
                    <span id="priceError" class="text-danger fw-bold"></span>
                </div>

                <div class="mb-3">
                    <label for="stockQuantity" class="form-label fs-5 fw-bold">Stock Quantity <span class="text-danger">*</span></label>
                    <input type="number" class="form-control" id="stockQuantity" name="stockQuantity" onblur="validateStockQuantity();enableSubmit();" placeholder="Enter stock Quantity">
                    <span id="stockQuantityError" class="text-danger fw-bold"></span>
                </div>

                <div class="col-md-12">
                    <label for="availabilityStatus" class="form-label fs-5 fw-bold">Cloth Availability Status <span class="text-danger">*</span></label>
                    <select id="availabilityStatus" name="availabilityStatus" class="form-select" onblur="validateAvailabilityStatus();enableSubmit();">
                        <option value="">Choose...</option>
                        <option value="Available">Available</option>
                        <option value="Limited Stock">Limited Stock</option>
                        <option value="Out Of Stock">Out Of Stock</option>

                    </select>
                    <span id="availabilityStatusError" class="text-danger fw-bold"></span>
                </div>
                <br>

                <br>
                <button type="submit" class="btn btn-primary rounded mx-auto d-block fs-4 fw-semibold"  disabled id="registerBtn">Register</button>

            </form>
        </div>
    </div>
</div>
<script src="<%= request.getContextPath() %>/resources/script.js"></script>
</body>
</html>