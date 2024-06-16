package com.eazybytes.filter;

import jakarta.servlet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class AuthoritiesLoggingAtFilter implements Filter {
    private final Logger logger = LoggerFactory.getLogger(AuthoritiesLoggingAtFilter.class);
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("Authentication Validation is in Progress");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
