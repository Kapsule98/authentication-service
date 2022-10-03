package com.pickart;

import io.micronaut.http.annotation.*;

@Controller("/authenticationService")
public class AuthenticationServiceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}