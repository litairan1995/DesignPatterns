package com.design.servlet.v1;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements ServletFilter {

    List<ServletFilter> servletFilters = new ArrayList<>();

    public FilterChain add(ServletFilter servletFilter) {
        servletFilters.add(servletFilter);
        return this;
    }

    @Override
    public boolean doFilter(Request request, Response response) {

        for (ServletFilter servletFilter : servletFilters) {
            servletFilter.doFilter(request, response);
        }
        return true;
    }
}
