<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home admin</title>
    </head>
    <body>   
        <div class="container-fluid px-4">
            <div class="row g-3 my-2">
                <div class="col-md-3">
                    <div class="p-3 bg-white shadow-sm d-flex justify-content-around align-items-center rounded">
                        <div>
                            <h3 class="fs-2">${products.size()}</h3>
                            <p class="fs-5">Products</p>
                        </div>
                        <i class="fas fa-gift fs-1"></i>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="p-3 bg-white shadow-sm d-flex justify-content-around align-items-center rounded">
                        <div>
                            <h3 class="fs-2">${users.size()}</h3>
                            <p class="fs-5">Customer</p>
                        </div>
                        <i class="fas fa-gift fs-1"></i>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="p-3 bg-white shadow-sm d-flex justify-content-around align-items-center rounded">
                        <div>
                            <h3 class="fs-2">${orders.size()}</h3>
                            <p class="fs-5">Orders</p>
                        </div>
                        <i class="fas fa-gift fs-1"></i>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="p-3 bg-white shadow-sm d-flex justify-content-around align-items-center rounded">
                        <div>
                            <h3 class="fs-2">%25</h3>
                            <p class="fs-5">Increase</p>
                        </div>
                        <i class="fas fa-chart-line fs-1"></i>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

