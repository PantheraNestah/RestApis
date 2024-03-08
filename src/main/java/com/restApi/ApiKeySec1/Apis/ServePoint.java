package com.restApi.ApiKeySec1.Apis;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServePoint {
    @RequestMapping("/api")
    public String servingPoint() {
        return ("Hello user");
    }
}
