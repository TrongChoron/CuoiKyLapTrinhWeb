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




  <div class="small-container">
    <div class="row row-2">
      <h2>All Products</h2>
      <select>
        <option>Default</option>
        <option>Sort by high price</option>
        <option>Sort by low price</option>
        <option>Sort by multiple choice</option>
      </select>
    </div>
    <div class="row">
      <div class="col-4">
          <a href="/product-details.html"><img src="<c:url value='/template/web/images/product-5.jpg'/>" alt=""></a>
        <a href="/product-details.html">
          <h4>Red Printed T-shirt</h4>
        </a>
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
          <i class="far fa-star"></i>
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
          <i class="far fa-star"></i>
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
    <div class="page-btn">
      <span>1</span>
      <span>2</span>
      <span>3</span>
      <span>4</span>
      <span>&#8594;</span>
    </div>
  </div>
    </body>
</html>
