<%-- 
    Document   : about
    Created on : Nov 29, 2021, 5:18:02 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Us</title>
    </head>
    <body>
        <div class="header-about">
            <div class="container">
                <div class="row">
                    <div class="col-2-about">
                        <div class="color-news">
                            <h1>The Current Culture Marketplace</h1>
                            <p>Our mission is to provide access to the world’s most coveted items in the smartest way possible. Buy and
                                sell the hottest sneakers, apparel, electronics, collectibles, trading cards and accessories.
                                .</p>
                        </div>
                    </div>
                    <div class="col-2-about">
                        <!-- <img src="/images/image1.png" alt=""> -->
                        <img src="<c:url value='/template/web/images2/bg-about.png'/>" alt="">
                    </div>
<!--                    <main class="container-btn">
                        <div class="toggle-container">
                            <p>Click To Change Mode</p>
                            <button class="theme-btn light" onclick="setTheme('light')" title="Light mode">
                                <img src="<c:url value='/template/web/images2/sun.png'/>" alt="sun">
                            </button>
                            <button class="theme-btn dark" onclick="setTheme('dark')" title="Dark mode">
                                <img src="<c:url value='/template/web/images2/moon.png'/>" alt="moon">
                            </button>
                        </div>
                    </main>-->
                </div>
            </div>
        </div>
        <div class="row-2">
            <div class="row">
                <div class="col-3-about center-text">
                    <div class="icon-block__icon">
                        <img src="<c:url value='/template/web/images2/logo-snk.png'/>">
                    </div>
                    <h2>100% Verified Authentic</h3>
                        <p>Every item sold goes through our proprietary multi-step verification process with our team of expert
                            authenticators.</p>
                </div>
                <div class="col-3-about center-text">
                    <div class="icon-block__icon">
                        <img src="<c:url value='/template/web/images2/logo-chart.png'/>">
                    </div>
                    <h2>Transparent Pricing</h2>
                    <p>Our real-time marketplace works just like the stock market – allowing you to buy and sell the most coveted
                        items at their true market price.</p>
                </div>
                <div class="col-3-about center-text">
                    <div class="icon-block__icon">
                        <img src="<c:url value='/template/web/images2/logo-global.png'/>">
                    </div>
                    <h2>Global Access</h1>
                        <p>Whether it’s pre-release, regionally limited, or “sold out” – our millions of customers from over 200+
                            countries allow you to easily secure those hard-to-find, coveted items.</p>
                </div>
            </div>
            <div class="row">
                <div class="col-3-about center-text">
                    <div class="icon-block__icon">
                        <img src="<c:url value='/template/web/images2/logo-noinfo.png'/>">
                    </div>
                    <h2>No BS</h1>
                        <p>No chargebacks, no taking photos, no writing catchy descriptions, and no dealing with rogue buyers or
                            sellers.
                            We handle everything to make sure you can buy and sell with complete confidence.</p>
                </div>
                <div class="col-3-about center-text">
                    <div class="icon-block__icon">
                        <img src="<c:url value='/template/web/images2/logo-secure.png'/>">
                    </div>
                    <h2>Secure</h2>
                    <p>Preserving the integrity of our marketplace means staying a step ahead. Our security and fraud systems,
                        powered
                        by our world class partners, have your personal information covered 24/7.</p>
                </div>
                <div class="col-3-about center-text">
                    <div class="icon-block__icon">
                        <img src="<c:url value='/template/web/images2/logo-csservice.png'/>">
                    </div>
                    <h2>Here For You</h2>
                    <p>Thanks to our Help Center, Chatbot, and dedicated global-support staff, you can be sure that we are always
                        available to answer any and every question regarding our marketplace.</p>
                </div>
            </div>
        </div>
        <div class="container-about">
            <div class="row">
                <div class="col-4">
                    <a href="/product.html" class="shop-categories__item col-3 row">
                        <div class="shop-categories__image">
                            <img class="img-bkg" src="<c:url value='/template/product/product-img/Yeezy-500-Enfame1.PNG'/>" alt="Blue shoe">
                        </div>
                        <div class="box">
                            <span class="box-product">ADIDAS</span>
                        </div>
                    </a>
                </div>
                <div class="col-4">
                    <a href="/product.html" class="shop-categories__item col-3 row">
                        <div class="shop-categories__image">
                            <img class="img-bkg" src="<c:url value='/template/product/product-img/air-jordan-1-mid-apri1.png'/>" alt="Blue shoe">
                        </div>
                        <div class="box">
                            <span class="box-product">JORDAN</span>
                        </div>
                    </a>
                </div>
                <div class="col-4">
                    <a href="/product.html" class="shop-categories__item col-3 row">
                        <div class="shop-categories__image">
                            <img class="img-bkg" src="<c:url value='/template/product/product-img/Nike-Air-Force-1-cafe.png'/>" alt="Blue shoe">
                        </div>
                        <div class="box">
                            <span class="box-product">NIKE</span>
                        </div>
                    </a>
                </div>
            </div>
        </div>
    </body>
</html>
