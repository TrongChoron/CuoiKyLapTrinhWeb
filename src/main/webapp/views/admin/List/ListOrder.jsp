<%-- 
    Document   : ListOrder
    Created on : Nov 28, 2021, 10:33:38 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order List</title>
    </head>
    <body>
        <div class="main-content">
            <div class="main-content-inner">
                <div class="breadcrumb" id="breadcrumbs">
                    <script type="text/javascript">
                        try {
                            ace.settings.check('breadcrumbs', 'fixed')
                        } catch (e) {
                        }
                    </script>
                    <ul class="breadcrumb">
                        <li>
                            <i class="ace-icon fa fa-home home-icon"></i>
                            <a href="admin-home"><fmt:message key="label.home" bundle="${lang}"/></a>
                        </li>
                        <li style="margin-left: 10px">
                            <i class="fas fa-angle-right"></i>
                            <fmt:message key="label.OrderDetails" bundle="${lang}"/>
                        </li>
                    </ul>
                </div>
                <form id="formsubmit" action="<c:url value='/admin-order'/>" method="get">
                    <div class="card card-table">
                        <div class="preload-wrapper">
                            <table class="table table-hover table-borderless align-middle mb-0" id="userDatatable">
                                <thead>
                                    <tr>
                                        <th style="padding-left: 10px"> </th>
                                        <!--<th>ID</th>-->
                                        <th>Order Id</th>
                                        <th>UserName</th>
                                        <th>Create At</th>
                                        <th>Total</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%--<c:forEach var="item" items="${items.listResult}">--%>
                                    <c:forEach var="item" items="${model.listResult}">
                                        <%--<c:if test="${item.roleModel.roleId !=1}">--%>
                                        <tr>
                                            <td style="padding-left: 10px"></td>
                                            <!--<td ><a href="javascript:void(-1)" class="text-decoration-none text-reset fw-bolder"></a></td>-->                                              

                                            <td ><a href="<c:url value='/admin-order-detail?orderId=${item.orderId}'/>">${item.orderId}</a></td>
                                            <td >${item.user.userName}</td>
                                            <td >${item.createAt}</td>
                                            <td >$${item.total}</td>

                                        </tr>
                                        <%--</c:if>--%>
                                    </c:forEach>
                                </tbody>
                            </table>      
                            <ul class="pagination" id="pagination" style="margin-left: 20px;border-radius: 30px;"></ul>
                            <span class="me-2" id="categoryBulkAction">
                                <label>Sort</label>
                                <select id="sort" onchange="Sort(this)" class="form-select form-select-sm d-inline w-auto" name="categoryBulkAction">
                                    <option value="" disabled selected>Choose your option</option>
                                    <option>A-Z</option>
                                    <option></option>
                                </select>
                            </span>

                        </div>
                    </div>
                </form>

            </div>
        </div>
        <script>
            function Sort(param) {
                var message = document.getElementById('sort');
                var value = param.value;
                if (value === 'A-Z') {
                    var table, rows, switching, i, x, y, shouldSwitch;
                    table = document.getElementById("userDatatable");
                    switching = true;
                    while (switching) {
                        switching = false;
                        rows = table.rows;
                        for (i = 1; i < (rows.length - 1); i++) {
                            // Start by saying there should be no switching:
                            shouldSwitch = false;
                            x = rows[i].getElementsByTagName("TD")[1];
                            y = rows[i + 1].getElementsByTagName("TD")[1];
                            // Check if the two rows should switch place:
                            if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
                                // If so, mark as a switch and break the loop:
                                shouldSwitch = true;
                                break;
                            }
                        }
                        if (shouldSwitch) {
                            rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
                            switching = true;
                        }
                    }
                }
            }
        </script> 
    </body>
</html>
