<%-- 
    Document   : cart
    Created on : Dec 3, 2021, 10:46:29 PM
    Author     : asus
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>H & T | Cart</title>
        <style>
            .header-cart {
                height: 100px;
                /* align-items: flex-start; */
                align-items: center;
                color: #1a202c;
                display: flex;
                flex-direction: column;
                justify-content: center;
                /* line-height:24px; */
                margin: 0px 174.6px;
                /* padding: 127px 15px 15px 0px; */
            }
            .center-alert{
                width: 30%;
                /*border: 3px solid green;*/
                padding: 10px;
                margin: 0 auto 36px;
                text-align: center;
            }
            .btn-checkout {
                display: inline-block;
                background: #ff523b;
                color: #fff;
                padding: 8px 30px;
                margin: 30px 0px;
                margin-left: 780px;
                border-radius: 30px;
                transition: background 0.5s;
            }
            .button {
                --background: #ff523b;
                --text: #fff;
                --cart: #fff;
                --tick: var(--background);
                position: relative;
                border: none;
                background: none;
                padding: 8px 28px;
                border-radius: 8px;
                -webkit-appearance: none;
                -webkit-tap-highlight-color: transparent;
                -webkit-mask-image: -webkit-radial-gradient(white, black);
                overflow: hidden;
                cursor: pointer;
                text-align: center;
                min-width: 144px;
                color: var(--text);
                background: var(--background);
                transform: scale(var(--scale, 1));
                transition: transform 0.4s cubic-bezier(0.36, 1.01, 0.32, 1.27);
                margin-left: 770px;
                margin-top: 20px;
            }
            .button:active {
                --scale: 0.95;
            }
            .button span {
                font-size: 14px;
                font-weight: 500;
                display: block;
                position: relative;
                padding-left: 24px;
                margin-left: -8px;
                line-height: 26px;
                transform: translateY(var(--span-y, 0));
                transition: transform 0.7s ease;
            }
            .button span:before, .button span:after {
                content: "";
                width: var(--w, 2px);
                height: var(--h, 14px);
                border-radius: 1px;
                position: absolute;
                left: var(--l, 8px);
                top: var(--t, 6px);
                background: currentColor;
                transform: scale(0.75) rotate(var(--icon-r, 0deg)) translateY(var(--icon-y, 0));
                transition: transform 0.65s ease 0.05s;
            }
            .button span:after {
                --w: 14px;
                --h: 2px;
                --l: 2px;
                --t: 12px;
            }
            .button .cart {
                position: absolute;
                left: 50%;
                top: 50%;
                margin: -13px 0 0 -18px;
                transform-origin: 12px 23px;
                transform: translateX(-120px) rotate(-18deg);
            }
            .button .cart:before, .button .cart:after {
                content: "";
                position: absolute;
            }
            .button .cart:before {
                width: 6px;
                height: 6px;
                border-radius: 50%;
                box-shadow: inset 0 0 0 2px var(--cart);
                bottom: 0;
                left: 9px;
                filter: drop-shadow(11px 0 0 var(--cart));
            }
            .button .cart:after {
                width: 16px;
                height: 9px;
                background: var(--cart);
                left: 9px;
                bottom: 7px;
                transform-origin: 50% 100%;
                transform: perspective(4px) rotateX(-6deg) scaleY(var(--fill, 0));
                transition: transform 1.2s ease var(--fill-d);
            }
            .button .cart svg {
                z-index: 1;
                width: 36px;
                height: 26px;
                display: block;
                position: relative;
                fill: none;
                stroke: var(--cart);
                stroke-width: 2px;
                stroke-linecap: round;
                stroke-linejoin: round;
            }
            .button .cart svg polyline:last-child {
                stroke: var(--tick);
                stroke-dasharray: 10px;
                stroke-dashoffset: var(--offset, 10px);
                transition: stroke-dashoffset 0.4s ease var(--offset-d);
            }
            .button.loading {
                --scale: 0.95;
                --span-y: -32px;
                --icon-r: 180deg;
                --fill: 1;
                --fill-d: 0.8s;
                --offset: 0;
                --offset-d: 1.73s;
            }
            .button.loading .cart {
                animation: cart 3.4s linear forwards 0.2s;
            }

            @keyframes cart {
                12.5% {
                    transform: translateX(-60px) rotate(-18deg);
                }
                25%, 45%, 55%, 75% {
                    transform: none;
                }
                50% {
                    transform: scale(0.9);
                }
                44%, 56% {
                    transform-origin: 12px 23px;
                }
                45%, 55% {
                    transform-origin: 50% 50%;
                }
                87.5% {
                    transform: translateX(70px) rotate(-18deg);
                }
                100% {
                    transform: translateX(140px) rotate(-18deg);
                }
            }

            /*# sourceMappingURL=style.css.map */

        </style>
    </head>
    <body>
        <!-------cart items details------------>
        <div class="header-cart">
        </div>

        <div class="small-container cart-page">
            <table>
                <tr>
                    <th>Product</th>
                    <th>Quantity</th>
                    <th>Sale</th>
                    <th>Subtotal</th>
                </tr>
                <c:forEach var="item" items="${order.orderItemsList}">
                    <tr>
                        <td>
                            <div class="cart-info">
                                <a href="/product-detail?productId=${item.product.productId}"><img src="<c:url value='${item.product.image}' />"></a>
                                <div>
                                    <p>${item.product.productName}</p>
                                    <small>Price: $${item.product.price}</small><br>
                                    <a href="">Remove</a>
                                </div>
                            </div>
                        </td>
                        <td>${item.quantity}</td>
                        <td>${item.product.discount.discountName}</td>
                        <td>$<fmt:formatNumber type="number" value="${item.product.price * item.quantity}"/></td>
                    </tr>
                </c:forEach>

            </table>


            <div class="total-price">
                <table>
                    <tr>
                        <td>Subtotal</td>
                        <td>$<fmt:formatNumber type="number" value="${order.total}"/></td>
                    </tr>

                    <tr>
                        <td>Total</td>
                        <td>$<fmt:formatNumber type="number" value="${order.total}"/></td>
                    </tr>
                </table>
            </div>
            <form action="/check-out" method="get">
                <button class="button" type="submit">
                    <span>Check Out</span>
                    <div class="cart">
                        <svg viewBox="0 0 36 26">
                        <polyline points="1 2.5 6 2.5 10 18.5 25.5 18.5 28.5 7.5 7.5 7.5"></polyline>
                        <polyline points="15 13.5 17 15.5 22 10.5"></polyline>
                        </svg>
                    </div>
                </button>
            </form>
        </div>
        <c:if test="${not empty messageResponse}">
            <div class="alert alert-info alert-${alert} center-alert" ">
                <a class="panel-close close" data-dismiss="alert">×</a>
                <i class="fa fa-coffee"></i>
                ${messageResponse}
            </div>
        </c:if>
        <script>
            // button checkout
//            document.querySelectorAll('.button').forEach(button => button.addEventListener('click', e => {
//                    if (!button.classList.contains('loading')) {
//
//                        button.classList.add('loading');
//
//                        setTimeout(() => button.classList.remove('loading'), 3700);
//
//                    }
//                    e.preventDefault();
//                }));
        </script>
    </body>
</html>
