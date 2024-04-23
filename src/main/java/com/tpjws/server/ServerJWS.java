package com.tpjws.server;

import com.tpjws.ws.BanqueService;
import jakarta.xml.ws.Endpoint;



public class ServerJWS {
    public static void main(String[] args) {
        String url= "http://localhost:8080/tpjws/services";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Service BanqueService publie sur "+url);
    }
}
