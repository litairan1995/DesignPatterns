package com.design.servlet.v1;

public class SensitivityFilter implements ServletFilter {

    @Override
    public boolean doFilter(Request request, Response response) {
        request.str = request.str.replaceAll("996", "955");
        response.str += "--SensitivityFilter()";
        return true;
    }
}
