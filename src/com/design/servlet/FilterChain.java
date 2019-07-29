package com.design.servlet;

public class FilterChain implements ServletFilter {
    @Override
    public boolean doFilter(Request request, Response response) {
        return false;
    }
}
