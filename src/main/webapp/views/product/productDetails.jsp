
<%@include file="/common/taglib.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Details</title>
    </head>
    <body>
        <div class="header-product-details">
        </div>
        <div class="small-container single-product">
            <form action="/add-to-cart" method="get">
                <div class="row">
                    <div class="col-2">
                        <img src="${model.image}" width="100%" id="ProductImg">        
                    </div>
                    <div class="col-2">
                        <p>Home / ${model.productName}</p>
                        <h1>${model.productName}</h1>
                        <h4>$<fmt:formatNumber type="number" value="${model.price}"/></h4>
                        <select name="size">
                            <option>Select Size</option>
                            <option>36</option>
                            <option>37</option>
                            <option>40</option>
                            <option>41</option>
                            <option>42</option>
                        </select>
                        <input type="number" value="1" name="quantity">
                        <%--<c:url value="/add-to-cart?productId=${model.productId}" var="addToCart"/>--%>
                        <!--<a href="" type="submit" class="btn">Add To Cart<i class="fal fa-long-arrow-right"></i></a>-->
                        <input type="hidden" value="${model.productId}" name="productId">
                        <button type="submit" class="btn">Add To Cart<i class="fal fa-long-arrow-right"></i></button>
                        <h3>Product detail <i class="fa fa-indent "></i></h3><br>
                        <p>${model.description}</p>
                    </div>
                </div>
            </form>
        </div>
        <!-------- title -------->
        <div class="small-container">
            <div class="row row-2">
                <h2>Related Products</h2>                
            </div>
        </div>
        <!-------- products -------->
        <div class="small-container">

            <div class="row">          
                <c:forEach var="item" items="${model.listResult}" varStatus="loop">
                    <c:if test="${loop.index <4 }">
                        <div class="col-4">
                            <a href="/product-detail?productId=${item.productId}"><img src="${item.image}" alt=""></a>
                            <a href="/product-detail?productId=${item.productId}"><h4>${item.productName}</h4></a>

                            <p>$<fmt:formatNumber type="number" value="${item.price}"/></p>
                        </div> 
                    </c:if>
                </c:forEach>               
            </div>
        </div>
    </body>
</html>
