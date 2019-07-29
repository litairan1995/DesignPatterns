package com.design.servlet;

public interface ServletFilter {

    boolean doFilter(Request request, Response response);
}
