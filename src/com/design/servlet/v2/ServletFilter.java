package com.design.servlet.v2;

public interface ServletFilter {

    void doFilter(Request request, Response response,FilterChain filterChain);
}
