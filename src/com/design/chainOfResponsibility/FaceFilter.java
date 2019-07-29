package com.design.chainOfResponsibility;

public class FaceFilter implements Filter{
    @Override
    public void doFilter(Message message) {
        message.setName(message.getName().replace(":)","^V^"));
    }
}
