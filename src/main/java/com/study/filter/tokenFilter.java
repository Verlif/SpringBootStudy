package com.study.filter;

import com.study.utils.JwtUtils;
import io.jsonwebtoken.Claims;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class tokenFilter implements Filter {

    private static final String TOKEN_NAME = "ClientToken";
    private static final String USER_ID_IN_TOKEN = "userId";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;

        if (req.getHeader(TOKEN_NAME) != null) {

            //获取request请求头中的token
            String token = req.getHeaders(TOKEN_NAME).nextElement();
            Claims claims = JwtUtils.parseJWT(token);

            if (claims != null) {
                String userId = (String) claims.get(USER_ID_IN_TOKEN);
                req.setAttribute(USER_ID_IN_TOKEN, userId);
                chain.doFilter(req, response);
            }
        }
    }
}
