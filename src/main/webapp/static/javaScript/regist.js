const signinBtn = document.getElementById("signin");
const signupBtn = document.getElementById("signup");
const container = document.querySelector(".container");

signinBtn.addEventListener("click", () => {
    container.classList.remove("right-panel-active")
})

signupBtn.addEventListener("click", () => {
    container.classList.add("right-panel-active")
})
$(function () {

    $("#username").click(function () {
        var usernameVar = $("#username").val(); //用户名
        var usernamePatt = /^\w{5,12}$/;
        if(!usernamePatt.test(usernameVar))
        {
            $("#usernameError").text("用户名不合法");
            return false;
        }
    })
    $("#password").click(function () {
        var passwordVar = $("#password").val(); // 密码
        var passwordPatt = /^\w{5,12}$/;
        if(!passwordPatt.test(passwordVar)){
            $("#usernameError").text("密码不合法");
            return false;
        }
    })
});