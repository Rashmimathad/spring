<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
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
    <div class="d-flex justify-content-center align-items-center" style="height:150vh;">
        <div class="card p-2 bg-body-secondary bg-opacity-75 border border-dark border-2 rounded" style="width: 45rem;">
            <div class="card-body">
                <h3 class="card-title fs-1 text-center fw-semibold text-dark text-uppercase"><b>Restaurant Register Form</b></h3>
                <br>
                <form action="addRestaurant" method="post">
                    <div class="mb-3">
                        <label for="restaurantName" class="form-label fs-5 fw-bold">Restaurant Name <span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="restaurantName" name="restaurantName" onblur="validateRestaurantName();enableSubmit();" placeholder="Enter restaurant name">
                        <span id="nameError" class="text-danger fw-bold"></span>
                    </div>
                    <div class="mb-3">
                        <label for="ownerName" class="form-label fs-5 fw-bold">Restaurant Owner Name <span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="ownerName" name="ownerName" onblur="validateOwnerName();enableSubmit();" placeholder="Enter owner name">
                        <span id="ownerNameError" class="text-danger fw-bold"></span>
                    </div>
                    <div class="mb-3">
                        <label for="contactNumber" class="form-label fs-5 fw-bold">Contact Number <span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="contactNumber" name="contactNumber" oninput="this.value = this.value.replace(/[^0-9]/g, '')" onblur="validateContactNumber();enableSubmit();" placeholder="Enter contact number">
                        <span id="contactNumberError" class="text-danger fw-bold"></span>
                    </div>
                    <div class="mb-3">
                        <label for="emailId" class="form-label fs-5 fw-bold">Email <span class="text-danger">*</span></label>
                        <input type="email" class="form-control" id="emailId" name="emailId" onblur="validateEmail();enableSubmit();" placeholder="Enter email">
                        <span id="emailIdError" class="text-danger fw-bold"></span>
                    </div>
                    <div class="col-md-12">
                        <label for="restaurantType" class="form-label fs-5 fw-bold">Restaurant Type <span class="text-danger">*</span></label>
                        <select id="restaurantType" name="restaurantType" class="form-select" onblur="validateRestaurantType();enableSubmit();">
                            <option value="">Choose...</option>
                            <option value="Dine-In">Dine-In</option>
                            <option value="Take Away">Take Away</option>
                        </select>
                        <span id="restaurantTypeError" class="text-danger fw-bold"></span>
                    </div>
                    <br>
                    <div class="mb-3">
                        <label for="address" class="form-label fs-5 fw-bold">Address <span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="address" name="address" onblur="validateAddress();enableSubmit();" placeholder="Enter address">
                        <span id="addressError" class="text-danger fw-bold"></span>
                    </div>
                    <div class="mb-3">
                        <label for="city" class="form-label fs-5 fw-bold">City <span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="city" name="city" onblur="validateCity();enableSubmit();" placeholder="Enter city">
                        <span id="cityError" class="text-danger fw-bold"></span>
                    </div>
                    <div class="mb-3">
                        <label for="restaurantTimings" class="form-label fs-5 fw-bold">Restaurant Timings <span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="restaurantTimings" name="restaurantTimings" onblur="validateRestaurantTimings();enableSubmit();" placeholder="Enter timings">
                        <span id="restaurantTimingsError" class="text-danger fw-bold"></span>
                    </div>
                    <div class="col-md-12">
                        <label for="foodType" class="form-label fs-5 fw-bold">Restaurant Type <span class="text-danger">*</span></label>
                        <select id="foodType" name="foodType" class="form-select" onblur="validateFoodType();enableSubmit();">
                            <option value="">Choose...</option>
                            <option value="Veg">Veg</option>
                            <option value="Non-Veg">Non-Veg</option>
                        </select>
                        <span id="foodTypeError" class="text-danger fw-bold"></span>
                    </div>
                    <br>
                    <div class="mb-3">
                        <label for="rating" class="form-label fs-5 fw-bold">Rating <span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="rating" name="rating" onblur="validateRating();enableSubmit();" placeholder="Enter rating">
                        <span id="ratingError" class="text-danger fw-bold"></span>
                    </div>
                    <br>


                    <button type="submit" class="btn btn-dark rounded mx-auto d-block fs-4 fw-semibold"  disabled id="registerBtn">Register</button>
                </form>
            </div>
        </div>
    </div>
    <script>
        const registerBtn = document.getElementById("registerBtn");

        function enableSubmit() {
            if (
                validateRestaurantName() &&
                validateOwnerName() &&
                validateContactNumber() &&
                validateEmail() &&
                validateRestaurantType() &&
                validateAddress() &&
                validateCity() &&
                validateRestaurantTimings() &&
                validateFoodType() &&
                validateRating()
            ) {
                registerBtn.disabled = false;
            } else {
                registerBtn.disabled = true;
            }
        }

        function validateRestaurantName() {
            let name = document.getElementById("restaurantName").value.trim();
            let error = document.getElementById("nameError");

            if (name === "") {
                error.textContent = "Restaurant name is required";
                return false;
            }
            if (name.length < 3) {
                error.textContent = "Restaurant name must be at least 3 characters";
                return false;
            }
            error.textContent = "";
            return true;
        }

        function validateOwnerName() {
            let owner = document.getElementById("ownerName").value.trim();
            let error = document.getElementById("ownerNameError");

            if (owner === "") {
                error.textContent = "Owner name is required";
                return false;
            }
             if (owner.length < 3) {
                error.textContent = "Owner name must be at least 3 characters";
                return false;
            }
            error.textContent = "";
            return true;
        }

        function validateContactNumber() {
            let contact = document.getElementById("contactNumber").value.trim();
            let error = document.getElementById("contactNumberError");
            let regex = /^[0-9]{10}$/;

            if (contact === "") {
                error.textContent = "Contact number is required";
                return false;
            }
            if (!regex.test(contact)) {
                error.textContent = "Contact number must be exactly 10 digits";
                return false;
            }
            error.textContent = "";
            return true;
        }

        function validateEmail() {
            let email = document.getElementById("emailId").value.trim();
            let error = document.getElementById("emailIdError");
            let regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

            if (email === "") {
                error.textContent = "Email is required";
                return false;
            }
            if (!regex.test(email)) {
                error.textContent = "Enter a valid email address";
                return false;
            }
            error.textContent = "";
            return true;
        }

        function validateRestaurantType() {
            let type = document.getElementById("restaurantType").value;
            let error = document.getElementById("restaurantTypeError");

            if (type === "") {
                error.textContent = "Please select restaurant type";
                return false;
            }
            error.textContent = "";
            return true;
        }

        function validateAddress() {
            let address = document.getElementById("address").value.trim();
            let error = document.getElementById("addressError");

            if (address === "") {
                error.textContent = "Address is required";
                return false;
            }
            error.textContent = "";
            return true;
        }

        function validateCity() {
            let city = document.getElementById("city").value.trim();
            let error = document.getElementById("cityError");

            if (city === "") {
                error.textContent = "City is required";
                return false;
            }
            error.textContent = "";
            return true;
        }

        function validateRestaurantTimings() {
            let timings = document.getElementById("restaurantTimings").value.trim();
            let error = document.getElementById("restaurantTimingsError");

            if (timings === "") {
                error.textContent = "Restaurant timings are required";
                return false;
            }
            error.textContent = "";
            return true;
        }

        function validateFoodType() {
            let foodType = document.getElementById("foodType").value;
            let error = document.getElementById("foodTypeError");

            if (foodType === "") {
                error.textContent = "Please select food type";
                return false;
            }
            error.textContent = "";
            return true;
        }

        function validateRating() {
            let rating = document.getElementById("rating").value.trim();
            let error = document.getElementById("ratingError");

            if (rating === "") {
                error.textContent = "Rating is required";
                return false;
            }
            if (isNaN(rating) || rating < 0 || rating > 5) {
                error.textContent = "Rating must be between 0 and 5";
                return false;
            }
            error.textContent = "";
            return true;
        }
    </script>
</body>
</html>