package com.design.chainOfResponsibility;

public class HTMLFilter implements Filter {
    @Override
    public void doFilter(Message message) {
        message.setName(message.getName().replace("<", "["));
        message.setName(message.getName().replace(">", "]"));
    }
}
