package com.design.servlet;

import com.design.chainOfResponsibility.Filter;
import com.design.chainOfResponsibility.Message;

public class SensitivityFilter implements ServletFilter {

    @Override
    public boolean doFilter(Request request, Response response) {
        return false;
    }
}
