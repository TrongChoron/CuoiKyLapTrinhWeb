package com.myshop.controller.Cart;

import com.myshop.model.OrderDetailsModel;
import com.myshop.model.OrderItemsModel;
import com.myshop.model.ProductModel;
import com.myshop.service.IProductService;
import com.myshop.service.impl.ProductService;
import com.myshop.utils.SessionUtil;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author asus
 */
@WebServlet(name = "AddToCartController", urlPatterns = {"/add-to-cart"})
public class AddToCartController extends HttpServlet {

    private IProductService productService;

    public AddToCartController() {
        this.productService = new ProductService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer quantity = 1;
        Integer id;
        if (request.getParameter("productId") != null) {
            id = Integer.parseInt(request.getParameter("productId"));
            ProductModel productModel = productService.findByID(id);
            if (productModel != null) {
                if (request.getParameter("quantity") != null) {
                    quantity = Integer.parseInt(request.getParameter("quantity"));
                }
                HttpSession session = request.getSession();
                if (session.getAttribute("order") == null) {
                    BigDecimal total = new BigDecimal("0");
                    OrderDetailsModel order = new OrderDetailsModel();
                    List<OrderItemsModel> listItems = new ArrayList<OrderItemsModel>();
                    OrderItemsModel item = new OrderItemsModel();
                    item.setQuantity(quantity);
                    item.setProduct(productModel);
                    listItems.add(item);
                    order.setOrderItemsList(listItems);
                    BigDecimal j = new BigDecimal(quantity);
                    order.setTotal((total.add(productModel.getPrice())).multiply(j));
                    session.setAttribute("order", order);
                } else {
                    OrderDetailsModel order = (OrderDetailsModel) session.getAttribute("order");
                    List<OrderItemsModel> listItems = order.getOrderItemsList();
                    boolean check = false;
                    for (OrderItemsModel item : listItems) {
                        if (item.getProduct().getProductId() == productModel.getProductId()) {
                            BigDecimal total = new BigDecimal("0");
                            BigDecimal j = new BigDecimal(quantity);
                            item.setQuantity(item.getQuantity() + quantity);
                            order.setTotal(order.getTotal().add(productModel.getPrice().multiply(j)));
                            check = true;
                        }
                    }
                    if (check == false) {
                        OrderItemsModel item1 = new OrderItemsModel();
                        item1.setQuantity(quantity);
                        item1.setProduct(productModel);
                        listItems.add(item1);
                        BigDecimal j = new BigDecimal(quantity);
                        order.setTotal(order.getTotal().add(productModel.getPrice().multiply(j)));
                    }
                    session.setAttribute("order", order);
                }
            }
            response.sendRedirect(request.getContextPath() + "/cart");
        } else {
            response.sendRedirect(request.getContextPath() + "/trang-chu");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
