function validatePassword() {
    let password = document.getElementById("newPassword").value;
    let error = document.getElementById("passwordError");

    if (password.trim() === "") {
        error.textContent = "Password is required";
        return false;
    }

    if (password.length < 6) {
        error.textContent = "Password must be at least 6 characters";
        return false;
    }

    let pattern = /^(?=.*[A-Za-z])(?=.*\d).+$/;
    if (!pattern.test(password)) {
        error.textContent = "Password must contain letters and numbers";
        return false;
    }

    error.textContent = "";
    return true;
}

function validateConfirmPassword() {
    let confirmPassword = document.getElementById("confirmPassword").value;
    let error = document.getElementById("confirmPasswordError");

    if (confirmPassword.trim() === "") {
        error.textContent = "Confirm password is required";
        return false;
    }

    if (password !== confirmPassword) {
        error.textContent = "Passwords do not match";
        return false;
    }
    error.textContent = "";
    return true;
}