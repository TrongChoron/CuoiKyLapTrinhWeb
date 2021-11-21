<%@include file="/common/taglib.jsp" %>
<header class="navbar navbar-product">
    <div class="logo">
        <a href="/index.html"><img src="<c:url value='/template/web/images2/logo.png'/>" width="90px" alt="" /></a>
    </div>
    <nav>
      <ul id="MenuItems">
        <li><a href="trang-chu">Home</a></li>
        <li><a href="product">Product</a></li>
        <li><a href="/about.html">About</a></li>
        <li><a href="/cooperate.html">Cooperate</a></li>
        <li><a href="/login-home">LogIn</a></li>
      </ul>
    </nav>
        <a href=""><img src="<c:url value='/template/web/images/cart.png'/>" width="30px" height="30px" class="Cart-icon" alt="Cart"></a>
        <img src="<c:url value='/template/web/images/menu.png'/>" width="30px" height="30px" class="menu-icon" onclick="menutoggle()">
  </header>