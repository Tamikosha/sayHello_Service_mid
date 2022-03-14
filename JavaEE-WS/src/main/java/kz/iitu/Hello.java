package kz.iitu;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class Hello {

    private final String message = "Hello, ";

    public Hello() {
    }

    @WebMethod
    public String sayHello(String name) {
        return message + name + ".";
    }

}
