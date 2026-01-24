function validateUserEmail() {
    const email = document.getElementById("email");
    const error = document.getElementById("emailError");

    const emailPattern = /^[a-zA-Z0-9._%+-]+@gmail\.com$/;

    if (email.value.trim() === "") {
        error.textContent = "Email is required";
        return false;
    } else if (!emailPattern.test(email.value.trim())) {
        error.textContent = "Enter a valid email address which should include @gmail.com";
        return false;
    } else {
        error.textContent = "";
        return true;
    }
}



