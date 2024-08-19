package com.fabricadecoduri.shop_online.controller;

import com.fabricadecoduri.shop_online.model.Product;
import com.fabricadecoduri.shop_online.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {

    @Autowired
    private ProductService productService;

    @PutMapping("/product/{productId}/add")
    public void addSpecificProduct(@PathVariable long productId){
        //TODO Create new method in service that will increment the values by one from product quantity.
        productService.addSpecificProduct(productId);
    }

    @PutMapping("/product/{productId}/buy")
    public double addProductToCart(@PathVariable long id, Product product) {
        //TODO Create new method in service that will descriment the values by one from product quantity and will return the price
        return productService.buyProduct(id,product);
    }
}
