package com.design.servlet.v2;

public class Main {

    public static void main(String[] args) {
        Request request = new Request();
        request.str = "大家好:),<script> 欢迎大家访问：mashibing.com 大家都是996";
        Response response = new Response();
        response.str = "";
        HtmlFilter htmlFilter = new HtmlFilter();
        SensitivityFilter sensitivityFilter = new SensitivityFilter();
        FilterChain filterChain = new FilterChain();
        filterChain.add(htmlFilter).add(sensitivityFilter);
        filterChain.doFilter(request, response, filterChain);
        System.out.println(request);
        System.out.println(response);

    }
}
