const loginForm = document.getElementById("loginForm");

const email = document.getElementById("email");
const password = document.getElementById("password");

const emailError = document.getElementById("emailError");
const passwordError = document.getElementById("passwordError");

const successMessage = document.getElementById("successMessage");

const togglePassword = document.getElementById("togglePassword");


// Show / Hide Password
togglePassword.addEventListener("click", function () {

    if (password.type === "password") {

        password.type = "text";
        togglePassword.textContent = "Hide";

    } else {

        password.type = "password";
        togglePassword.textContent = "Show";

    }

});


// Login Form Validation
loginForm.addEventListener("submit", function (event) {

    event.preventDefault();

    emailError.textContent = "";
    passwordError.textContent = "";
    successMessage.textContent = "";

    let isValid = true;

    // Email validation
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (email.value.trim() === "") {

        emailError.textContent = "Email is required.";
        isValid = false;

    } else if (!emailPattern.test(email.value.trim())) {

        emailError.textContent = "Enter a valid email address.";
        isValid = false;

    }


    // Password validation
    if (password.value.trim() === "") {

        passwordError.textContent = "Password is required.";
        isValid = false;

    } else if (password.value.length < 6) {

        passwordError.textContent =
            "Password must be at least 6 characters.";

        isValid = false;

    }


    // Successful validation
    if (isValid) {

        successMessage.textContent =
            "Login successful!";

        loginForm.reset();

        password.type = "password";
        togglePassword.textContent = "Show";

    }

});

// ===============================
// SIGN UP PAGE
// ===============================

const signupForm = document.getElementById("signupForm");

if (signupForm) {

    const name = document.getElementById("name");
    const signupEmail = document.getElementById("signupEmail");
    const signupPassword = document.getElementById("signupPassword");
    const confirmPassword = document.getElementById("confirmPassword");

    const toggleSignupPassword =
        document.getElementById("toggleSignupPassword");

    const toggleConfirmPassword =
        document.getElementById("toggleConfirmPassword");


    // Show / Hide Password
    toggleSignupPassword.addEventListener("click", function () {

        if (signupPassword.type === "password") {

            signupPassword.type = "text";
            toggleSignupPassword.textContent = "Hide";

        } else {

            signupPassword.type = "password";
            toggleSignupPassword.textContent = "Show";

        }

    });


    // Show / Hide Confirm Password
    toggleConfirmPassword.addEventListener("click", function () {

        if (confirmPassword.type === "password") {

            confirmPassword.type = "text";
            toggleConfirmPassword.textContent = "Hide";

        } else {

            confirmPassword.type = "password";
            toggleConfirmPassword.textContent = "Show";

        }

    });


    // Sign Up Validation
    signupForm.addEventListener("submit", function (event) {

        event.preventDefault();


        // Clear previous errors
        document.getElementById("nameError").textContent = "";
        document.getElementById("signupEmailError").textContent = "";
        document.getElementById("signupPasswordError").textContent = "";
        document.getElementById("confirmPasswordError").textContent = "";
        document.getElementById("termsError").textContent = "";
        document.getElementById("signupSuccess").textContent = "";


        let isValid = true;


        // Name validation
        if (name.value.trim() === "") {

            document.getElementById("nameError").textContent =
                "Name is required.";

            isValid = false;

        } else if (name.value.trim().length < 3) {

            document.getElementById("nameError").textContent =
                "Name must be at least 3 characters.";

            isValid = false;

        }


        // Email validation
        const emailPattern =
            /^[^\s@]+@[^\s@]+\.[^\s@]+$/;


        if (signupEmail.value.trim() === "") {

            document.getElementById("signupEmailError").textContent =
                "Email is required.";

            isValid = false;

        } else if (!emailPattern.test(signupEmail.value.trim())) {

            document.getElementById("signupEmailError").textContent =
                "Enter a valid email address.";

            isValid = false;

        }


        // Password validation
        if (signupPassword.value.trim() === "") {

            document.getElementById("signupPasswordError").textContent =
                "Password is required.";

            isValid = false;

        } else if (signupPassword.value.length < 6) {

            document.getElementById("signupPasswordError").textContent =
                "Password must be at least 6 characters.";

            isValid = false;

        }


        // Confirm password
        if (confirmPassword.value.trim() === "") {

            document.getElementById("confirmPasswordError").textContent =
                "Please confirm your password.";

            isValid = false;

        } else if (
            confirmPassword.value !== signupPassword.value
        ) {

            document.getElementById("confirmPasswordError").textContent =
                "Passwords do not match.";

            isValid = false;

        }


        // Terms
        const terms = document.getElementById("terms");

        if (!terms.checked) {

            document.getElementById("termsError").textContent =
                "You must accept the Terms & Conditions.";

            isValid = false;

        }


        // Success
        if (isValid) {

            document.getElementById("signupSuccess").textContent =
                "Account created successfully!";

            signupForm.reset();

            signupPassword.type = "password";
            confirmPassword.type = "password";

            toggleSignupPassword.textContent = "Show";
            toggleConfirmPassword.textContent = "Show";

        }

    });

}