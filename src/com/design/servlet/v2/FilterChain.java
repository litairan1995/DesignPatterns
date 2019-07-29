package com.design.servlet.v2;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements ServletFilter {

    List<ServletFilter> servletFilters = new ArrayList<>();

    int index = 0;

    public FilterChain add(ServletFilter servletFilter) {
        servletFilters.add(servletFilter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response,
                         FilterChain filterChain) {

        if (index == servletFilters.size()) return;
        ServletFilter sf = servletFilters.get(index);
        index++;
        sf.doFilter(request, response, filterChain);
    }
}
