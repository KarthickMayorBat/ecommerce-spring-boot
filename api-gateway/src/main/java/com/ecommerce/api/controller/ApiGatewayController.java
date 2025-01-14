package com.ecommerce.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Home page api for this project..
@RestController
public class ApiGatewayController {

    @GetMapping("/")
    public String homePage() {
        return "<h1>Welcome to the API Gateway</h1><p>Use /api/users or other routes to access services.</p>";
    }
}
