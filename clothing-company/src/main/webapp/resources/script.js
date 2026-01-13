function validateClothName() {
    let name = document.getElementById("clothName");
    let error = document.getElementById("clothNameError");

    if (name.value.trim() === "") {
        error.textContent = "Cloth name is required";
        return false;
    }else if(name.value.length<4){
     error.textContent = "Cloth name must be more than 4 characters";
    } else {
        error.textContent = "";
        return true;
    }
}

function validateBrandName() {
    let name = document.getElementById("brandName");
    let error = document.getElementById("brandNameError");

    if (name.value.trim() === "") {
        error.textContent = "Brand name is required";
        return false;
    }else if(name.value.length<2){
     error.textContent = "Brand name must be more than 2 characters";
    } else {
        error.textContent = "";
        return true;
    }
}

function validateCategoryName() {
    let name = document.getElementById("categoryName");
    let error = document.getElementById("categoryNameError");

    if (name.value.trim() === "") {
        error.textContent = "Category name is required";
        return false;
    }else if(name.value.length<2){
     error.textContent = " Category name must be more than 2 characters";
    } else {
        error.textContent = "";
        return true;
    }
}

function validateSize() {
    let name = document.getElementById("size");
    let error = document.getElementById("sizeError");

    if (name.value.trim() === "") {
        error.textContent = "Size name is required";
        return false;
    } else {
        error.textContent = "";
        return true;
    }
}

function validateAvailabilityStatus() {
    let type = document.getElementById("availabilityStatus");
    let error = document.getElementById("availabilityStatusError");

    if (type.value === "") {
        error.textContent = "Please select Availability Status";
        return false;
    } else {
        error.textContent = "";
        return true;
    }
}

function validateColor() {
    let name = document.getElementById("color");
    let error = document.getElementById("colorError");

    if (name.value.trim() === "") {
        error.textContent = "Color name is required";
        return false;
    }else if(name.value.length<2){
     error.textContent = " Color name must be more than 2 characters";
    } else {
        error.textContent = "";
        return true;
    }
}


function validatePrice() {
    let price = document.getElementById("price");
    let error = document.getElementById("priceError");

    if (price.value.trim() === "") {
        error.textContent = "Price is required";
        return false;
    }

    if (isNaN(price.value) || Number(price.value) <= 0) {
        error.textContent = "Enter valid price (only numbers)";
        return false;
    }

    error.textContent = "";
    return true;
}

function validateStockQuantity() {
    let price = document.getElementById("stockQuantity");
    let error = document.getElementById("stockQuantityError");

    if (price.value.trim() === "") {
        error.textContent = "Stock Quantity is required";
        return false;
    }

    if (isNaN(price.value) || Number(price.value) < 0) {
        error.textContent = "Enter valid Stock Quantity";
        return false;
    }

    error.textContent = "";
    return true;
}


function enableSubmit() {
    let isValid =
        validateClothName() &&
         validateBrandName() &&
         validateCategoryName() &&
         validateSize()&&
         validateColor()&&
        validatePrice()&&
        validateStockQuantity()&&
        validateAvailabilityStatus();

    document.getElementById("registerBtn").disabled = !isValid;
}

document.getElementById("availabilityStatus").onkeyup = function () {
    validateAvailabilityStatus();
    enableSubmit();
};

