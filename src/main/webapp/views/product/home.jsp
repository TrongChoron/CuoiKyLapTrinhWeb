<%-- 
    Document   : home
    Created on : Nov 14, 2021, 12:55:09 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products</title>
    </head>
    <body>
        <!--------All products-------->
        <div class="header-product">
            <div class="header">
                <div class="container-product">
                    <div class="row">
                        <div class="col-2">
                            <div class="color-news">
                                <h1>Sneakers</h1>
                                <p>On H&T, every sneaker you want is always <b>available</b>. Buy new sneakers &
                                    shoes from Air Jordan, adidas, Nike, Yeezy and more!
                            </div>
                        </div>
                        <div class="col-2">
                            <!-- <img src="/images/image1.png" alt=""> -->
                            <img src="<c:url value='/template/web/images2/background-product.png'/>">
                        </div>
                        <main class="container-btn">
                            <div class="toggle-container-product">
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
        </div>



        <form action="<c:url value="/product"/>" id="formsubmit" method="get">                       
            <div class="small-container">
                <div class="row row-2">
                    <div class="col-3"><h2>All Products</h2></div>
                    <div class="col-3" style=" border-style: solid;  border-color: coral;text-align:center;">
                        <a href="<c:url value='/product?page=1&maxPageItem=9'/>">
                            <h4>Sort by high price</h4>
                        </a>
                    </div>
                    <div class="col-3" style=" border-style: solid;  border-color: coral;text-align:center;">
                        <a href="<c:url value='/product?page=1&maxPageItem=9'/>">
                            <h4>Sort by low price</h4>
                        </a>
                    </div>
                    <!--                    <select>
                                            <option>Default</option>
                                            <option>Sort by high price</option>
                                            <option>Sort by low price</option>                       
                                        </select>-->
                </div>
                <div class="row">
                    <c:forEach var="item" items="${model.listResult}">
                        <div class="col-3" style="border-color: #333;">
                            <a href="/product-detail?productId=${item.productId}"><img src="<c:url value='${item.image}'/>" alt=""></a>
                            <a href="/product-detail?productId=${item.productId}">
                                <h4>${item.productName}</h4>
                            </a>
                            <!--                        <div class="rating">
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fas fa-star-half-alt"></i>
                                                    </div>-->
                            <h4>$${item.price}</h4>
                        </div>
                    </c:forEach>
                </div>

                <ul class="pagination" id="pagination" style="border-radius: 30px;display: flex;margin: 0 auto 0;"></ul>
                <input type="hidden" value="" id="page" name="page"/>
                <input type="hidden" value="" id="maxPageItem" name="maxPageItem"/>
                <!--<input type="hidden" value="" id="sortName" name="sortName"/>-->
                <!--<input type="hidden" value="" id="sortBy" name="sortBy"/>-->

            </div>

        </form>
        <script>
            var totalPage = ${model.totalPage};
            var currentPage = ${model.page};
            var limit = 9;
            $(function () {
                window.pagObj = $('#pagination').twbsPagination({
                    totalPages: totalPage,
                    visiblePages: 4,
                    startPage: currentPage,
                    onPageClick: function (event, page) {
                        if (currentPage != page) {
                            $('#maxPageItem').val(limit);
                            $('#page').val(page);
                            $('#formsubmit').submit();
                        }

                    }
                });
            });
        </script>
    </body>
</html>
