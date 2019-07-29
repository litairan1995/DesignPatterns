package com.design.chainOfResponsibility;

public class SensitivityFilter implements Filter {

    @Override
    public void doFilter(Message message) {
        message.setMessage(message.getMessage().replace("996", "955"));
    }
}
