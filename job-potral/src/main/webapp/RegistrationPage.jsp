<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <style>
        .error {
            color: red;
            font-size: 0.85rem;
            display: none;
        }
    </style>
</head>
<body class="bg-body-secondary">
<nav class="navbar navbar-expand-lg navbar-dark bg-primary sticky-sm-top" style="height: 60px;">
    <div class="container-fluid">
        <a class="navbar-brand fs-3 fw-bold text-white" href="index">Home</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link active fs-3 fw-bold" href="register">Register</a></li>
                <li class="nav-item"><a class="nav-link active fs-3 fw-bold" href="search">Search</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="d-flex justify-content-center align-items-center" style="height:150vh;">
    <div class="card p-2 bg-body-secondary bg-opacity-75 border border-dark border-2 rounded" style="width: 45rem;">
        <div class="card-body">
            <h3 class="card-title fs-1 text-center fw-semibold text-dark text-uppercase"><b>Registration Form</b></h3>
            <br>
            <form onsubmit="return validateForm()" method="post" action="registerUser">
                <div class="fs-3 fw-bold  text-uppercase">Personal Details</div>
                <hr class="border border-dark border-1 opacity-75">
                <div class="row mt-3">
                    <div class="col-md-6">
                        <label class="fs-5 fw-semibold">First Name <span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="firstName" name="firstName">
                        <div class="error" id="firstNameError">Required</div>
                    </div>
                    <div class="col-md-6">
                        <label class="fs-5 fw-semibold">Last Name <span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="lastName" name="lastName">
                        <div class="error" id="lastNameError">Required</div>
                    </div>
                </div>

                <div class="row mt-3">
                    <div class="col-md-6">
                        <label class="fs-5 fw-semibold">Email <span class="text-danger">*</span></label>
                        <input type="email" class="form-control" id="email" name="email">
                        <div class="error" id="emailError">Invalid email</div>
                    </div>
                    <div class="col-md-6">
                        <label class="fs-5 fw-semibold">Contact Number <span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="phoneNumber" name="phoneNumber">
                        <div class="error" id="phoneError">Required</div>
                    </div>
                </div>
                <br>

                <div class="fs-3 fw-bold  text-uppercase ">Experience</div>
                <hr class="border border-dark border-1 opacity-75">
                <div class="mt-3">
                    <label class="fs-5 fw-semibold">Are you experienced? <span class="text-danger">*</span></label><br>
                    <input type="radio" name="experienced" value="YES" onclick="showExperience()"> Yes
                    <input type="radio" name="experienced" value="NO" onclick="hideExperience()"> No
                    <div class="error" id="experienceError">Select an option</div>
                </div>
                <br>
                <div id="experienceSection" style="display:none">
                    <div class="row mt-3">
                        <div class="col-md-6">
                            <label class="fs-5 fw-semibold">Company Name <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="companyName" name="companyName">
                            <div class="error" id="companyError">Required</div>
                        </div>
                        <div class="col-md-6">
                            <label class="fs-5 fw-semibold">Job Title <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="jobTitle" name="jobTitle">
                            <div class="error" id="jobError">Required</div>
                        </div>
                    </div>

                    <div class="row mt-3">
                        <div class="col-md-6">
                            <label class="fs-5 fw-semibold">From Date <span class="text-danger">*</span></label>
                            <input type="date" class="form-control" id="startDate" name="startDate">
                        </div>
                        <div class="col-md-6">
                            <label class="fs-5 fw-semibold">Last Working Date <span class="text-danger">*</span></label>
                            <input type="date" class="form-control" id="lastWorkingDate" name="lastWorkingDate">
                        </div>
                    </div>
                </div>
                <br>

                <div class="fs-3 fw-bold  text-uppercase ">Certification (Optional)</div>
                <hr class="border border-dark border-1 opacity-75">
                <div class="row mt-3">
                    <div class="col-md-6">
                        <label class="fs-5 fw-semibold">Certification Name</label>
                        <input type="text" class="form-control" name="certificationName">
                    </div>
                    <div class="col-md-6">
                        <label class="fs-5 fw-semibold">Issuing Organization</label>
                        <input type="text" class="form-control" name="issuingOrganization">
                    </div>
                </div>


                <div class="fs-3 fw-bold  text-uppercase">Professional Summary</div>
                <hr class="border border-dark border-1 opacity-75">
                <textarea class="form-control mt-3" rows="4"
                          id="professionalSummary" name="professionalSummary"></textarea>
                <div class="error" id="summaryError">Required</div>

                <div class="fs-3 fw-bold  text-uppercase">Skills</div>
                <hr class="border border-dark border-1 opacity-75">
                <div class="row mt-3">
                    <div class="col-md-6">
                        <label class="fs-5 fw-semibold">Primary Skills <span class="text-danger">*</span></label>
                        <input type="text" class="form-control" id="primarySkills" name="primarySkills">
                        <div class="error" id="skillsError">Required</div>
                    </div>
                    <div class="col-md-6">
                        <label class="fs-5 fw-semibold">Skill Level</label>
                        <select class="form-control" name="skillLevel">
                            <option>Beginner</option>
                            <option>Intermediate</option>
                            <option>Expert</option>
                        </select>
                    </div>
                </div>

                <button class="btn btn-primary w-75 m-5 fw-bold">Register</button>
            </form>
        </div>
    </div>
</div>

        <script>
            function showExperience() {
                document.getElementById("experienceSection").style.display = "block";
            }

            function hideExperience() {
                document.getElementById("experienceSection").style.display = "none";
            }

            function validateForm() {
                let valid = true;
                document.querySelectorAll(".error").forEach(e => e.style.display = "none");

                if (!firstName.value.trim()) { firstNameError.style.display="block"; valid=false; }
                if (!lastName.value.trim()) { lastNameError.style.display="block"; valid=false; }

                let emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
                if (!email.value.match(emailPattern)) { emailError.style.display="block"; valid=false; }

                if (!phoneNumber.value.trim()) { phoneError.style.display="block"; valid=false; }

                let expSelected = document.querySelector('input[name="experienced"]:checked');
                if (!expSelected) { experienceError.style.display="block"; valid=false; }

                if (expSelected && expSelected.value === "YES") {
                    if (!companyName.value.trim()) { companyError.style.display="block"; valid=false; }
                    if (!jobTitle.value.trim()) { jobError.style.display="block"; valid=false; }
                }

                if (!professionalSummary.value.trim()) { summaryError.style.display="block"; valid=false; }
                if (!primarySkills.value.trim()) { skillsError.style.display="block"; valid=false; }

                return valid;
            }
        </script>
</body>
</html>