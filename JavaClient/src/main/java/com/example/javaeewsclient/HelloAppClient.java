package com.example.javaeewsclient;

import com.tamer.HelloService;
import javax.xml.ws.WebServiceRef;

public class HelloAppClient {
    @WebServiceRef(wsdlLocation =
            "http://localhost:8080/helloservice-war/HelloService?WSDL")
    private static HelloService service;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sayHello("world"));
    }

    private static String sayHello(java.lang.String arg0) {
        com.tamer.Hello port =
                service.getHelloPort();
        return port.sayHello(arg0);
    }
}
