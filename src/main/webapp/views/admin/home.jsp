<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home admin</title>
    </head>
    <body>   
        <h1>HelloWorld</h1>
        <h1>${items[0].productName}</h1>
        <img src="${items[0].image}" alt="" height="220px" width="430px">
        <ul class="pagination" id="pagination"></ul>
        <c:forEach var="item" items="${items}">
            
            <img src="${item.image}" alt="" height="220px" width="430px">
        </c:forEach>
        <script>
            $(function () {
                window.pagObj = $('#pagination').twbsPagination({
                    totalPages: 35,
                    visiblePages: 10,
                    onPageClick: function (event, page) {
                        console.info(page + ' (from options)');
                    }
                }).on('page', function (event, page) {
                    console.info(page + ' (from event listening)');
                });
            });
        </script>
    </body>
</html>
