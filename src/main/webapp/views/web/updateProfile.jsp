<%-- 
    Document   : register
    Created on : Dec 1, 2021, 9:38:29 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<c:url var="APIUser" value="/api-admin-user"/>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js"></script>
        <style>
            body {
                margin-top: 20px;
            }

            .btn {
                border-color: #4650dd;
                align-items: flex-start;
                border-radius: 4px;
                border-style: solid;
                border-width: 1px;
                background-color: #fff;
                color: #4650dd;
            }

            .btn:hover {
                background-color: #4650dd;
                color: #fff;
            }
            /* Account */
            .center-logo11 {
                margin: auto;
                padding: 10px;
                align-items: center;
                color: #333333;
                display: flex;
                font-size: 14px;
                justify-content: space-between;
                line-height: 20px;
                box-sizing: border-box;
            }
            .account-navbar11 {
                border: 1px solid transparent;
                border-radius: 0;
                border-width: 0 0 2px;
                border-color: #e7e7e7;
                display: flex;
                /* justify-content: center; */
                align-items: center;
                /* padding: 20; */
                padding-bottom: 20px;
                /* padding-top: 20px; */
                z-index: 1;
                width: 100%;
            }
        </style>
    </head>

    <body>
        <header class="account-navbar11">
            <div class="center-logo11">
                <a href="trang-chu"><img src="<c:url value='template/web/images2/logo.png'/>" width="90px" alt="" /></a>
            </div>
        </header>
        <div class="container bootstrap snippets bootdey">
            <h1 class="text-primary">Edit Profile</h1>
            <hr>
            <div class="row">
                <div class="col-md-9 personal-info">
                    <c:if test="${not empty messageResponse}">
                        <div class="alert alert-block alert-${alert}">
                            <button type="button" class="close" data-dismiss="alert">
                                <i class="ace-icon fa fa-times"></i>
                            </button>
                            ${messageResponse}
                        </div>
                        <div class="alert alert-info alert-${alert}">
                            <a class="panel-close close" data-dismiss="alert">×</a>
                            <i class="fa fa-coffee"></i>
                            This is an <strong>.alert</strong>. Use this to show important messages to the user.
                        </div>
                    </c:if>

                    <h3>Personal info</h3>

                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label class="col-lg-3 control-label">First name:</label>
                            <div class="col-lg-8">
                                <input class="form-control" type="text" value="dey-dey">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">Last name:</label>
                            <div class="col-lg-8">
                                <input class="form-control" type="text" value="bootdey">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">Email:</label>
                            <div class="col-lg-8">
                                <input class="form-control" type="text">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">Address:</label>
                            <div class="col-lg-8">
                                <input class="form-control" type="text" value="">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-lg-3 control-label">Phone Number:</label>
                            <div class="col-lg-8">
                                <input class="form-control" type="tel" id="phone" name="phone" pattern="[0-9]{10}" required>
                            </div>
                        </div>
                        <div class="form-group1">
                            <button class="btn">Save</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>

</html>
