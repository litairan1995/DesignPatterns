package com.design.chainOfResponsibility;

public class URLFilter implements Filter {
    @Override
    public void doFilter(Message message) {
        message.setMessage(message.getMessage().replace("mashibing.com", "http" +
                "://www.mashibing.com"));
    }
}
