package com.ecommerce.platform.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by sepulrator on 28.05.2017.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public Object getCurrentNotificationsSettings(Principal principal) {
        return "asd";
    }

}
