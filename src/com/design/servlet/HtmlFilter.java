package com.design.servlet;

public class HtmlFilter implements ServletFilter{
    @Override
    public boolean doFilter(Request request, Response response) {
        return false;
    }
}
