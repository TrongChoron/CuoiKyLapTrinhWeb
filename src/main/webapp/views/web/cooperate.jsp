<%-- 
    Document   : cooperate
    Created on : Nov 29, 2021, 5:10:43 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cooperate</title>
    </head>
    <body>
        <div class="header-coop">
            <div class="container-coop">
                <div class="row">
                    <div class="col-4-coop">
                        <div class="color-news">
                            <div class="flip-card">
                                <div class="flip-card-inner">
                                    <div class="front">
                                        <img src="<c:url value='/template/web/images2/logo-nike.png'/>">
                                    </div>
                                    <div class="back">
                                        <p><b>Formerly</b>&emsp;&emsp;Blue Ribbon Sports<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(1964–1971)</p>
                                        <p><b>Type</b> &emsp;&emsp;&emsp;&ensp;&nbsp; Public </p>
                                        <p><b>Traded as</b>&nbsp;&emsp; NYSE: NKE (Class B)<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp; DJIA component</p>
                                        <p><b>Industry</b>&nbsp;&emsp;&emsp;Apparel<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;Accessories<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp; Sports equipment
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-4-coop">
                        <div class="color-news">
                            <div class="flip-card">
                                <div class="flip-card-inner">
                                    <div class="front">
                                        <img src="<c:url value='/template/web/images2/logo-adidas.png'/>">
                                    </div>
                                    <div class="back">
                                        <p><b>Formerly</b>&emsp;&emsp;Dassler Brothers<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp; Shoe(1924–1949)</p>
                                        <p><b>Type</b> &emsp;&emsp;&emsp;&ensp;&nbsp; Aktiengesellschaft </p>
                                        <p><b>Traded as</b>&nbsp;&emsp; FWB: ADS<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp; DAX Component</p>
                                        <p><b>Industry</b>&nbsp;&emsp;&emsp;Textile<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;Footwear<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp; Sports equipment
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-4-coop">
                        <div class="color-news">
                            <div class="flip-card">
                                <div class="flip-card-inner">
                                    <div class="front">
                                        <img src="<c:url value='/template/web/images2/air-jordan-logo-black.png'/>">
                                    </div>
                                    <div class="back">
                                        <p><b>Formerly</b>&emsp;&emsp;Jordan<br>
                                        <p><b>Owner</b>&emsp;&emsp;&emsp;&nbsp;Nike<br>
                                        <p><b>Type</b> &emsp;&emsp;&emsp;&ensp;&nbsp;Worldwide</p>
                                        <p><b>Industry</b>&nbsp;&emsp;&emsp;Apparel<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;Basketball Shoes<br>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-4-coop">
                        <div class="color-news">
                            <div class="flip-card">
                                <div class="flip-card-inner">
                                    <div class="front">
                                        <img src="<c:url value='/template/web/images2/logo-paypal.png'/>">
                                    </div>
                                    <div class="back">
                                        <p><b>Formerly</b>&emsp;&emsp;Paypal<br>
                                        <p><b>Type</b> &emsp;&emsp;&emsp;&ensp;&nbsp;Public</p>
                                        <p><b>Traded as</b>&nbsp;&emsp; Nasdaq: PYPL<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp; NASDAQ-100<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp; component<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp; S&P 100 component<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp; S&P 500 component<br>
                                        </p>
                                        <p><b>Industry</b>&nbsp;&emsp;&emsp;Financial technology</p>
                                        <p>
                                            <b>Predecessor</b>&nbsp;Confinity<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp; X.com
                                        </p>
                                        <p><b>Founders</b>&emsp;&emsp;Elon Musk<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp; Peter Thiel<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp; Luke Nosek<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp; Max Levchin<br>
                                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp; Yu Pan<br>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
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
    </body>
</html>
