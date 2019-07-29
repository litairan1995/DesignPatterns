package com.design.servlet.v1;

public class HtmlFilter implements ServletFilter {
    @Override
    public boolean doFilter(Request request, Response response) {
        request.str = request.str.replaceAll("<", "[")
                .replaceAll(">", "]");
        response.str += "--HtmlFilter()";
        return true;
    }
}
