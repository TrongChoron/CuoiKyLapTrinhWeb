
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
            <div class="row">
                <div class="col-2">
                    <img src="${model.image}" width="100%" id="ProductImg">        
                </div>
                <div class="col-2">
                    <p>Home / ${model.productName}</p>
                    <h1>${model.productName}</h1>
                    <h4>$${model.price}</h4>
                    <select name="size">
                        <option>Select Size</option>
                        <option>36</option>
                        <option>37</option>
                        <option>40</option>
                        <option>41</option>
                        <option>42</option>
                    </select>
                    <input type="number" value="1" name="quantity">
                    <a href="" class="btn">Add To Cart<i class="fal fa-long-arrow-right"></i></a>
                    <h3>Product detail <i class="fa fa-indent "></i></h3><br>
                    <p>${model.description}</p>
                </div>
            </div>
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
                   
                <div class="col-4">
                    <a href="/product-detail?productId=${model.listResult[0].productId}"><img src="${model.listResult[0].image}" alt=""></a>
                    <a href="/product-detail?productId=${model.listResult[0].productId}"><h4>${model.listResult[0].productName}</h4></a>
                   
                    <p>$${model.listResult[0].price}</p>
                </div>  
                
                <div class="col-4">
                    <a href="/product-detail?productId=${model.listResult[1].productId}"><img src="${model.listResult[1].image}" alt=""></a>
                    <a href="/product-detail?productId=${model.listResult[1].productId}"><h4>${model.listResult[1].productName}</h4></a>
                    
                    <p>$${model.listResult[1].price}</p>
                </div>  
                
                <div class="col-4">
                    <a href="/product-detail?productId=${model.listResult[2].productId}"><img src="${model.listResult[2].image}" alt=""></a>
                    <a href="/product-detail?productId=${model.listResult[2].productId}"><h4>${model.listResult[2].productName}</h4></a>
                    
                    <p>$${model.listResult[2].price}</p>
                </div>  
                
                <div class="col-4">
                    <a href="/product-detail?productId=${model.listResult[3].productId}"><img src="${model.listResult[3].image}" alt=""></a>
                    <a href="/product-detail?productId=${model.listResult[3].productId}"><h4>${model.listResult[3].productName}</h4></a>
                    
                    <p>$${model.listResult[3].price}</p>
                </div>  
                
            </div>
        </div>
    </body>
</html>
