package com.flexy.controller;

import com.flexy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.flexy.service.ProductServiceImpl;

@Controller
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @RequestMapping(path = "/products/{productId}", method = RequestMethod.GET)
    public @ResponseBody Product getProduct(@PathVariable String productId) {
        Product product = productService.getProduct(productId);
        return product;
    }

    @RequestMapping(path = "/products", method = RequestMethod.POST)
    public @ResponseBody Product createProduct(@RequestBody Product product) {
        Product productResponse = productService.createProduct(product);
        return productResponse;
    }

}
