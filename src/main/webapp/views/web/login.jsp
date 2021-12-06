<%-- 
    Document   : login
    Created on : Nov 12, 2021, 10:44:20 PM
    Author     : asus
--%>
<%@include file="/common/taglib.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:url var="formUrl" value="/login-home"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <!-- Login Container -->
        <div class="hero">
            <div class="form-box">
                <div class="button-box">
                    <div id="btn"></div>
                    <button type="button" class="toggle-btn" onclick="login()">Log In</button>
                    <button type="button" class="toggle-btn" onclick="signUp()">Sign Up</button>
                </div>
                <!--<form action="<c:url value='/login-dang-nhap'/>" method="post" id="formLogin" class="input-group input-login">-->
                <form action="<c:url value='/login-dang-nhap'/>" method="post" id="Log-in" class="input-group input-login">
                    <c:if test="${not empty messageResponse}">
                        <div class="alert alert-info alert-${alert}" >
                            <a class="panel-close close" data-dismiss="alert">×</a>
                            <i class="fa fa-coffee"></i>
                            ${messageResponse}
                        </div>
                    </c:if>
                    <input type="text" class="input-field" placeholder="User Name" name="userName" required>
                    <input type="password" class="input-field" placeholder="Enter Password" name="password" style="margin-bottom: 30px;" required>
                    <!--<input type="checkbox" class="check-box"><span class="check-span">Remember Password</span>-->
                    <input type="hidden" value="login" name="action"/>
                    <button type="submit" class="submit-btn">Log In</button>
                </form>
                <form action="<c:url value='/register-user'/>" method="get" id="Sign-up" class="input-group">                    
                    <input type="text" class="input-field" placeholder="User Name" name="userName" required>
                    <input type="text" class="input-field" placeholder="First Name" name="firstName" required>
                    <input type="text" class="input-field" placeholder="Last Name" name="lastName">
                    <input type="email" class="input-field" placeholder="Email" name="email" required>
                    <input type="password" id="password" class="input-field" placeholder="Enter Password" name="password" required>
                    <input type="password" id="confirm_password" class="input-field" placeholder="Retype Password" style="margin-bottom: 30px;" >
                    <!--<input type="checkbox" class="check-box"><span class="check-span">I Agree Term</span>-->
                    <button type="submit" class="submit-btn">Sign Up</button>
                </form>
            </div>
        </div>
        <script>
            var password = document.getElementById("password")
                    , confirm_password = document.getElementById("confirm_password");

            function validatePassword() {
                if (password.value != confirm_password.value) {
                    confirm_password.setCustomValidity("Passwords Don't Match");
                } else {
                    confirm_password.setCustomValidity('');
                }
            }

            password.onchange = validatePassword;
            confirm_password.onkeyup = validatePassword;
        </script>
    </body>
</html>
