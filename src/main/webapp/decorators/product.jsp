<%-- 
    Document   : product
    Created on : Nov 13, 2021, 11:36:49 AM
    Author     : asus
--%>
<%@include file="/common/taglib.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>

<link rel="icon" type="image/x-icon" href="<c:url value='/template/web/images2/logow.ico'/>" />
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">
        <!-- CSS -->
        <link rel="stylesheet" href="<c:url value='/template/web/styles/main.css'/>" />
        <!-- Font awesome -->
        <link rel="stylesheet" href="https://kit-pro.fontawesome.com/releases/v5.12.1/css/pro.min.css" />
        <script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js" crossorigin="anonymous"></script>


        <dec:head/>
    </head>
    <body>
        <%@include file="/common/product/header.jsp" %>
        <%--<%@include file="/common/admin/menu.jsp" %>--%>
        <dec:body/>
        <%@include file="/common/product/footer.jsp" %>
        <script src="<c:url value='/template/web/js/main.js'/>"></script>
    </body>
</html>
