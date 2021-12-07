<%-- 
    Document   : home
    Created on : Nov 11, 2021, 8:26:46 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Web</title>
    </head>
    <body>
        <div class="header">
            <div class="container">
                <div class="row">
                    <div class="col-2">
                        <div class="color-news">
                            <h1>Buy & Sell<br> What's Now & Next</h1>
                            <p>We bring you the <b>NEWEST</b> and <b>HOTEST</b> shoes. <br>For details on them, please click the button
                                below.</p>
                        </div>
                        <a href="/product.html" class="btn">Explore Now &#8594;</a>
                    </div>
                    <div class="col-2">
                        <!-- <img src="/images/image1.png" alt=""> -->
                        <img src="<c:url value='/template/web/images2/image123.png'/>" alt="">
                    </div>
                    <main class="container-btn">
                        <div class="toggle-container">
                            <p>Click To Change Mode</p>
                            <button class="theme-btn light" onclick="setTheme('light')" title="Light mode">
                                <img src="<c:url value='/template/web/images2/sun.png'/>" alt="sun">
                            </button>
                            <button class="theme-btn dark" onclick="setTheme('dark')" title="Dark mode">
                                <img src="<c:url value='/template/web/images2/moon.png'/>" alt="moon">
                            </button>
                        </div>
                    </main>
                </div>
            </div>
        </div>


        <!-- ----------- feature products ------------ -->
        <div class="small-container">
            <h2 class="title">Feature Products / <a href="product?page=1&&maxPageitem=9">See All <i class="fas fa-arrow-right"></i></a></h2>
            <div class="row">
                <c:forEach var="item" items="${items}" varStatus="loop">
                    <c:if test="${loop.index < 4}">
                        <div class="col-4">
                            <a href="/product-detail?productId=${item.productId}"><img src="<c:url value='${item.image}'/>" alt=""></a>
                            <a href="/product-detail?productId=${item.productId}">
                                <h4>${item.productName}</h4>
                            </a>
                            <c:url value="/add-to-cart?productId=${item.productId}" var="addToCart"/>
                            <h4>$${item.price} <a href="${addToCart}"><i class="fad fa-cart-plus"></i></a></h4>
                           
                        </div>
                    </c:if>
                </c:forEach>
            </div>
            <h2 class="title">Latest Products</h2>
            <div class="row">
                <c:forEach var="item" items="${items}" varStatus="loop">
                    <c:if test="${loop.index < 8 }">
                        <%--<c:if test="${item.productId <=10}">--%>
                        <div class="col-4">
                            <a href="/product-detail?productId=${item.productId}"><img src="<c:url value='${item.image}'/>" alt=""></a>
                            <a href="/product-detail?productId=${item.productId}">
                                <h4>${item.productName}</h4>
                            </a>
                                <c:url value="/add-to-cart?productId=${item.productId}" var="addToCart"/>
                            <h4>$${item.price} <a href="${addToCart}"><i class="fad fa-cart-plus"></i></a></h4>
                        </div>
                        <%--</c:if>--%>
                    </c:if>
                </c:forEach>

            </div>
        </div>
        <!-- ----------- offer ----------- -->
        <div class="offer">
            <div class="small-container">
                <div class="row">
                    <div class="col-2">
                        <img src="<c:url value='/template/web/images2/air-jordan-1-mid-apricot-orange-terra-blush.png'/>" class="offer-img">
                    </div>
                    <div class="col-2 color-news">
                        <p>Exclusive Available on Sneaker</p>
                        <h1>Air Jordan 1 Mid</h1>
                        <small>This is one of the most expensive mid-sized shoes to date. Inspired by autumn flavors, Apricot Orange
                            is expected to be the perfect choice for sweet girl.
                        </small>
                        <div>
                        </div>
                        <a href="/product-detail?productId=31" class="btn">Buy Now &#8594</a>
                    </div>
                </div>
            </div>
        </div>
       
        <!-- ----------- brands ----------- -->
        <div class="brands">
            <div class="small-container">
                <h2 class="title">Popular Brand</h2>
                <div class="row">
                    <div class="col-5">
                        <!-- <img src="images/logo-godrej.png"> -->
                        <a href="cooperate"><img src="<c:url value='/template/web/images2/logo-nike.png'/>"></a>
                    </div>
                    <div class="col-5">
                        <a href="cooperate"><img src="<c:url value='/template/web/images2/logo-adidas.png'/>"></a>
                    </div>
                    <div class="col-5">
                        <a href="cooperate"><img src="<c:url value='/template/web/images2/air-jordan-logo-black.png'/>"></a>
                    </div>
                    <div class="col-5">
                        <a href="cooperate"><img src="<c:url value='/template/web/images2/logo-lv.png'/>"></a>
                    </div>
                    
                </div>
            </div>
        </div>
    </body>
</html>
