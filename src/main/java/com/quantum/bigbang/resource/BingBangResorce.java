package com.quantum.BigBang;

import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;

@Controller
public class BingBangResorce {

    @GET
    public String myfirstEndpoint() {
        return "Bart is awsome";
    }

}
