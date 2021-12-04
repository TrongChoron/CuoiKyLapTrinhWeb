<%@include file="/common/taglib.jsp" %>
<header class="navbar navbar-product">
    <div class="logo">
        <a href="/index.html"><img src="<c:url value='/template/web/images2/logo.png'/>" width="90px" alt="" /></a>
    </div>
    <nav>
      <ul id="MenuItems">
        <li><a href="trang-chu">Home</a></li>
        <li><a href="<c:url value='/product?page=1&maxPageItem=9'/>">Product</a></li>
        <li><a href="about">About</a></li>
        <li><a href="cooperate">Cooperate</a></li>
          <c:if test="${not empty USERMODEL}">
                <li class="nav-item">
                    <a class="nav-link" href='<c:url value="/update-profile"/>'>Wellcome, ${USERMODEL.lastName}</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href='<c:url value="/thoat?action=logout"/>'>Logout</a>
                </li>
            </c:if>
            <c:if test="${empty USERMODEL}">
                <li><a href='<c:url value="/login-dang-nhap?action=login"/>'>Login</a></li>
                </c:if>
      </ul>
    </nav>
        <a href="cart"><img src="<c:url value='/template/web/images/cart.png'/>" width="30px" height="30px" class="Cart-icon" alt="Cart"></a>
        <img src="<c:url value='/template/web/images/menu.png'/>" width="30px" height="30px" class="menu-icon" onclick="menutoggle()">
  </header>