<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <title><dec:title default="Trang chủ"/></title>
        <!-- bootstrap & fontawesome -->
        <link rel="icon" type="image/x-icon" href="<c:url value='/template/web/images2/logow.ico'/>" />
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">
        <!-- CSS -->
        <link rel="stylesheet" href="<c:url value='/template/web/styles/main.css'/>" />
        <link rel="stylesheet" href="<c:url value='/template/web/styles/alert.css'/>" />
        <!-- Font awesome -->
        <link rel="stylesheet" href="https://kit-pro.fontawesome.com/releases/v5.12.1/css/pro.min.css" />
        <script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js" crossorigin="anonymous"></script>
        <dec:head/>
    </head>
    <body>
        <%@include file="/common/web/header.jsp" %>       
        <dec:body/>
        <%@include file="/common/web/footer.jsp" %>
        <!-- ---------- js for toggle menu ---------- -->
        <script src="<c:url value='/template/web/js/main.js'/>"></script>
    </body>
</html>

