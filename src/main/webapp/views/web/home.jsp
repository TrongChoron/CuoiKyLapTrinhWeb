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


        <!-- ----------- switch ------------ -->



        <div class="search-box">
            <input class="search-txt" type="text" name="" placeholder="Type to search">
            <a class="search-btn" href="#"><i class="fas fa-search"></i></a>
        </div>

        <!-- ----------- feature categories ------------ -->
        <div class="categories">
            <div class="small-container">
                <div class="row">
                    <div class="col-3">
                        <img src="<c:url value='/template/web/images/category-1.jpg'/>" alt="">
                    </div>
                    <div class="col-3">
                        <img src="<c:url value='/template/web/images/category-2.jpg'/>" alt="">
                    </div>
                    <div class="col-3">
                        <img src="<c:url value='/template/web/images/category-3.jpg'/>" alt="">
                    </div>
                </div>
            </div>
        </div>
        <!-- ----------- feature products ------------ -->
        <div class="small-container">
            <h2 class="title">Feature Products</h2>
            <div class="row">
                <div class="col-4">
                    <img height="124.15px" src="/product-img/Yeezy-500-Brown-Clay.png" alt="">
                    <h4>Yeezy 500 Brown Clay</h4>
                    <div class="rating">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                        <!-- <i class="fal fa-stars"></i> -->
                    </div>
                    <p>$50.00</p>
                </div>
                <div class="col-4">
                    <img src="/product-img/Yeezy-500-Bone-White.PNG" alt="">
                    <h4>Yeezy 500 Bone White</h4>
                    <div class="rating">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                    <p>$50.00</p>
                </div>
                <div class="col-4">
                    <img src="/product-img/Yeezy-500-Taupe-Light.PNG" alt="">
                    <h4>Yeezy 500 Taupe Light</h4>
                    <div class="rating">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fal fa-star"></i>
                    </div>
                    <p>$50.00</p>
                </div>
                <div class="col-4">
                    <img height="124.15px" src="/product-img/Yeezy-500-Enfame.PNG" alt="">
                    <h4>Yeezy 500 Enfame</h4>
                    <div class="rating">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="far fa-star "></i>
                    </div>
                    <p>$50.00</p>
                </div>
            </div>
            <h2 class="title">Latest Products</h2>
            <div class="row">
                <div class="col-4">
                    <img src="<c:url value='/template/web/images/product-5.jpg'/>" alt="">
                    <h4>Red Printed T-shirt</h4>
                    <div class="rating">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                    <p>$50.00</p>
                </div>
                <div class="col-4">
                    <img src="<c:url value='/template/web/images/product-6.jpg'/>" alt="">
                    <h4>Red Printed T-shirt</h4>
                    <div class="rating">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                    <p>$50.00</p>
                </div>
                <div class="col-4">
                    <img src="<c:url value='/template/web/images/product-7.jpg'/>" alt="">
                    <h4>Red Printed T-shirt</h4>
                    <div class="rating">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fal fa-star"></i>
                    </div>
                    <p>$50.00</p>
                </div>
                <div class="col-4">
                    <img src="<c:url value='/template/web/images/product-8.jpg'/>" alt="">
                    <h4>Red Printed T-shirt</h4>
                    <div class="rating">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="far fa-star "></i>
                    </div>
                    <p>$50.00</p>
                </div>

                <div class="col-4">
                    <img src="<c:url value='/template/web/images/product-9.jpg'/>" alt="">
                    <h4>Red Printed T-shirt</h4>
                    <div class="rating">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                    <p>$50.00</p>
                </div>
                <div class="col-4">
                    <img src="<c:url value='/template/web/images/product-10.jpg'/>" alt="">
                    <h4>Red Printed T-shirt</h4>
                    <div class="rating">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                    <p>$50.00</p>
                </div>
                <div class="col-4">
                    <img src="<c:url value='/template/web/images/product-11.jpg'/>" alt="">
                    <h4>Red Printed T-shirt</h4>
                    <div class="rating">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fal fa-star"></i>
                    </div>
                    <p>$50.00</p>
                </div>
                <div class="col-4">
                    <img src="<c:url value='/template/web/images/product-12.jpg'/>" alt="">
                    <h4>Red Printed T-shirt</h4>
                    <div class="rating">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="far fa-star "></i>
                    </div>
                    <p>$50.00</p>
                </div>
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
                        <a href="product-details.html" class="btn">Buy Now &#8594</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- ----------- testimonial ----------- -->
        <div class="testimonial">
            <div class="small-container">
                <div class="row">
                    <div class="col-3">
                        <i class="fa fa-quote-left icon-quote"></i>
                        <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Et laborum maiores asperiores iste obcaecati
                            accusamus cumque? Natus voluptas at praesentium accusantium? Enim hic, mollitia reprehenderit voluptas
                            voluptatem commodi quaerat sit!</p>
                        <div class="rating">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="far fa-star "></i>
                        </div>
                        <img src="<c:url value='/template/web/images/user-1.png'/>">
                        <h3>Thanh Trong</h3>
                    </div>
                    <div class="col-3">
                        <i class="fa fa-quote-left icon-quote"></i>
                        <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Et laborum maiores asperiores iste obcaecati
                            accusamus cumque? Natus voluptas at praesentium accusantium? Enim hic, mollitia reprehenderit voluptas
                            voluptatem commodi quaerat sit!</p>
                        <div class="rating">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="far fa-star "></i>
                        </div>
                        <img src="images/user-2.png">
                        <h3>Hoang Huy</h3>
                    </div>
                    <div class="col-3">
                        <i class="fa fa-quote-left icon-quote"></i>
                        <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Et laborum maiores asperiores iste obcaecati
                            accusamus cumque? Natus voluptas at praesentium accusantium? Enim hic, mollitia reprehenderit voluptas
                            voluptatem commodi quaerat sit!</p>
                        <div class="rating">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="far fa-star "></i>
                        </div>
                        <img src="<c:url value='/template/web/images/user-3.png'/>">
                        <h3>Nhat Tam</h3>
                    </div>
                </div>
            </div>
        </div>
        <!-- ----------- brands ----------- -->
        <div class="brands">
            <div class="small-container">
                <div class="row">
                    <div class="col-5">
                        <!-- <img src="images/logo-godrej.png"> -->
                        <img src="<c:url value='/template/web/images2/logo-nike.png'/>">
                    </div>
                    <div class="col-5">
                        <!-- <img src="images/logo-oppo.png"> -->
                        <img src="<c:url value='/template/web/images2/logo-adidas.png'/>">
                    </div>
                    <div class="col-5">
                        <!-- <img src="images/logo-coca-cola.png"> -->
                        <img src="<c:url value='/template/web/images2/air-jordan-logo-black.png'/>">
                    </div>
                    <div class="col-5">
                        <img src="<c:url value='/template/web/images/logo-paypal.png'/>">
                    </div>
                    <!-- <div class="col-5">
                      <img src="images/logo-philips.png">
                    </div> -->
                </div>
            </div>
        </div>
    </body>
</html>