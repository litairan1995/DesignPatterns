package com.design.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class ChainFilter implements Filter {
    List<Filter> filters = new ArrayList<>();

    public ChainFilter add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public void doFilter(Message message) {
        for (Filter filter : filters) {
            filter.doFilter(message);
        }
    }
}
