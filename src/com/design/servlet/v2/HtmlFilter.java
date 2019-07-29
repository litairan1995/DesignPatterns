package com.design.servlet.v2;

public class HtmlFilter implements ServletFilter {
    @Override
    public void doFilter(Request request, Response response,
                      FilterChain filterChain) {
        request.str = request.str.replaceAll("<", "[")
                .replaceAll(">", "]");
        filterChain.doFilter(request, response, filterChain);
        response.str += "--HtmlFilter()";
    }
}
