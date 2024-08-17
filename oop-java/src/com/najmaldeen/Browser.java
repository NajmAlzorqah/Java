package com.najmaldeen;

public class Browser {

    /**
     * this function navigate to the ip address
     * @param address
     */
    public void navigate(String address){
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address ) {
        return "127.0.0.1";
    }


}
