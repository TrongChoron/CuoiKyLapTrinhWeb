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
                <!-- left column -->
            <div class="col-md-3">
                <div class="text-center">
                    <a href="admin-home" class="btn btn-info" style="padding: 20px;">Admin</a><br>
                    <a href="trang-chu" class="btn btn-info" style="padding: 20px;margin-top: 20px;">Home</a>
                </div>
            </div>
                <!--edit colunm-->
                <div class="col-md-9 personal-info">
                    <c:if test="${not empty messageResponse}">
<!--                        <div class="alert alert-block alert-${alert}">
                            <button type="button" class="close" data-dismiss="alert">
                                <i class="ace-icon fa fa-times"></i>
                            </button>
                            ${messageResponse}
                        </div>-->
                        <div class="alert alert-info alert-${alert}">
                            <a class="panel-close close" data-dismiss="alert">×</a>
                            <i class="fa fa-coffee"></i>
                            ${messageResponse}
                        </div>
                    </c:if>
                    <div style="margin-top: 10px" class="form-text" id="notification"></div>

                    <h3>Personal info</h3>

                    <form class="form-horizontal" id="formUser" role="form">
                        <div class="form-group">
                            <label class="col-lg-3 control-label">First name:</label>
                            <div class="col-lg-8">
                                <input class="form-control" type="text" value="${model.firstName}" name="firstName">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">Last name:</label>
                            <div class="col-lg-8">
                                <input class="form-control" type="text" value="${model.lastName}" name="lastName">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">Email:</label>
                            <div class="col-lg-8">
                                <input class="form-control" type="text" value="${model.email}" name="email">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">Address:</label>
                            <div class="col-lg-8">
                                <input class="form-control" type="text" value="${model.address}" name="address">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-lg-3 control-label">Phone Number:</label>
                            <div class="col-lg-8">
                                <input class="form-control" type="tel" value="${model.phone}" id="phone" name="phone" pattern="[0-9]{10}" required>
                            </div>
                        </div>
                            <input type="hidden" value="${model.roleModel.roleId}" id="roleId" />
                            <input type="hidden" value="${model.userId}" id="id" name="userId"/>
                            <input type="hidden" value="${model.userName}" id="id" name="userName"/>
                            <input type="hidden" value="${model.password}" id="id" name="password"/>
                        <div class="form-group1">
                            <button class="btn" id="btnAddOrUpdate">Save</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!--</form>-->
    <script>
        $('#btnAddOrUpdate').click(function (e) {
            e.preventDefault(); // submit về 1 API
            var data = {};
            var formData = $('#formUser').serializeArray();
            $.each(formData, function (i, v) {
                data["" + v.name + ""] = v.value;
            });
            var id = $('#id').val();
            var roleId = $('#roleId').val();
            data.roleModel={};
            data.roleModel.roleId=roleId;
            console.log(data);
            if (id == "") {
                addDiscount(data);
            } else {
                updateDiscount(data);
            }
        });
        function updateDiscount(data) {
            $.ajax({
                url: '${APIUser}',
                type: 'PUT',
                contentType: 'application/json',
                data: JSON.stringify(data),
                dataType: 'json',
                success: function (result) {
//                     window.location.href = "/update-profile?messageResponse=Update_Success&&alert=success";
                     $('#notification').html(`
                            <div class="alert alert-info alert-success">
                            <a class="panel-close close" data-dismiss="alert">×</a>
                            <i class="fa fa-coffee"></i>
                            Update Success!
                        </div>`)
                },
                error: function (error) {
//                    window.location.href = "/update-profile?messageResponse=Update_not_Success&&alert=danger";
                    $('#notification').html(`
                            <div class="alert alert-info alert-danger">
                            <a class="panel-close close" data-dismiss="alert">×</a>
                            <i class="fa fa-coffee"></i>
                            Update Fail!
                        </div>`)
                }
            });
        }
    </script>
</body>

</html>
