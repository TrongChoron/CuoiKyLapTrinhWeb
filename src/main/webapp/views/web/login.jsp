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
                <form action="<c:url value='/login-dang-nhap'/>" method="post" id="formLogin" class="input-group input-login">
                    <c:if test="${not empty messageResponse}">
                        <div class="alert alert-block alert-${alert}">
                            <button type="button" class="close" data-dismiss="alert">
                                <i class="ace-icon fa fa-times"></i>
                            </button>
                            ${messageResponse}
                        </div>
                    </c:if>
                    <input type="text" class="input-field" placeholder="User Name" name="userName" required>
                    <input type="password" class="input-field" placeholder="Enter Password" name="password" required>
                    <input type="checkbox" class="check-box"><span class="check-span">Remember Password</span>
                    <input type="hidden" value="login" name="action"/>
                    <button type="submit" class="submit-btn">Log In</button>
                </form>
                <form action="" id="Sign-up" class="input-group">
                    <input type="text" class="input-field" placeholder="User Name" required>
                    <input type="text" class="input-field" placeholder="First Name" required>
                    <input type="text" class="input-field" placeholder="Last Name">
                    <input type="text" class="input-field" placeholder="Email" required>
                    <input type="password" class="input-field" placeholder="Enter Password" required>
                    <input type="checkbox" class="check-box"><span class="check-span">I Agree Term</span>
                    <button type="submit" class="submit-btn">Sign Up</button>
                </form>
            </div>
        </div>
    </body>
</html>
