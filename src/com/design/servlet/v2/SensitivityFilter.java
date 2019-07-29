package com.design.servlet.v2;

public class SensitivityFilter implements ServletFilter {

    @Override
    public void doFilter(Request request, Response response,
                      FilterChain filterChain) {
        request.str = request.str.replaceAll("996", "955");
        filterChain.doFilter(request, response, filterChain);
        response.str += "--SensitivityFilter()";
    }
}
