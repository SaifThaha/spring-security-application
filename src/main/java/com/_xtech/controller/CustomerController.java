package com._xtech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portal")
public class CustomerController {

    @GetMapping("")
    public String getPortal(){
        return "Welcome To Your Portal";
    }

    @GetMapping("/customer")
    public String getCustomerPortal(){
        return "Welcome To The Customer Portal";
    }

    @GetMapping("/admin")
    public String getAdminPortal(){
        return "Welcome To The Admin Portal";
    }
}
