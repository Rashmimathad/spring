<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create My Account</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            margin: 0;
            font-family: Arial, Helvetica, sans-serif;
            background-color: #f4f6f8;
        }

        /* Header */
        .top-header {
            background: #ffffff;
            border-bottom: 1px solid #ddd;
            padding: 10px 30px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .top-header img {
            height: 40px;
        }

        .top-header a {
            margin-left: 20px;
            text-decoration: none;
            color: #555;
            font-weight: 600;
        }

        /* Main layout */
        .main-container {
            display: flex;
            height: calc(100vh - 62px);
        }

        /* Left form panel */
        .form-panel {
            width: 420px;
            background: #ffffff;
            border-right: 1px solid #ddd;
            overflow-y: auto;
        }

        .form-header {
            background: #d2232a;
            color: #fff;
            padding: 14px 20px;
            font-size: 18px;
            font-weight: 600;
        }

        .form-body {
            padding: 20px;
        }

        .form-label {
            font-weight: 600;
        }

        .error {
            color: #d2232a;
            font-size: 0.85rem;
            display: none;
        }

        /* Right image panel */
        .image-panel {
            flex: 1;
            background-image: url("../resource/images/bgImage.jpg");
            background-size: cover;
            background-position: center;
            height:54rem;
        }

        .btn-rc {
            background: #d2232a;
            color: #fff;
            border: none;
            width: 100%;
            padding: 10px;
            font-weight: 600;
        }

        .btn-rc:hover {
            background: #b71d24;
        }
    </style>



</head>
<body>


<nav class="navbar navbar-expand-lg bg-body-secondary border-bottom border-body" style="height: 60px;">
    <div class="container-fluid">
        <img src="../resources/static/images/logo.jpg" alt="logo">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav nav-pills ms-auto">
                <li class="nav-item"><a class="nav-link active text-white  fw-bold m-1  bg-danger" href="#">Find a Drive</a></li>
                <li class="nav-item"><a class="nav-link active text-white  fw-bold m-1  bg-danger" href="signUp">Register</a></li>
                <li class="nav-item"><a class="nav-link active text-white  fw-bold m-1  bg-danger" href="searchPage">Search</a></li>
                <li class="nav-item"><a class="nav-link active text-white  fw-bold m-1  bg-danger" href="#">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>
<!-- Main Content -->
<div class="main-container">

    <!-- Left Form -->
    <div class="form-panel">
        <div class="form-header">Create My Account</div>

        <div class="form-body">
            <form action="createDonorAccount" method="post"  onsubmit="return validateForm();">

                <div class="mb-3">
                    <label class="form-label">Email Address <span class="text-danger fw-bolder">*</span></label>
                    <input type="text" id="email" name="email" class="form-control">
                    <div id="emailError" class="error">You can't leave this field empty!</div>
                </div>

                <div class="mb-3">
                    <label class="form-label">Date of Birth <span class="text-danger fw-bolder">*</span></label>
                    <div class="row g-2">
                        <div class="col">
                            <select id="dobYear" name="dobYear" class="form-select">
                                <option value="">Year</option>
                                <option value="1990">1990</option>
                                <option value="1991">1991</option>
                                <option value="1992">1992</option>
                                <option value="1993">1993</option>
                                <option value="1994">1994</option>
                                <option value="1995">1995</option>
                                <option value="1996">1996</option>
                                <option value="1997">1997</option>
                                <option value="1998">1998</option>
                                <option value="1999">1999</option>
                                <option value="2000">2000</option>
                                <option value="2001">2001</option>
                                <option value="2002">2002</option>
                                <option value="2003">2003</option>
                                <option value="2004">2004</option>
                                <option value="2005">2005</option>
                            </select>
                        </div>
                        <div class="col">
                            <select id="dobMonth" name="dobMonth" class="form-select">
                                <option value="">Month</option>
                                <option value="January">January</option>
                                <option value="February">February</option>
                                <option value="March">March</option>
                                <option value="April">April</option>
                                <option value="May">May</option>
                                <option value="June">June</option>
                                <option value="July">July</option>
                                <option value="August">August</option>
                                <option value="September">September</option>
                                <option value="October">October</option>
                                <option value="November">November</option>
                                <option value="December">December</option>
                            </select>
                        </div>
                        <div class="col">
                            <select id="dobDay" name="dobDay" class="form-select">
                                <option value="">Day</option>
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6">6</option>
                                <option value="7">7</option>
                                <option value="8">8</option>
                                <option value="9">9</option>
                                <option value="10">10</option>
                                <option value="11">11</option>
                                <option value="12">12</option>
                                <option value="13">13</option>
                                <option value="14">14</option>
                                <option value="15">15</option>
                                <option value="16">16</option>
                                <option value="17">17</option>
                                <option value="18">18</option>
                                <option value="19">19</option>
                                <option value="20">20</option>
                                <option value="21">21</option>
                                <option value="22">22</option>
                                <option value="23">23</option>
                                <option value="24">24</option>
                                <option value="25">25</option>
                                <option value="26">26</option>
                                <option value="27">27</option>
                                <option value="28">28</option>
                                <option value="29">29</option>
                                <option value="30">30</option>
                                <option value="31">31</option>
                            </select>
                        </div>
                    </div>
                    <div id="dobError" class="error">Invalid date entered.</div>
                </div>

                <div class="mb-3">
                    <label class="form-label">Donor ID (optional)</label>
                    <input type="text" id="donorId" name="donorId" class="form-control">
                </div>

                <div class="mb-3">
                    <label class="form-label">First Name <span class="text-danger fw-bolder">*</span></label>
                    <input type="text" id="firstName" name="firstName" class="form-control">
                    <div id="firstNameError" class="error">You can't leave this field empty!</div>
                </div>

                <div class="mb-3">
                    <label class="form-label">Last Name <span class="text-danger fw-bolder">*</span></label>
                    <input type="text" id="lastName"  name="lastName" class="form-control">
                    <div id="lastNameError" class="error">You can't leave this field empty!</div>
                </div>


                    <!-- ZIP -->
                    <div class="mb-3">
                        <label class="form-label fw-bold">ZIP Code <span class="text-danger fw-bolder">*</span></label>
                        <input class="form-control" id="zip" name="zip">
                        <div id="zipError" class="error">Required.</div>
                    </div>

                    <hr>

                    <!-- Username -->
                    <div class="mb-3">
                        <label class="form-label fw-bold">User Name <span class="text-danger fw-bolder">*</span></label>
                        <input class="form-control" id="userName" name="userName">
                        <div id="userNameError" class="error">Required.</div>
                    </div>

                    <!-- Password -->
                    <div class="mb-3">
                        <label class="form-label fw-bold">Password <span class="text-danger fw-bolder">*</span></label>
                        <input type="password" class="form-control" id="password" name="password">
                        <div id="passwordError" class="error">Minimum 8 characters.</div>
                    </div>

                    <!-- Confirm Password -->
                    <div class="mb-4">
                        <label class="form-label fw-bold">Confirm Password <span class="text-danger fw-bolder">*</span></label>
                        <input type="password" class="form-control" id="confirmPassword" name="confirmPassword">
                        <div id="confirmPwdError" class="error">Passwords must match.</div>
                    </div>

                    <!-- Submit -->
                    <button type="submit" class="btn btn-danger w-100 py-2 text-white fw-bold">
                        Register
                    </button>

            </form>
        </div>
    </div>

    <!-- Right Image -->
    <div class="image-panel"></div>

</div>
<script>
    function validateForm() {
        // Hide all errors
        document.querySelectorAll('.error').forEach(e => e.style.display = 'none');

        let valid = true;

        const email = document.getElementById("email");
        const emailError = document.getElementById("emailError");
        const firstName = document.getElementById("firstName");
        const firstNameError = document.getElementById("firstNameError");
        const lastName = document.getElementById("lastName");
        const lastNameError = document.getElementById("lastNameError");
        const dobYear = document.getElementById("dobYear");
        const dobMonth = document.getElementById("dobMonth");
        const dobDay = document.getElementById("dobDay");
        const dobError = document.getElementById("dobError");
        const zip = document.getElementById("zip");
        const zipError = document.getElementById("zipError");
        const userName = document.getElementById("userName");
        const userNameError = document.getElementById("userNameError");
        const password = document.getElementById("password");
        const passwordError = document.getElementById("passwordError");
        const confirmPassword = document.getElementById("confirmPassword");
        const confirmPwdError = document.getElementById("confirmPwdError");

        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

        // Email
        if (!email.value.trim() || !emailPattern.test(email.value.trim())) {
            emailError.style.display = "block";
            valid = false;
        }

        // First Name
        if (!firstName.value.trim()) {
            firstNameError.style.display = "block";
            valid = false;
        }

        // Last Name
        if (!lastName.value.trim()) {
            lastNameError.style.display = "block";
            valid = false;
        }

        // DOB
        if (!dobYear.value || !dobMonth.value || !dobDay.value) {
            dobError.style.display = "block";
            valid = false;
        }

        // ZIP
        if (!zip.value.trim()) {
            zipError.style.display = "block";
            valid = false;
        }

        // Username
        if (!userName.value.trim()) {
            userNameError.style.display = "block";
            valid = false;
        }

        // Password
        if (!password.value || password.value.length < 8) {
            passwordError.style.display = "block";
            valid = false;
        }

        // Confirm Password
        if (password.value !== confirmPassword.value) {
            confirmPwdError.style.display = "block";
            valid = false;
        }

        return valid; // Prevent form submission if false
    }
</script>


</body>
</html>

