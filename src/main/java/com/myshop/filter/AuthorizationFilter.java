/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.filter;

import com.myshop.constant.WebConstant;
import com.myshop.model.UsersModel;
import com.myshop.utils.SessionUtil;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author asus
 */
public class AuthorizationFilter implements Filter {

    private ServletContext context;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.context = filterConfig.getServletContext();
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String url = request.getRequestURI();
        if (url.startsWith("/admin")) {
            UsersModel user = (UsersModel) SessionUtil.getInstance().getValue(request, "USERMODEL");
            if (user != null) {
                if (user.getRoleModel().getRoleName().equals(WebConstant.ROLE_ADMIN)) {
                    filterChain.doFilter(servletRequest, servletResponse);
                } else if (user.getRoleModel().getRoleName().equals(WebConstant.ROLE_USER)) {
//                    response.sendRedirect(request.getContextPath()
//                            + "/dang-nhap?action=login&message=not_permission&alert=warning");
                    response.sendRedirect(request.getContextPath()
                            + "/login-dang-nhap?action=login&messageResponse=not_permission&alert=danger");
                }
            } else {
                response.sendRedirect(
                        request.getContextPath() + "/login-dang-nhap?action=login&messageResponse=not_login&alert=danger");
            }
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {
    }

}
