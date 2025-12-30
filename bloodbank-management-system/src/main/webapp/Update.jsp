<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create My Account</title>
    <style>
        .error {
            display: none;
            color: #dc3545;
            font-size: 0.85rem;
            margin-top: 4px;
        }
    </style>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body class="bg-body-tertiary">
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
<div class="d-flex justify-content-center align-items-center" style="height:120vh;">
    <div class="card p-2 bg-body-secondary bg-opacity-75 border border-dark border-2 rounded" style="width: 45rem;">
        <div class="card-body">

            <h2 class="text-uppercase fs-2 text-danger text-center fw-semibold">Donor Update Form</h2><br>
            <form action="<%= request.getContextPath() %>/updateDonor" method="post"  onsubmit="return validateForm();">

                <c:if test="${not empty errorMsg}">
                   <p class="text-danger fs-2 fw-bold text-center"> ${errorMsg}</p>
                </c:if>

                <c:if test="${not empty successMsg}">
                    <p class="text-success fs-2 fw-bold text-center"> ${successMsg}</p>
                </c:if>
                <input type="hidden" name="id" value="${donor.id}">
                <div class="mb-3">
                    <label class="form-label">Email Address <span class="text-danger fw-bolder">*</span></label>
                    <input type="text" id="email" name="email" class="form-control" value="${donor.email}" readonly="readonly">
                    <div id="emailError" class="error">You can't leave this field empty!</div>
                </div>

                <div class="mb-3">
                    <label class="form-label">Date of Birth <span class="text-danger fw-bolder">*</span></label>
                    <div class="row g-2">
                        <div class="col">
                            <select name="dobYear" id="dobYear" class="form-select">
                                <option value="">Year</option>

                                <option value="1990" ${donor.dobYear == 1990 ? 'selected' : ''}>1990</option>
                                <option value="1991" ${donor.dobYear == 1991 ? 'selected' : ''}>1991</option>
                                <option value="1992" ${donor.dobYear == 1992 ? 'selected' : ''}>1992</option>
                                <option value="1993" ${donor.dobYear == 1993 ? 'selected' : ''}>1993</option>
                                <option value="1994" ${donor.dobYear == 1994 ? 'selected' : ''}>1994</option>
                                <option value="1995" ${donor.dobYear == 1995 ? 'selected' : ''}>1995</option>
                                <option value="1996" ${donor.dobYear == 1996 ? 'selected' : ''}>1996</option>
                                <option value="1997" ${donor.dobYear == 1997 ? 'selected' : ''}>1997</option>
                                <option value="1998" ${donor.dobYear == 1998 ? 'selected' : ''}>1998</option>
                                <option value="1999" ${donor.dobYear == 1999 ? 'selected' : ''}>1999</option>
                                <option value="2000" ${donor.dobYear == 2000 ? 'selected' : ''}>2000</option>
                                <option value="2001" ${donor.dobYear == 2001 ? 'selected' : ''}>2001</option>
                                <option value="2002" ${donor.dobYear == 2002 ? 'selected' : ''}>2002</option>
                                <option value="2003" ${donor.dobYear == 2003 ? 'selected' : ''}>2003</option>
                                <option value="2004" ${donor.dobYear == 2004 ? 'selected' : ''}>2004</option>
                                <option value="2005" ${donor.dobYear == 2005 ? 'selected' : ''}>2005</option>
                            </select>

                        </div>
                        <div class="col">
                            <select name="dobMonth" id="dobMonth" class="form-select">
                                <option value="">Month</option>

                                <option value="January"   ${donor.dobMonth == 'January'   ? 'selected' : ''}>January</option>
                                <option value="February"  ${donor.dobMonth == 'February'  ? 'selected' : ''}>February</option>
                                <option value="March"     ${donor.dobMonth == 'March'     ? 'selected' : ''}>March</option>
                                <option value="April"     ${donor.dobMonth == 'April'     ? 'selected' : ''}>April</option>
                                <option value="May"       ${donor.dobMonth == 'May'       ? 'selected' : ''}>May</option>
                                <option value="June"      ${donor.dobMonth == 'June'      ? 'selected' : ''}>June</option>
                                <option value="July"      ${donor.dobMonth == 'July'      ? 'selected' : ''}>July</option>
                                <option value="August"    ${donor.dobMonth == 'August'    ? 'selected' : ''}>August</option>
                                <option value="September" ${donor.dobMonth == 'September' ? 'selected' : ''}>September</option>
                                <option value="October"   ${donor.dobMonth == 'October'   ? 'selected' : ''}>October</option>
                                <option value="November"  ${donor.dobMonth == 'November'  ? 'selected' : ''}>November</option>
                                <option value="December"  ${donor.dobMonth == 'December'  ? 'selected' : ''}>December</option>
                            </select>

                        </div>
                        <div class="col">
                            <select name="dobDay" id="dobDay" class="form-select">
                                <option value="">Day</option>

                                <option value="1"  ${donor.dobDay == 1  ? 'selected' : ''}>1</option>
                                <option value="2"  ${donor.dobDay == 2  ? 'selected' : ''}>2</option>
                                <option value="3"  ${donor.dobDay == 3  ? 'selected' : ''}>3</option>
                                <option value="4"  ${donor.dobDay == 4  ? 'selected' : ''}>4</option>
                                <option value="5"  ${donor.dobDay == 5  ? 'selected' : ''}>5</option>
                                <option value="6"  ${donor.dobDay == 6  ? 'selected' : ''}>6</option>
                                <option value="7"  ${donor.dobDay == 7  ? 'selected' : ''}>7</option>
                                <option value="8"  ${donor.dobDay == 8  ? 'selected' : ''}>8</option>
                                <option value="9"  ${donor.dobDay == 9  ? 'selected' : ''}>9</option>
                                <option value="10" ${donor.dobDay == 10 ? 'selected' : ''}>10</option>
                                <option value="11" ${donor.dobDay == 11 ? 'selected' : ''}>11</option>
                                <option value="12" ${donor.dobDay == 12 ? 'selected' : ''}>12</option>
                                <option value="13" ${donor.dobDay == 13 ? 'selected' : ''}>13</option>
                                <option value="14" ${donor.dobDay == 14 ? 'selected' : ''}>14</option>
                                <option value="15" ${donor.dobDay == 15 ? 'selected' : ''}>15</option>
                                <option value="16" ${donor.dobDay == 16 ? 'selected' : ''}>16</option>
                                <option value="17" ${donor.dobDay == 17 ? 'selected' : ''}>17</option>
                                <option value="18" ${donor.dobDay == 18 ? 'selected' : ''}>18</option>
                                <option value="19" ${donor.dobDay == 19 ? 'selected' : ''}>19</option>
                                <option value="20" ${donor.dobDay == 20 ? 'selected' : ''}>20</option>
                                <option value="21" ${donor.dobDay == 21 ? 'selected' : ''}>21</option>
                                <option value="22" ${donor.dobDay == 22 ? 'selected' : ''}>22</option>
                                <option value="23" ${donor.dobDay == 23 ? 'selected' : ''}>23</option>
                                <option value="24" ${donor.dobDay == 24 ? 'selected' : ''}>24</option>
                                <option value="25" ${donor.dobDay == 25 ? 'selected' : ''}>25</option>
                                <option value="26" ${donor.dobDay == 26 ? 'selected' : ''}>26</option>
                                <option value="27" ${donor.dobDay == 27 ? 'selected' : ''}>27</option>
                                <option value="28" ${donor.dobDay == 28 ? 'selected' : ''}>28</option>
                                <option value="29" ${donor.dobDay == 29 ? 'selected' : ''}>29</option>
                                <option value="30" ${donor.dobDay == 30 ? 'selected' : ''}>30</option>
                                <option value="31" ${donor.dobDay == 31 ? 'selected' : ''}>31</option>
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
                    <input type="text" id="firstName" name="firstName" class="form-control" value="${donor.firstName}">
                    <div id="firstNameError" class="error">You can't leave this field empty!</div>
                </div>

                <div class="mb-3">
                    <label class="form-label">Last Name <span class="text-danger fw-bolder">*</span></label>
                    <input type="text" id="lastName"  name="lastName" class="form-control" value="${donor.lastName}">
                    <div id="lastNameError" class="error">You can't leave this field empty!</div>
                </div>


                <!-- ZIP -->
                <div class="mb-3">
                    <label class="form-label fw-bold">ZIP Code <span class="text-danger fw-bolder">*</span></label>
                    <input class="form-control" id="zip" name="zip" value="${donor.zip}">
                    <div id="zipError" class="error">Required.</div>
                </div>

                <hr>

                <!-- Username -->
                <div class="mb-3">
                    <label class="form-label fw-bold">User Name <span class="text-danger fw-bolder">*</span></label>
                    <input class="form-control" id="userName" name="userName" value="${donor.userName}">
                    <div id="userNameError" class="error">Required.</div>
                </div>

                <!-- Password -->
                <div class="mb-3">
                    <label class="form-label fw-bold">Password <span class="text-danger fw-bolder">*</span></label>
                    <input type="password" class="form-control" id="password" name="password" value="${donor.password}">
                    <div id="passwordError" class="error">Minimum 8 characters.</div>
                </div>

                <!-- Confirm Password -->
                <div class="mb-4">
                    <label class="form-label fw-bold">Confirm Password <span class="text-danger fw-bolder">*</span></label>
                    <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" value="${donor.password}">
                    <div id="confirmPwdError" class="error">Passwords must match.</div>
                </div>

                <!-- Submit -->
                <button type="submit" class="btn btn-danger w-100 py-2 text-white fw-bold">
                    Update
                </button>

            </form>
        </div>
    </div>
    </div>
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

